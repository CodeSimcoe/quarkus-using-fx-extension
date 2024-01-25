package com.codesimcoe.fxapp;

import com.codesimcoe.quarkus.fx.extension.runtime.FxApplication;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import javafx.application.Application;

@QuarkusMain
public class CDIApplication implements QuarkusApplication {

  public static void main(final String[] args) {
    Quarkus.run(CDIApplication.class);
  }

  @Override
  public int run(final String... args) {
    Application.launch(FxApplication.class, args);
    return 0;
  }
}