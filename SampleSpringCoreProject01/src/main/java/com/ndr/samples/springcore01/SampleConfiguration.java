package com.ndr.samples.springcore01;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "server")
public class ServerProperties {

	@NestedConfigurationProperty
	private Map<String, List<Credential>> credentials = new HashMap<>();
	// getter and setter

	public static class Credential {

		private String username;
		private String password;

		// Getter/Setter
	}
}
