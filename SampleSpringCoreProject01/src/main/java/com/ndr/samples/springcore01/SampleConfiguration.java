package com.ndr.samples.springcore01;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.ndr.samples.springcore.model.Credential;



@Component
@Configuration
@ConfigurationProperties(prefix = "server")
public class SampleConfiguration {

	@NestedConfigurationProperty
	private Map<String, List<Credential>> credentials;
	// getter and setter
	
	private Map<String, Credential> users;
	
	private String applicationName;
	


	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public Map<String, List<Credential>> getCredentials() {
		return credentials;
	}

	public void setCredentials(Map<String, List<Credential>> credentials) {
		this.credentials = credentials;
	}

	public Map<String, Credential> getUsers() {
		return users;
	}

	public void setUsers(Map<String, Credential> users) {
		this.users = users;
	}
	
	
}
