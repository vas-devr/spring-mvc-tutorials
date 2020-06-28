/**
 *
 *
 * @createdOn Jun 14, 2020
 *
 * @author vasudev
 */


package dev.springdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 *
 * Description about this class ....
 *
 * @author vasudev
 * @createdOn Jun 14, 2020
 * @since v1.0.0-00
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "dev.springdemo")
public class SpringAppConfig {
	
	private final String WEB_INF = "/WEB-INF/view/";
	private final String JSP     = ".jsp";

	// create new view resolver bean
	@Bean
	public ViewResolver viewResolver() {

		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();

		// file suffix and prefix
		viewResolver.setPrefix(WEB_INF);
		viewResolver.setSuffix(JSP);

		return viewResolver;

	}

}
