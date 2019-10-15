package wtvr;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class DriverLoginController {

    @FXML private TextField TextFieldDriverPass, TextFieldDriverUser;
    @FXML private Label Labelinvalid;

    public void SwitchToDriverMenu(ActionEvent event) throws IOException {

        Drivers drivers = new Drivers();
        drivers.FillDriversArrayList();

        if (drivers.validatePassenger(TextFieldDriverUser.getText(), TextFieldDriverPass.getText())) {
            Parent root = FXMLLoader.load(getClass().getResource("DriverMenu.fxml"));
            Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow());
            window.setScene(new Scene(root, 600, 400));
            window.setTitle("Driver Menu");
            window.show();
        } else {
            Labelinvalid.setVisible(true);

        }

    }
    public void SwitchToUserChoice(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("UserChoice.fxml"));
        Stage window = (Stage) (((Node)event.getSource()).getScene().getWindow());
        window.setScene(new Scene(root,600,400));
        window.setTitle("User Choice");
        window.show();
    }

}
