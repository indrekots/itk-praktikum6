package ee.itcollege.i377.praktikum6;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.XmlViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="ee.itcollege.i377.praktikum6")
public class DispatcherConfig extends WebMvcConfigurerAdapter{

//	@Bean
//	public XmlViewResolver excelView(){
//		XmlViewResolver resolver = new XmlViewResolver();
//		resolver.setOrder(1);
//		return resolver;
//	}
	
	@Bean
	public InternalResourceViewResolver jspResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setViewClass(JstlView.class);
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
//	@Override
//	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//		registry.addResourceHandler("/css/**", "/img/**", "/js/**").
//			addResourceLocations("/css/", "/img/", "/js/");
//	}
//	
//	@Override
//	public void configureMessageConverters(
//			List<HttpMessageConverter<?>> converters) {
//		converters.add(new MappingJacksonHttpMessageConverter());
//	}
	
}
