package com.example.peims.mapper;

import com.example.peims.pojo.Check;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CheckMapper {

    /**
     * query all check records.
     *
     * @return {@link List}<{@link com.example.peims.pojo.Check}>
     */
    @Select("select checkt.*, user.User_Name_s as name, ast.As_status_s as `as` " +
            "from checkt, user, ast " +
            "where checkt.PK_FK_Check_Id_nb = user.PK_User_Id_nb " +
            "and checkt.As_id_n = ast.As_id_n")
    @Results(id = "checkMap", value = {
            @Result(column = "PK_Check_Id_n", property = "PK_Check_Id_n"),
            @Result(column = "PK_FK_Check_Id_nb", property = "PK_FK_Check_Id_nb", id = true),
            // 重要：column：关联的外键 property：实体类属性，不是字段，User里面的
            @Result(column = "Check_Date_dt", property = "PK_Check_Date_dt", id = true),
            @Result(column = "As_id_n", property = "As_id_n")
    })
    public List<Check> queryAllChecks();

    /**
     * query a check record by c_id
     *
     * @param cid check id
     * @return {@link com.example.peims.pojo.Check}
     */
    @Select("select checkt.*, user.User_Name_s as name, ast.As_status_s as `as` " +
            "from checkt, user, ast " +
            "where checkt.PK_Check_Id_n = #{cid} " +
            "and checkt.PK_FK_Check_Id_nb = user.PK_User_Id_nb " +
            "and checkt.As_id_n = ast.As_id_n")
    @ResultMap(value = "checkMap")
    public Check queryCheckByCId(@Param("cid") Long cid);

    @Select("select checkt.*, user.User_Name_s as name, ast.As_status_s as `as` " +
            "from checkt, user, ast " +
            "where checkt.PK_FK_Check_Id_nb = user.PK_User_Id_nb " +
            "and checkt.As_id_n = ast.As_id_n " +
            "and user.User_Name_s like concat('%',#{username},'%')")
    @ResultMap(value = "checkMap")
    public List<Check> queryCheckByUsername(@Param("username") String username);

    @Update("update checkt" +
            "set Ad_id_n = #{newCheck.As_id_n} " +
            "where PK_FK_Check_Id_nb = #{newCheck.PK_FK_Check_Id_nb} and Check_Date_dt = #{newCheck.PK_Check_Date_dt}")
    public int updateOneCheck(@Param("newCheck") Check newCheck);

    @Delete("delete from checkt " +
            "where PK_Check_Id_n = #{cid}")
    public int deleteOneCheck(@Param("cid") Long cid);

    /**
     * insert one check record.
     *
     * @param check check object
     * @return The number of the row affected.
     */
    @Insert("insert into checkt(PK_FK_Check_Id_nb, Check_Date_dt, As_id_n) " +
            "values(#{check.PK_FK_Check_Id_nb}, now(), #{check.As_id_n})")
    public int insertOneCheck(@Param("check") Check check);
}
