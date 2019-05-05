package cn.bookcycle.interceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author yesyoungbaby
 * @Title: OpreatingAdapter
 * @ProjectName app-access
 * @Description: TODO
 * @date 2018/11/2915:36
 */
@Configuration
public class OperatingAdapter implements WebMvcConfigurer {

    /**
     *  定义了这个方法，就要在下面用到。不然service还是空
     */
    @Bean
    public HandlerInterceptor getOperatingInterceptor(){
        return new OperatingInterceptor();
    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册自定义拦截器，添加拦截路径和排除拦截路径

        //用上面的方法添加拦截器
        registry.addInterceptor(getOperatingInterceptor()).addPathPatterns("/**");
    }


}
