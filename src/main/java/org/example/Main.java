package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    //private PhoneModel pm = new PhoneModel();
    //private Label display = new Label("Display");

    public static void main (String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Phone");

        /*
        Button btn00=new Button("0");
        Button btn01=new Button("1");
        Button btn02=new Button("2");
        Button btn03=new Button("3");

        btn00.setOnAction(e->{pm.addDigit("0");updateNumberDisplay();});
        btn01.setOnAction(e->{pm.addDigit("1");updateNumberDisplay();});
        btn02.setOnAction(e->{pm.addDigit("2");updateNumberDisplay();});
        btn03.setOnAction(e->{pm.addDigit("3");updateNumberDisplay();});

        GridPane gridPane01=new GridPane();
        gridPane01.add(btn00, 0, 0, 1, 1);
        gridPane01.add(btn01, 1, 0, 1, 1);
        gridPane01.add(btn02, 2, 0, 1, 1);
        gridPane01.add(btn03, 3, 0, 1, 1);

        GridPane gridPane02=new GridPane();
        display.setStyle("-fx-font-size:20;");
        ImageView imvPhoneImage=new ImageView();
        imvPhoneImage.setImage(new Image("phone.png"));
        imvPhoneImage.setFitHeight(50);
        imvPhoneImage.setPreserveRatio(true);
        Button btnCall=new Button("Call");
        btnCall.setOnAction(e->{onMakeCall();});

        gridPane02.add(display,0,0,1,1);
        gridPane02.add(imvPhoneImage,0,1,1,1);
        gridPane02.add(btnCall,0,2,1,1);

        GridPane gridPane=new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.add(gridPane02,0,0,1,1);
        gridPane.add(gridPane01,0,1,1,1);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        Scene scene =new Scene(gridPane,400,200);

         */
        Parent root = FXMLLoader.load(getClass().getResource("/FXMLView.fxml"));
        Scene scene = new Scene(root, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

//    private void updateNumberDisplay() {
//        display.setText(pm.getNumber());
//    }
//
//    public void onMakeCall() {
//        pm.makeCall(pm.getNumber());
//    }
}
