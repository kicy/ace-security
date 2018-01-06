/*
 * 文 件 名:  TokenForbiddenResponse.java
 * 版    权:  SSSCC Technologies Co., Ltd. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  
 * 修改时间:  2017年12月27日
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.github.joy.security.admin.common.msg.auth;

import javax.servlet.http.HttpServletResponse;

import com.github.joy.security.admin.common.msg.BaseResponse;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2017年12月27日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class TokenForbiddenResponse extends BaseResponse
{
    public TokenForbiddenResponse(String message){
        super(HttpServletResponse.SC_FORBIDDEN, message);
    }
}
