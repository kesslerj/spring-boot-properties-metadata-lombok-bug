package de.jk.example.propertiesmetadatalombokbug;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("test.nolombok")
public class NoLombokProperties {

	private String shouldNotAppear;

	private String shouldAppear;

	public String getShouldAppear() {
		return this.shouldAppear;
	}

	public void setShouldAppear(String shouldAppear) {
		this.shouldAppear = shouldAppear;
	}

	protected String getShouldNotAppear() {
		return this.shouldNotAppear;
	}

}
