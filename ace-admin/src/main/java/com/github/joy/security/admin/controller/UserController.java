/*
 * 文 件 名:  UserController.java
 * 版    权:  SSSCC Technologies Co., Ltd. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  
 * 修改时间:  2018年1月9日
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.github.joy.security.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.joy.security.admin.biz.UserBiz;
import com.github.joy.security.admin.common.controller.BaseController;
import com.github.joy.security.admin.entity.User;
import com.github.joy.security.admin.rpc.service.PermissionService;
import com.github.joy.security.admin.vo.FrontUser;
import com.github.joy.security.admin.vo.MenuTree;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2018年1月9日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
@RestController
@RequestMapping("user")
public class UserController extends BaseController<UserBiz, User>
{
    @Autowired
    private PermissionService permissionService; 
    
    @GetMapping(value="/front/info")
    @ResponseBody
    public ResponseEntity<?> getUserInfo(String token) throws Exception{
        FrontUser user = permissionService.getUserInfo(token);
        if(user == null){
            return ResponseEntity.status(401).body(false);
        }else{
            return ResponseEntity.ok(user);
        }
    }
    
    @GetMapping(value="/front/menus")
    public @ResponseBody List<MenuTree> getMenusByUsername(String token) throws Exception{
        return permissionService.getMenusByUsername(token);
    }
}
