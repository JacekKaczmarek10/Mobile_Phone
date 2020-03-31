package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class Instagram {

    @FXML
    private WebView webView;

    @FXML
    private GridPane gridPane;

    @FXML
    private Label label;

    @FXML
    public void handleLinkClick(){
        WebEngine engine = webView.getEngine();
        engine.load("http://www.instagram.com");
    }

}
