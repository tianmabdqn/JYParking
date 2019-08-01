package xyz.hxz1216.jyparking.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.Validator;

public class MyMvcConfig implements WebMvcConfigurer {


	public MessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setDefaultEncoding("UTF-8");
		messageSource.setCacheSeconds(0);
		messageSource.setBasename("i18n/*");
		return messageSource;
	}

	/**
	 * 自定义国际化文件存放路径
	 *
	 * @return
	 */
	@Bean
	public Validator validator() {
		LocalValidatorFactoryBean validator = new LocalValidatorFactoryBean();
		validator.setValidationMessageSource(messageSource());
		return validator;
	}


	@Bean
	public LocaleResolver localeResolver(){
		return  new MyLocaleResolver();
	}
}
