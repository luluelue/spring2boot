package cn.luxinhuo.webupdate;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.IOException;
import java.util.List;

@ComponentScan("cn.luxinhuo.webupdate")
@Configuration
@EnableWebMvc
public class AppConfig implements WebMvcConfigurer {
    public AppConfig() {
        System.out.println("config init");
    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        System.out.println("converters init");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addWebRequestInterceptor(new WebRequestInterceptor() {
            @Override
            public void preHandle(WebRequest request) throws Exception {
                System.out.println("前置拦截");
            }

            @Override
            public void postHandle(WebRequest request, ModelMap model) throws Exception {
                System.out.println("后置拦截");
            }

            @Override
            public void afterCompletion(WebRequest request, Exception ex) throws Exception {
                System.out.println("完成拦截");
            }
        });
    }
}
