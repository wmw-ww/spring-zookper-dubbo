package c.s.d.dao;

import c.s.d.pojo.Auth;
import c.s.d.pojo.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RoleMapper {

    @Select("SELECT * FROM day18role ")
    List<Role> findAllRole();

/*    @Select("SELECT * FROM day18auth ")*/
    List<Auth> findAllAuth();
    @Select("SELECT aid FROM day18role_auth WHERE rid = #{rid} ")
    List<Integer> findAllAidByRid(Integer rid);

}
