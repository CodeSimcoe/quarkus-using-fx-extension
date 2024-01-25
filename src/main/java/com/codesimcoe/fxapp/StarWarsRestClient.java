package com.codesimcoe.fxapp;

import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.GET;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient
public interface StarWarsRestClient {

  @GET
  Uni<PlanetsResult> getPlanets();
}
