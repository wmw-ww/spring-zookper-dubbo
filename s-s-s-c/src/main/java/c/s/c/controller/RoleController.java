package c.s.c.controller;

import c.s.d.pojo.Auth;
import c.s.d.pojo.Role;
import c.s.d.service.RoleInterfaceService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin
public class RoleController {
    @Reference
    private RoleInterfaceService service;
    @GetMapping("role")
    public List<Role> findAllRole(){
        return service.findAllRole();
    }

    @GetMapping("auth")
    public List<Auth> findAllAuth(){
        System.out.println("1212");
        return service.findAllAuth();
    }

    @PostMapping("aids")
    public List<Integer> findAllAidByRid(@RequestParam Integer[] rid){
        System.out.println("接受到的id值为"+ Arrays.toString(rid));
        return service.findAllAidByRid(1);
    }
}
