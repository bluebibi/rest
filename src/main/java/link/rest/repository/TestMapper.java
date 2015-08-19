package link.rest.repository;


import link.rest.domain.Test;
import org.apache.ibatis.annotations.*;

//wsc.sql
public interface TestMapper {
    @Insert("INSERT INTO TEST (TEXT) VALUES (#{text})")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = int.class)
    void insert(Test test);

    @Update("UPDATE TEST SET TEXT = #{text} WHERE ID = #{id}")
    void update(Test test);

    @Select("SELECT * FROM TEST WHERE ID = #{id}")
    Test findOne(@Param("id") int id);

    @Delete("DELETE FROM TEST WHERE ID = #{id}")
    void delete(@Param("id") int id);

}
