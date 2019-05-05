package cn.bookcycle.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.bookcycle.pojo.User;
import cn.bookcycle.service.UserService;
import cn.bookcycle.utils.UserUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.io.PrintWriter;

/**
 * 
 * @ClassName: OperatingInterceptor
 * @Description: 对应用接入操作的拦截器
 * @author yesyoungbaby 
 * @date 2018年10月1日 下午2:35:31
 */
public class OperatingInterceptor implements HandlerInterceptor {

	private static final Logger log = LoggerFactory.getLogger(OperatingInterceptor.class);


	/**
	 * userService造成null的原因是因为拦截器加载是在springContext创建之前完成的，所以在拦截器中注入实体自然就为null。
	 解决方法就是让bean提前加载  在OperatingAdapter中做了设置
	 */
	@Autowired
	private UserService userService;

	/**
	 * 进入controller层之前拦截请求。拦截路径在OperatingAdapter定义
	 * 这里写要拦截的内容
	 * @param request    注意需要从该对象中拿到前端传来的信息
	 * @param response
	 * @param handler
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean preHandle(HttpServletRequest request,
							 HttpServletResponse response,
							 Object handler) throws Exception {

		log.info("---------------------开始进入请求地址拦截----------------------------");

		/**
		 * userId标识当前用户。若前端直接传来userId而非token，则
		 * 获取前端传来的userId
		 * ApplicationAccess中也有userId字段，类型是Long。所以该参数在做应用插入的时候也会被存入db？？？
		 */
		String strId = request.getParameter("userId");
		if(strId == null || strId.equals("")){
			PrintWriter printWriter = response.getWriter();
			printWriter.write("{code:0,message:\"please Login!\"}");
			return false;
		}

/*
		 * 若传来的是token，则需要从token中拿到能够标识用户的信息去查用户。
		 * 在由用户的身份看是否放行

		String token = request.getParameter("token");
		//依据token的状态判断用户的登录状态
		if(token == null || token.equals("")){
		    PrintWriter printWriter = response.getWriter();
			printWriter.write("{code:0,message:\"please Login!\"}");
			response.sendRedirect(LOGIN_PAGE_URL);
			return false;
		}
		//token拿到userId
		//userId为user主键  拿主键查其他字段roleId
		//由roleId看是否放行
*/

		/**
		 * 字符串转换成基本数据类型
		 * Long.ValueOf("String")与Long.parseLong("String")的区别
		 * 		Long.ValueOf("String")返回Long包装类型
		 * 		Long.parseLong("String")返回long基本数据类型
		 */
		Long userId = Long.valueOf(strId);
		User user = userService.queryById(userId);

		/**
		 * 查看该用户的角色
		 * roleId为1表明其为超管,roleId为1表明其为普通管理员。放行,并且把userId存入到session。
		 * 其余角色无操作应用的权限，不放行。拦截。
		 */
		if(user.getRoleId() != 1 && user.getRoleId() != 2){
			PrintWriter printWriter = response.getWriter();
			printWriter.write("{code:0,message:\"You don't have permission to operate the ApplicationAccess!\" }");
			return false;
		} else{
			HttpSession session = request.getSession();
			session.setAttribute("userId",userId);
			return true;
		}
	}


	/**
	 * Handler执行后，返回modelAndView之前
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
			throws Exception {
		log.info("--------------处理请求完成后视图渲染之前的处理操作---------------");
	}
	
	/**
	 * 完成处理，返回modelAndView之后
	 * 可以在此处理异常
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		log.info("---------------视图渲染之后的操作-------------------------");
	}

}
