package com.mingsoft.people.interceptor;

import java.net.URLDecoder;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mingsoft.base.constant.Const;
import com.mingsoft.basic.interceptor.BaseInterceptor;
import com.mingsoft.people.constant.e.CookieConstEnum;
import com.mingsoft.util.StringUtil;
import net.mingsoft.basic.util.BasicUtil;

/**
 * 铭飞MS平台－会员拦截
 */
public class ActionInterceptor extends BaseInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		if (this.getSession(request, com.mingsoft.people.constant.e.SessionConstEnum.PEOPLE_SESSION)==null) {
			String loginUrl = this.getCookie(request, CookieConstEnum.PEOPLE_LOGIN_URL);
			if (StringUtil.isBlank(loginUrl)) {
				response.sendRedirect(BasicUtil.getUrl()+"/error/404.do");
				return false;
			} else {
				response.sendRedirect(URLDecoder.decode(loginUrl,Const.UTF8));
				return false;
			}
			
		} else {
			return true;
		}
	}
}