package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.AudioClip;
import javafx.scene.media.MediaPlayer;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class Menu {
    @FXML
    public WebView webView;

    @FXML
    private BorderPane mainPanel;

    AudioClip note = new AudioClip(this.getClass().getResource("/Music/hearme.mp3").toString());


    @FXML
    public void handleLinkClick(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Instagram.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    @FXML
    public void exitApplication(){
        Platform.exit();
    }

    @FXML
    public void openContacts(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("main.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
    @FXML
    public void openSystemInfo(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Systeminfo.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
    @FXML
    public void playMusic(){

        note.play();
    }

    @FXML
    public void stopMusic(){
        note.stop();
    }

    @FXML
    public void takePhoto(){
        System.out.println("Photo was taken");
    }

    @FXML
    public void openFilm(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Video.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }



}
