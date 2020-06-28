/**
 *
 *
 * @createdOn Jun 14, 2020
 *
 * @author vasudev
 */


package dev.springdemo.config;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


/**
 *
 * Description about this class ....
 *
 * @author vasudev
 * @createdOn Jun 14, 2020
 * @since v1.0.0-00
 *
 */
public class SpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {

		// TODO Auto-generated method stub
		return null;

	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		return new Class[] { SpringAppConfig.class };

	}

	@Override
	protected String[] getServletMappings() {

		return new String[] { "/" };

	}

}
