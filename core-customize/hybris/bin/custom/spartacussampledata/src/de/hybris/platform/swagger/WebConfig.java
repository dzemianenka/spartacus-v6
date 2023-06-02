import de.hybris.platform.swagger.ApiDocInfo;

@Configuration
@ImportResource(value = "classpath*:/swagger/swaggerintegration/web/spring/*-web-spring.xml")
public class WebConfig {

    @Bean("apiDocInfo")
    public ApiDocInfo apiDocInfo() {
        return () -> "couponwebservices";
    }
}
