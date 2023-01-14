package com.ndr.samples.springcore01;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ndr.samples.springcore.model.Credential;


@SpringBootApplication
public class SampleConfigurationMain {
	
		
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SampleConfigurationMain.class, args);
		 for (String beanName : applicationContext.getBeanDefinitionNames()) {
	            //System.out.println(beanName);
	        }
		 
		 SampleConfiguration sampleConfiguration = applicationContext.getBean(SampleConfiguration.class);
		 System.out.println("Application name:" + sampleConfiguration.getApplicationName() );
		 if ( Objects.nonNull(sampleConfiguration.getCredentials()) ) {
			 Map<String, List<Credential>> credentialsMap = sampleConfiguration.getCredentials();
			 for( Entry<String, List<Credential>> entry: credentialsMap.entrySet() ) {
				 System.out.println("Entry key:" + entry.getKey() + " - value: " + credentialsMap.get(entry.getKey()));
				 List<Credential> credentialsList = credentialsMap.get(entry.getKey());
				 credentialsList.forEach( cr -> System.out.println("Username: " + cr.getUsername() + " - Password: " + cr.getPassword())); 
			 }
			 
		 }
		 
		 if ( Objects.nonNull(sampleConfiguration.getUsers()) ) {
			 Map<String, Credential> usersMap = sampleConfiguration.getUsers();
			 for( Entry<String, Credential> entry: usersMap.entrySet() ) {
				 System.out.println("Entry key:" + entry.getKey() + " - value: " + usersMap.get(entry.getKey()));
				 Credential credential = usersMap.get(entry.getKey());
				 System.out.println("Username: " + credential.getUsername() + " - Password: "  + credential.getPassword());
			 }
			 
		 }
	}
	
}
