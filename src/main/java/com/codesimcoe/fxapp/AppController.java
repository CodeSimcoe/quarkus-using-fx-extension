package com.codesimcoe.fxapp;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

@Dependent
public class AppController {

  @Inject
  AppService appService;

  @FXML
  private Label label;

  @FXML
  void onButtonClicked() {
    this.label.setText(this.appService.randomSentence());
  }
}
