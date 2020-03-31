package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;


import java.net.URL;
import java.util.ResourceBundle;
import java.util.spi.ResourceBundleProvider;

public class Video implements Initializable {

    @FXML
    private Button closeButton;

    @FXML
    private MediaView media;

    private MediaPlayer mediaPlayer;

    private static final String MEDIA_URL = "/VideoData/Reason.mp4";

    public void initialize(URL location, ResourceBundle resources){

        System.out.println(location.toString());
        System.out.println(this.getClass().getResource(MEDIA_URL).toExternalForm());

        mediaPlayer = new MediaPlayer((new Media(this.getClass().getResource(MEDIA_URL).toExternalForm())));

        mediaPlayer.setAutoPlay(true);
        media.setMediaPlayer(mediaPlayer);
    }

    @FXML
    public void start(){
        mediaPlayer.play();
    }

    @FXML
    public void stop(){
        mediaPlayer.pause();
    }

    @FXML
    public void exit(){
        Stage stage = (Stage) closeButton.getScene().getWindow();
        mediaPlayer.stop();
        stage.close();
    }

}
