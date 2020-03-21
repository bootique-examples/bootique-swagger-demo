package io.bootique.swagger2.demo;

import io.bootique.Bootique;
import io.bootique.di.BQModule;
import io.bootique.di.Binder;
import io.bootique.jersey.JerseyModule;
import io.swagger.jaxrs.config.BeanConfig;

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
        BeanConfig conf = new BeanConfig();
        conf.setTitle("Bootique Swagger Demo");
        conf.setDescription("Demonstrates Swagger v2 API spec generation and presentation");
        conf.setVersion("2.0");

        // TODO: how do we set this based on request data?
        conf.setHost("127.0.0.1:8080");
        conf.setBasePath("/");
        conf.setResourcePackage(HelloApi.class.getPackage().getName());
        conf.setSchemes(new String[]{"http"});

        // quite counterintuitively, the following setter is not a setter. It initializes Swagger metadata for the
        // entire app and stores it in the ServletContext and in the ScannerFactory.SCANNER singleton
        conf.setScan(true);
    }

    @Override
    public void configure(Binder binder) {
        JerseyModule.extend(binder).addResource(HelloApi.class);
    }
}
