package ch.zhaw.prog2.wordcloud;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
public class MainWindowController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    @FXML
    private Label labelTitel;

    @FXML
    private VBox lableTitel;

    @FXML
    private TextField textEingabe;

    @FXML
    private TextArea textHistory;

    @FXML
    void hinzufuegenText(ActionEvent event) {

    }

    @FXML
    void leerenTextEingabe(ActionEvent event) {

    }

}

