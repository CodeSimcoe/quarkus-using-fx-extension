package com.codesimcoe.fxapp;

import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient
public interface StarWarsRestClient {

  @Path("/planets")
  @GET
  Uni<PlanetsResult> getPlanets();

  @Path("/people")
  @GET
  Uni<PeopleResult> getPeople();
}
