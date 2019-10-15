package wtvr;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminMenuController {

    public void SwitchToAddScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddTrip.fxml"));
        Stage window = (Stage) (((Node)event.getSource()).getScene().getWindow());
        window.setScene(new Scene(root,600,400));
        window.setTitle("Add Trip");
        window.show();
    }

    public void SwitchToReviewTrips(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("ReviewAdmin.fxml"));
        Stage window = (Stage) (((Node)event.getSource()).getScene().getWindow());
        window.setScene(new Scene(root,600,400));
        window.setTitle("Review");
        window.show();
    }

    public void SwitchToRemoveTrip(ActionEvent event) throws IOException{

        Parent root = FXMLLoader.load(getClass().getResource("RemoveTrip.fxml"));
        Stage window = (Stage) (((Node)event.getSource()).getScene().getWindow());
        window.setScene(new Scene(root,600,400));
        window.setTitle("Remove");
        window.show();

    }

    public void SwitchToLogin(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AdminLogin.fxml"));
        Stage window = (Stage) (((Node)event.getSource()).getScene().getWindow());
        window.setScene(new Scene(root,600,400));
        window.setTitle("Log In");
        window.show();
    }

}
