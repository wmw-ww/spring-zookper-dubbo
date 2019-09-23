package c.s.d.service;

import c.s.d.pojo.Auth;
import c.s.d.pojo.Role;

import java.util.List;
import java.util.Map;

public interface RoleInterfaceService {
    /**
     * 查询所有的角色
     * @return
     */
    List<Role> findAllRole();

    /**
     * 查询所有的权限
     * @return
     */
    List<Auth> findAllAuth();

    /**
     * 查询当前角色的权限id，进行回显
     * @param rid 角色id
     * @return
     */
    List<Integer> findAllAidByRid(Integer rid);

    void updateRoleToAuth(Map map);
}
