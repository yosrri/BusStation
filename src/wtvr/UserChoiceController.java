package wtvr;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class UserChoiceController {

    public void SwitchToPassengerLogIn(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("PassengerLogin.fxml"));
        Stage window = (Stage) (((Node)event.getSource()).getScene().getWindow());
        window.setScene(new Scene(root,600,400));
        window.setTitle("Log In");
        window.show();
    }

    public void SwitchToAdminLogIn(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("AdminLogin.fxml"));
        Stage window = (Stage) (((Node)event.getSource()).getScene().getWindow());
        window.setScene(new Scene(root,600,400));
        window.setTitle("Log In");
        window.show();
    }

    public void SwitchToDriverLogIn(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("DriverLogin.fxml"));
        Stage window = (Stage) (((Node)event.getSource()).getScene().getWindow());
        window.setScene(new Scene(root,600,400));
        window.setTitle("Log In");
        window.show();
    }
}
