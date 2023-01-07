package com.ndr.samples.springcore01;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.stereotype.Component;



@Component
@ConfigurationProperties(prefix = "server")
public class SampleConfiguration {

	@NestedConfigurationProperty
	private Map<String, List<Credential>> credentials;
	// getter and setter
	
	private Map<String, Credential> users;
	

	public static class Credential {

		private String username;
		private String password;
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}

		// Getter/Setter
		
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
