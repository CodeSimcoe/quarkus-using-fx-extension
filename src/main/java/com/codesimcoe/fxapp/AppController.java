package com.codesimcoe.fxapp;

import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

import java.io.IOException;
import java.net.URL;

@Dependent
public class AppController {

  @Inject
  Instance<FXMLLoader> fxmlLoaderInstance;

  @FXML
  private TabPane tabPane;

  @FXML
  private void initialize() {
    //
  }

  @FXML
  private void onAddButtonClicked() {
    FXMLLoader loader = this.fxmlLoaderInstance.get();
    try {
      URL fxml = this.getClass().getResource("/tab.fxml");
      Parent fxmlParent = loader.load(fxml.openStream());

      Tab tab = new Tab();
      tab.setText("Tab " + (this.tabPane.getTabs().size() + 1));
      tab.setContent(fxmlParent);
      this.tabPane.getTabs().add(tab);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
