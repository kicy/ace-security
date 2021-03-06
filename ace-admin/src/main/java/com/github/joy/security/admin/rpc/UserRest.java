/*
 * 文 件 名:  UserRest.java
 * 版    权:  SSSCC Technologies Co., Ltd. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  
 * 修改时间:  2018年1月6日
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.github.joy.security.admin.rpc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ace.cache.annotation.Cache;
import com.github.joy.security.admin.rpc.service.PermissionService;
import com.github.joy.security.api.vo.authority.PermissionInfo;
import com.github.joy.security.api.vo.user.UserInfo;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2018年1月6日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
@RestController
@RequestMapping("api")
public class UserRest
{
    @Autowired
    private PermissionService permissionService;
    
    @PostMapping(value="/user/validate")
    public @ResponseBody UserInfo validate(String username, String password){
        return permissionService.validate(username, password);
    }
    
    @Cache(key="permission")
    @GetMapping(value="/permissions")
    public @ResponseBody List<PermissionInfo> getAllPermission(){
        return permissionService.getAllPermission();
    }
    
    @Cache(key="permission:u{1}")
    @GetMapping(value="/user/{username}/permissions")
    public @ResponseBody List<PermissionInfo> getPermissionByUsername(@PathVariable("username") String username){
        return permissionService.getPermissionByUsername(username);
    }
}
