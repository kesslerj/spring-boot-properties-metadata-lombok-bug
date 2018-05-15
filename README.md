# spring-boot-properties-metadata-lombok-bug

Demo project to show a bug in the spring-boot-configuration-processor.

## Bug description

TODO: add link to github Issue here

Property metadata contains properties for fields which have a non-public (or none) setter or getter when using lombok. The bug occures if 
there are lombok annotations used, which define the `lombok.AccessLevel` as annotation attribute.

Example:

```java 
@Data
@ConfigurationProperties("test.lombok")
public class LombokProperties {

	@Getter(AccessLevel.PRIVATE)
	@Setter(AccessLevel.PRIVATE)
	private String shouldNotAppear;

	private String shouldAppear;

}
```

Property `test.lombok.should-not-appear` is contained in the metadata.

Behaviour in spring-boot-configuration-processor: `ConfigurationMetadataAnnotationProcessor` only checks if lomboks `@Getter` or `@Setter` are used, not if any attributes were set.
