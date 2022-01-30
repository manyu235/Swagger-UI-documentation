package com.demo;


import java.util.Collections;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SwaggerExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerExampleApplication.class, args);
	}
	
	@Bean
    public Docket swaggerConfiguration()
    {
        return new Docket(DocumentationType.SWAGGER_2)
        		//.groupName("save")
                .select()
                .paths(PathSelectors.ant("/name"))
                .build()
                .apiInfo(getName());
    }

	
    private ApiInfo getName()
    {
        return new ApiInfo( "Demo for swagger 2",
                "Return Name",
                "V1",
                null,
                new Contact("Solution Tech","https://www.youtube.com/channel/UCqdGYnZnAAdeFWZifMEtkWA","manyu87kumar@gmail.com"),
                null,
                null,
                Collections.emptyList());
               
	}  
	
 
}
