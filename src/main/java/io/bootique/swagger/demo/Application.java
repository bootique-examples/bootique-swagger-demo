package io.bootique.swagger.demo;

import com.google.inject.Binder;
import com.google.inject.Module;
import io.bootique.BQCoreModule;
import io.bootique.Bootique;
import io.bootique.jersey.JerseyModule;
import io.bootique.jetty.command.ServerCommand;
import io.swagger.jaxrs.config.BeanConfig;

public class Application implements Module {

    public Application() {
        BeanConfig conf = new BeanConfig();
        conf.setTitle("Bootique swagger");
        conf.setDescription("Swagger demo api");
        conf.setVersion("1.0");
        conf.setHost("localhost:9999");
        conf.setBasePath("/");
        conf.setResourcePackage("io.bootique.swagger.demo");
        conf.setSchemes(new String[] { "http" });
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
        BQCoreModule.extend(binder)
                .setDefaultCommand(ServerCommand.class)
                .addConfig("classpath:bootique.yml");

        JerseyModule.extend(binder)
                .addResource(HelloApi.class);
    }
}
