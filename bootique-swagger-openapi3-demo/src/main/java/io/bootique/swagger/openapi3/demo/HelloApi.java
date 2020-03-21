package io.bootique.swagger.openapi3.demo;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@OpenAPIDefinition
@Path("")
public class HelloApi {

    @GET
    @Path("api")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(description = "Returns hello message")
    public String get() {
        return "{\"message\":\"Hello, Bootique!!\"}";
    }

}