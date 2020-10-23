package com.zlc;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : 清零
 * @create : 2020-10-23 0:18
 * @desc :
 **/
public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

	public MyClassPathXmlApplicationContext(String... configLocations) {
		super(configLocations);
	}

	/**
	 * <p>Replace any stub property sources with actual instances.
	 */
	@Override
	protected void initPropertySources() {
		//super.initPropertySources();
		System.out.println("扩展initPropertySource");
		//getEnvironment().setRequiredProperties("abc");
	}

	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
		super.setAllowBeanDefinitionOverriding(false);
		super.setAllowCircularReferences(false);
		super.customizeBeanFactory(beanFactory);
	}
}
