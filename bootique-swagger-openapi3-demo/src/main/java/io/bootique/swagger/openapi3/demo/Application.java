package io.bootique.swagger.openapi3.demo;

import com.google.inject.Binder;
import com.google.inject.Module;
import io.bootique.BQCoreModule;
import io.bootique.Bootique;
import io.bootique.jersey.JerseyModule;

public class Application implements Module {

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
