package io.bootique.swagger.demo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Api
@Path("")
public class HelloApi {

    @GET
    @Path("api")
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Returns hello message")
    public String get() {
        return "{\"message\":\"Hello, Bootique!!\"}";
    }

}