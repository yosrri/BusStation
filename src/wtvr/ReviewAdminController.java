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

public class ReviewAdminController {

    @FXML
    private TextArea TextAreaC;
    boolean counter =true;
    boolean counter3 = true;

    public void ListAllTrips() {
        BusStation busStation = BusStation.getInstance();
        if (!busStation.getMainTrips().isEmpty()) {
            if (counter) {
                TextAreaC.appendText("Type" + " " + "Source" + " " + "Destination" + " " + "Circle" + " " + "Vehicle"+ " " + "Seats" + " " + "Stops" + " " + "Tickets" + "\n");
                for (int temp = 0; temp < busStation.getMainTrips().size(); temp++) {
                    TextAreaC.appendText(temp+1 +  "-" + busStation.getMainTrips().get(temp).getType() + " " + busStation.getMainTrips().get(temp).getSource() + " " + busStation.getMainTrips().get(temp).getDestination() + " " + busStation.getMainTrips().get(temp).getCircle() + " " + busStation.getMainTrips().get(temp).getVehicle() + " " + busStation.getMainTrips().get(temp).getSeats() + " " + busStation.getMainTrips().get(temp).getStops() + " " + busStation.getMainTrips().get(temp).getTicket() + "\n");
                }
            }
            counter = false;
        }else if(counter3) {TextAreaC.appendText("All Trips Are Deleted");
            counter3=false;
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
