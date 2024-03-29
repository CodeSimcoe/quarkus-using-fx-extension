package com.codesimcoe.fxapp;

import io.quarkiverse.fx.PrimaryStage;
import io.quarkus.runtime.Quarkus;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

@ApplicationScoped
public class QuarkusFxApp {

	@Inject
	FXMLLoader fxmlLoader;

	public void start(@Observes @PrimaryStage final Stage stage) {

		stage.setOnCloseRequest(event -> {
			Platform.exit();
			Quarkus.asyncExit();
		});

		try {
			URL fxml = this.getClass().getResource("/app.fxml");
			Parent fxmlParent = this.fxmlLoader.load(fxml.openStream());

			Scene scene = new Scene(fxmlParent, 400, 600);
			stage.setScene(scene);
			stage.setTitle("Hello World Quarkus + JavaFX ! 🪐");
			stage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}