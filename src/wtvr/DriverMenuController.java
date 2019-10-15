package wtvr;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class DriverMenuController {

    boolean counter =true;
    boolean counter3 = true;

    @FXML private TextArea TextAreaD;

    public void ListDriverTrips(){

        Drivers drivers = new Drivers();
        drivers.fillDriverProfile();

        if (!drivers.getDriverProfileTrips().isEmpty()) {
            if (counter) {
                TextAreaD.appendText("Type" + " " + "Source" + " " + "Destination" + " " + "Circle" + " " + "Vehicle"+ " " + "Seats" + " " + "Stops" + " " + "Tickets" + "\n");
                TextAreaD.appendText(drivers.getDriverProfileTrips().get(0).getType() + " " + drivers.getDriverProfileTrips().get(0).getSource()+ " " + drivers.getDriverProfileTrips().get(0).getDestination()+ " " + drivers.getDriverProfileTrips().get(0).getCircle() + " " + drivers.getDriverProfileTrips().get(0).getStops() + " " + drivers.getDriverProfileTrips().get(0).getVehicle() + " " + drivers.getDriverProfileTrips().get(0).getSeats() + " " + drivers.getDriverProfileTrips().get(0).getTicket() + "\n");
            }
            counter = false;
        } else if(counter3) {TextAreaD.appendText("All Trips Are Deleted");
        counter3=false;
    }
}

    public void SwitchToLogin(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("DriverLogin.fxml"));
        Stage window = (Stage) (((Node)event.getSource()).getScene().getWindow());
        window.setScene(new Scene(root,600,400));
        window.setTitle("Log In");
        window.show();
    }


}
