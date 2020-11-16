package io.bootique.swagger.openapi3.demo;

import io.bootique.BQCoreModule;
import io.bootique.BaseModule;
import io.bootique.Bootique;
import io.bootique.di.Binder;
import io.bootique.jersey.JerseyModule;

public class Application extends BaseModule {

    public static void main(String[] args) {

        Bootique.app(args)
                .autoLoadModules()
                .module(Application.class)
                .exec()
                .exit();
    }

    @Override
    public void configure(Binder binder) {
        BQCoreModule.extend(binder).addConfig("classpath:default.yml");
        JerseyModule.extend(binder).addResource(HelloApi.class);
    }
}
