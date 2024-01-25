package com.codesimcoe.fxapp;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AppService {

  public String randomSentence() {
    double random = Math.random();
    if (random < 0.33) {
      return "Hello World!";
    } else if (random < 0.66) {
      return "Hola Mundo!";
    } else {
      return "Bonjour le monde!";
    }
  }
}
