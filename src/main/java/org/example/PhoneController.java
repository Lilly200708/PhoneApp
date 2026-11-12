package org.example;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneController {

    private PhoneModel pm = new PhoneModel(this);
    @FXML
    private Button clearButton;

    @FXML
    private ImageView imvPhoneImage1;

    @FXML
    private ImageView imvPhoneImage2;

    @FXML
    private ComboBox<String> namesCB;

    @FXML
    private TextField txtNumberDisplay;

    private Image phone = new Image("phone.png");
    private Image onCall = new Image("onCall.png");
    private Image offCall = new Image("offCall.png");

    public void setOnCall() {
        imvPhoneImage2.setImage(onCall);
    }
    public void setOffCall() {
        imvPhoneImage2.setImage(offCall);
    }

    private HashMap<String, String> contactList= new HashMap<>();
    @FXML
    void initialize(){
        imvPhoneImage1.setImage(phone);
        imvPhoneImage2.setImage(offCall);

        contactList.put("Alex","0000000000");
        contactList.put("Helen","1111111111");
        contactList.put("Jane","2222222222");
        contactList.put("Tom","333333333");

        ArrayList<String> names=new ArrayList<>();
        names.addAll(contactList.keySet());
        ObservableList<String> list = FXCollections.observableArrayList(names);
        namesCB.setItems(list);
    }

    @FXML
    void onButtonPressed(ActionEvent event) {
        Button btn = (Button)event.getSource();
        pm.addDigit(btn.getText());
        updateNumberDisplay();
    }

    @FXML
    void onClearButtonPressed(ActionEvent event) {
        txtNumberDisplay.clear();
        pm.setNumber("");
    }

    @FXML
    void onMakeCall(ActionEvent event) {
        pm.makeCall(pm.getNumber());
    }

    @FXML
    void onNameSelectionMade(ActionEvent event) {
        String name = namesCB.getSelectionModel().getSelectedItem();
        String phoneNumber = contactList.get(name);
        pm.setNumber(phoneNumber);
        updateNumberDisplay();
    }

    private void updateNumberDisplay() {
        txtNumberDisplay.setText(pm.getNumber());
    }

}

/*package org.example;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneController {

    private PhoneModel pm = new PhoneModel();
    @FXML
    private Button clearButton;

    @FXML
    private ImageView imvPhoneImage1;

    @FXML
    private ImageView imvPhoneImage2;

    @FXML
    private ComboBox<String> namesCB;

    @FXML
    private TextField txtNumberDisplay;

    private Image phone = new Image("phone.png");
    private Image onCall = new Image("onCall.png");
    private Image offCall = new Image("offCall.png");

    private HashMap<String, String> contactList= new HashMap<>();
    @FXML
    void initialize(){
        imvPhoneImage1.setImage(phone);

        contactList.put("Alex","0000000000");
        contactList.put("Helen","1111111111");
        contactList.put("Jane","2222222222");
        contactList.put("Tom","333333333");

        ArrayList<String> names=new ArrayList<>();
        names.addAll(contactList.keySet());
        ObservableList<String> list = FXCollections.observableArrayList(names);
        namesCB.setItems(list);
    }

    @FXML
    void onButtonPressed(ActionEvent event) {
        Button btn = (Button)event.getSource();
        pm.addDigit(btn.getText());
        updateNumberDisplay();
    }

    @FXML
    void onClearButtonPressed(ActionEvent event) {
        txtNumberDisplay.clear();
        pm.setNumber("");
    }

    @FXML
    void onMakeCall(ActionEvent event) {
        pm.makeCall(pm.getNumber());
    }

    @FXML
    void onNameSelectionMade(ActionEvent event) {
        String name = namesCB.getSelectionModel().getSelectedItem();
        String phoneNumber = contactList.get(name);
        pm.setNumber(phoneNumber);
        updateNumberDisplay();
    }

    private void updateNumberDisplay() {
        txtNumberDisplay.setText(pm.getNumber());
    }

    public void onMakeCall() {
        pm.makeCall(pm.getNumber());
    }
}*/
