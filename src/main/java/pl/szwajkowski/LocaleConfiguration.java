package pl.szwajkowski;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;
import pl.szwajkowski.service.MyLocaleChangeInterceptor;

/**
 * Created by Łukasz on 2015-05-19.
 */
@Configuration
public class LocaleConfiguration extends WebMvcConfigurerAdapter{
	@Bean
	public MyLocaleChangeInterceptor localeChangeInterceptor() {
		return new MyLocaleChangeInterceptor();
	}

	@Bean
	@Order(0)
	public LocaleResolver acceptHeaderLocaleResolver() {
		return new AcceptHeaderLocaleResolver();
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(localeChangeInterceptor());
	}
}
