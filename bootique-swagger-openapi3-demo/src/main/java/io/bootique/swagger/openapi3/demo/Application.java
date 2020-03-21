package io.bootique.swagger.openapi3.demo;

import io.bootique.BQCoreModule;
import io.bootique.Bootique;
import io.bootique.di.BQModule;
import io.bootique.di.Binder;
import io.bootique.jersey.JerseyModule;
import io.swagger.v3.jaxrs2.integration.JaxrsOpenApiContextBuilder;
import io.swagger.v3.oas.integration.OpenApiConfigurationException;
import io.swagger.v3.oas.integration.SwaggerConfiguration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

import java.util.Collections;

public class Application implements BQModule {

    public static void main(String[] args) {

        initApiMetadata();

        Bootique.app(args)
                .autoLoadModules()
                .module(Application.class)
                .exec()
                .exit();
    }

    private static void initApiMetadata() {
        Info info = new Info()
                .title("Bootique OpenAPI 3.0 Demo")
                .description("Demonstrates OpenAPI v3 API spec generation and presentation")
                .contact(new Contact().email("root@example.org"))
                .license(new License()
                        .name("Apache 2.0")
                        .url("http://www.apache.org/licenses/LICENSE-2.0.html"));

        SwaggerConfiguration oasConfig = new SwaggerConfiguration()
                .openAPI(new OpenAPI().info(info))
                .prettyPrint(true)
                .resourcePackages(Collections.singleton(HelloApi.class.getPackage().getName()));

        try {
            new JaxrsOpenApiContextBuilder()
                    .openApiConfiguration(oasConfig)
                    .buildContext(true);
        } catch (OpenApiConfigurationException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void configure(Binder binder) {
        BQCoreModule.extend(binder).addConfig("classpath:default.yml");
        JerseyModule.extend(binder).addResource(HelloApi.class);
    }
}
