package sample;


import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.awt.*;


public class SystemInfo {
    @FXML
   private ImageView imageView;


    @FXML
    private void loadData(){
        Image image = new Image("/Images/dane_telefonu.jpg");
        imageView.setImage(image);
    }

}
