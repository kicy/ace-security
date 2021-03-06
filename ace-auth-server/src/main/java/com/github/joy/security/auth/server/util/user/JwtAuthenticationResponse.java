/*
 * 文 件 名:  JwtAuthenticationResponse.java
 * 版    权:  SSSCC Technologies Co., Ltd. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  
 * 修改时间:  2018年1月6日
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.github.joy.security.auth.server.util.user;

import java.io.Serializable;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2018年1月6日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class JwtAuthenticationResponse implements Serializable
{

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 7326258641911401012L;
    
    private final String token;
    
    /** 
     * <默认构造函数>
     */
    public JwtAuthenticationResponse(String token)
    {
        this.token = token;
    }

    public String getToken()
    {
        return token;
    }
}
