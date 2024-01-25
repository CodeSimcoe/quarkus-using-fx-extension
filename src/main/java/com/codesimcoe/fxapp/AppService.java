package com.codesimcoe.fxapp;

import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@ApplicationScoped
public class AppService {

  @RestClient
  StarWarsRestClient starWarsRestClient;

  public Uni<PlanetsResult> getPlanets() {
    return this.starWarsRestClient.getPlanets();
  }
}
