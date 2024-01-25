package com.codesimcoe.fxapp;

import javafx.scene.control.ListCell;

public class PlanetListCell extends ListCell<Planet> {

  @Override
  protected void updateItem(final Planet item, final boolean empty) {
    super.updateItem(item, empty);
    if (empty || item == null) {
      this.setText(null);
    } else {
      this.setText(item.name());
    }
  }
}
