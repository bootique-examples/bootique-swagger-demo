package io.bootique.swagger.demo;

import com.google.inject.Binder;
import com.google.inject.Module;
import io.bootique.Bootique;
import io.bootique.jersey.JerseyModule;
import io.swagger.jaxrs.config.BeanConfig;

public class Application implements Module {

    public Application() {
        BeanConfig conf = new BeanConfig();
        conf.setTitle("Bootique Swagger Demo");
        conf.setDescription("Demonstrates Swagger v2 API spec generation and presentation");
        conf.setVersion("1.0");
        conf.setHost("localhost:8080");
        conf.setBasePath("/");
        conf.setResourcePackage("io.bootique.swagger.demo");
        conf.setSchemes(new String[] { "http" });

        // quite counterintuitively, the following setter initializes Swagger metadata for the entire app.
        conf.setScan(true);
    }

    public static void main(String[] args) {
        Bootique.app(args)
                .autoLoadModules()
                .module(Application.class)
                .exec()
                .exit();
    }

    @Override
    public void configure(Binder binder) {
        JerseyModule.extend(binder).addResource(HelloApi.class);
    }
}
