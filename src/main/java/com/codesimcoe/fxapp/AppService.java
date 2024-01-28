package com.codesimcoe.fxapp;

import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@ApplicationScoped
public class AppService {

  @Inject
  @RestClient
  StarWarsRestClient starWarsRestClient;

  public Uni<PlanetsResult> getPlanets() {
    return this.starWarsRestClient.getPlanets();
  }

  public Uni<PeopleResult> getPeople() {
    return this.starWarsRestClient.getPeople();
  }
}
