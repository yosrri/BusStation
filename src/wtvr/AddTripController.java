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

public class AddTripController {

    @FXML private TextField TextField1, TextField2,TextField3, TextField4, TextField5, TextField6, TextField7, TextField8;
    @FXML private Label LabelConfirm, LabelFalse;

    public void AddingTrip(){

        boolean Condition = TextField1.getText().equals("") || TextField2.getText().equals("") || TextField3.getText().equals("") || TextField4.getText().equals("") || TextField5.getText().equals("") || TextField6.getText().equals("") || TextField7.getText().equals("") || TextField8.getText().equals("");

        Trips trips = new Trips();

        if(!Condition) {
            trips.setType(TextField1.getText());
            trips.setSource(TextField2.getText());
            trips.setDestination(TextField3.getText());
            trips.setCircle(TextField4.getText());
            trips.setStops(TextField5.getText());
            trips.setVehicle(TextField6.getText());
            trips.setSeats(TextField7.getText());
            trips.setTicket(TextField8.getText());

            BusStation busStation = BusStation.getInstance();
            busStation.getMainTrips().add(trips);
            LabelConfirm.setVisible(true);
            LabelFalse.setVisible(false);
        } else {LabelFalse.setVisible(true);
            LabelConfirm.setVisible(false);
        }
    }

    public void SwitchToAdminMenu(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AdminMenu.fxml"));
        Stage window = (Stage) (((Node)event.getSource()).getScene().getWindow());
        window.setScene(new Scene(root,600,400));
        window.setTitle("Admin Menu");
        window.show();
    }
}
