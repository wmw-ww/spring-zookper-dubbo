package c.s.d.service.impl;

import c.s.d.dao.RoleMapper;
import c.s.d.pojo.Auth;
import c.s.d.pojo.Role;
import c.s.d.service.RoleInterfaceService;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

@Service
public class RoleInterfaceServiceImpl implements RoleInterfaceService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> findAllRole() {
        PageHelper.startPage(1, 1);
        List<Role> allRole = roleMapper.findAllRole();
        PageInfo<Role> rolePageInfo = new PageInfo<>(allRole);
        List<Role> list = rolePageInfo.getList();
        System.out.println(rolePageInfo.getEndRow());
        System.out.println(rolePageInfo.getTotal());
        System.out.println(rolePageInfo.getPageNum());
        System.out.println(rolePageInfo.getNextPage());
        return allRole;
    }

    @Override
    public List<Auth> findAllAuth() {
        return roleMapper.findAllAuth();
    }

    @Override
    public List<Integer> findAllAidByRid(Integer rid) {
        System.out.println(rid+"asdafasf");
        return roleMapper.findAllAidByRid(rid);
    }

    @Override
    public void updateRoleToAuth(Map map) {

    }
}
