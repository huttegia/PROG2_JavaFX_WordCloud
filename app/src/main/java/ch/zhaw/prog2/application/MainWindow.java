package ch.zhaw.prog2.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainWindow extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        openMainWindow(primaryStage);
    }
    private void openMainWindow(Stage stage) throws IOException {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("MainWindow.fxml"));
            Pane rootNode = loader.load();
            MainWindowController mainWindowController = loader.getController();
            mainWindowController.connectProperties();
            Scene scene = new Scene(rootNode);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}