package com.ndr.samples.springcore01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SampleConfigurationReader {

	@Autowired
	private SampleConfiguration sampleConfiguration;

	public SampleConfiguration getSampleConfiguration() {
		return sampleConfiguration;
	}

	public void setSampleConfiguration(SampleConfiguration sampleConfiguration) {
		this.sampleConfiguration = sampleConfiguration;
	}
	
}
