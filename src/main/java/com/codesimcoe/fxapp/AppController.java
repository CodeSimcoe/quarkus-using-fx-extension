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

    String fxml;
    String tabName;
    int tabCount = this.tabPane.getTabs().size();
    if (tabCount % 2 == 0) {
      fxml = "/peopletab.fxml";
      tabName = "People";
    } else {
      fxml = "/planettab.fxml";
      tabName = "Planets";
    }


    try {
      URL fxmlUrl = this.getClass().getResource(fxml);
      Parent fxmlParent = loader.load(fxmlUrl.openStream());

      Tab tab = new Tab();
      tab.setText(tabName + " " + (tabCount + 1));
      tab.setContent(fxmlParent);
      this.tabPane.getTabs().add(tab);

      // Select the newly added tab
      this.tabPane.getSelectionModel().select(tab);

    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
