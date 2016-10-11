package com.akhil.driver;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.akhil.bean.Test;

public class DriverTest {

	public static void main(String[] args) {
		
		Resource r = new ClassPathResource("com/akhil/resource/Spring.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		Test t =(Test)factory.getBean("Test");
		
		t.hello();
		
	}

}
