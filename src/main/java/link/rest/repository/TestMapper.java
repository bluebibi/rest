package link.rest.repository;


import link.rest.domain.Test;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

//wsc.sql
public interface TestMapper {

    @Select("SELECT * FROM TEST WHERE ID = #{id}")
    Test findOne(@Param("id") int id);

}
