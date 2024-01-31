package com.codesimcoe.fxapp.rest;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/api")
@Produces("application/json")
@ApplicationScoped
public class RestController {

  @GET
  @Path("/hello")
  public String hello() {
    return "Hello World from Quarkus + JavaFX app ! 🪐";
  }
}
