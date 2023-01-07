package com.ndr.samples.springcore01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootConfiguration
@ComponentScan
@PropertySource(value = "classpath:application.yml")
public class SampleSpringApplicationMain {
	
		
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SampleSpringApplicationMain.class, args);
		 for (String beanName : applicationContext.getBeanDefinitionNames()) {
	            System.out.println(beanName);
	        }
		 
		 SampleConfigurationReader sampleConfigurationReader = applicationContext.getBean(SampleConfigurationReader.class);
		 System.out.println(sampleConfigurationReader.getSampleConfiguration().getUsers().size() );
	}
}
