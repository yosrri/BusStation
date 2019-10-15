package wtvr;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PassengerMenuController {

    public void SwitchToCancelScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Cancel.fxml"));
        Stage window = (Stage) (((Node)event.getSource()).getScene().getWindow());
        window.setScene(new Scene(root,600,400));
        window.setTitle("Cancel");
        window.show();
    }

    public void SwitchToBookScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Book.fxml"));
        Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow());
        window.setScene(new Scene(root, 600, 400));
        window.setTitle("Book");
        window.show();
    }

        public void SwitchToLogin(ActionEvent event) throws IOException {
            Parent root = FXMLLoader.load(getClass().getResource("PassengerLogin.fxml"));
            Stage window = (Stage) (((Node)event.getSource()).getScene().getWindow());
            window.setScene(new Scene(root,600,400));
            window.setTitle("Log In");
            window.show();
        }



}
