package zn.taco_cloud;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Webconfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(
        ViewControllerRegistry registry
    ) {
        registry.addViewController("/").setViewName("home");
    }
    
}
