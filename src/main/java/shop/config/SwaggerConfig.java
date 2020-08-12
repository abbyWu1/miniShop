package shop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
            .pathMapping("/")
            .select()
            .apis(RequestHandlerSelectors.basePackage("shop"))
            .paths(PathSelectors.any())
            .build().apiInfo(new ApiInfoBuilder()
                .title("接口文档")
                .description("miniShop接口文档")
                .version("9.0")
                .contact(new Contact("minishop", "https://github.com/abbyWu1/miniShop.git", "904692015@qq.com"))
                .license("The Apache License")
                .licenseUrl("http://www.baidu.com")
                .build());
    }
}