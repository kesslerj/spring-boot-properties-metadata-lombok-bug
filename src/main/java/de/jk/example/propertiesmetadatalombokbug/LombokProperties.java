package de.jk.example.propertiesmetadatalombokbug;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@ConfigurationProperties("test.lombok")
public class LombokProperties {

	@Getter(AccessLevel.PRIVATE)
	@Setter(AccessLevel.PRIVATE)
	private String shouldNotAppear;

	private String shouldAppear;

}
