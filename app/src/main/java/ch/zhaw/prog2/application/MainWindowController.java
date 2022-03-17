package ch.zhaw.prog2.application;

        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.scene.control.Label;
        import javafx.scene.control.TextArea;
        import javafx.scene.control.TextField;

public class MainWindowController {

    @FXML
    private Label labelText;

    @FXML
    private TextField textEingabe;

    @FXML
    private TextArea textHistory;

    @FXML
    void hinzufuegenText(ActionEvent event) {
        textHistory.setText(textHistory.getText());
    }

    @FXML
    void leerenTextEingabe(ActionEvent event) {
        textEingabe.clear();
    }
    void connectProperties() {
        labelText.textProperty().bind(textEingabe.textProperty());
    }
}