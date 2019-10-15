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


public class RemoveTripController {

    @FXML private TextArea TextAreaC;

  boolean counter =false;
  Boolean counter1=true;
  int counting=0;
  boolean counter3 = true;

    public void ListAllTrips() {
        BusStation busStation = BusStation.getInstance();
        if (!busStation.getMainTrips().isEmpty()) {
            if (counter) {
                TextAreaC.appendText("-------------------------------------------\nNew Trips List :\n");
                counter = false;

            }
            if (counter1) {
                TextAreaC.appendText("Type" + " " + "Source" + " " + "Destination" + " " + "Circle" + " " + "Vehicle"+ " " + "Seats" + " " + "Stops" + " " + "Tickets" + "\n");
                for (int temp = 0; temp < busStation.getMainTrips().size(); temp++) {
                    TextAreaC.appendText(temp+1 +  "-" + busStation.getMainTrips().get(temp).getType() + " " + busStation.getMainTrips().get(temp).getSource() + " " + busStation.getMainTrips().get(temp).getDestination() + " " + busStation.getMainTrips().get(temp).getCircle() + " " + busStation.getMainTrips().get(temp).getVehicle() + " " + busStation.getMainTrips().get(temp).getSeats() + " " + busStation.getMainTrips().get(temp).getStops() + " " + busStation.getMainTrips().get(temp).getTicket() + "\n");
                    counter1 = false;
                }
            }
            counting = 1;
        }else if(counter3) {TextAreaC.appendText("All Trips Are Deleted");
        counter3=false;
        }
    }

    public void RemoveTrip1() {

        BusStation busStation = BusStation.getInstance();
        if (!busStation.getMainTrips().isEmpty()) {
            if (counting == 1) {
                busStation.getMainTrips().remove(0);
                counter1 = true;
                counter = true;
            }
        }
    }

    public void RemoveTrip2() {

        BusStation busStation = BusStation.getInstance();
        if (!busStation.getMainTrips().isEmpty()) {
            if (counting == 1) {
                busStation.getMainTrips().remove(1);
                counter1 = true;
                counter = true;
            }
        }
    }

    public void RemoveTrip3() {

        BusStation busStation = BusStation.getInstance();
        if (!busStation.getMainTrips().isEmpty()) {
            if (counting == 1) {
                busStation.getMainTrips().remove(2);
                counter1 = true;
                counter = true;
            }
        }
    }

    public void RemoveTrip4() {

        BusStation busStation = BusStation.getInstance();
        if (!busStation.getMainTrips().isEmpty()) {
            if (counting == 1) {
                busStation.getMainTrips().remove(3);
                counter1 = true;
                counter = true;
            }
        }
    }

    public void RemoveTrip5() {

        BusStation busStation = BusStation.getInstance();
        if (!busStation.getMainTrips().isEmpty()) {
            if (counting == 1) {
                busStation.getMainTrips().remove(4);
                counter1 = true;
                counter = true;
            }
        }
    }

    public void RemoveTrip6() {

        BusStation busStation = BusStation.getInstance();
        if (!busStation.getMainTrips().isEmpty()) {
            if (counting == 1) {
                busStation.getMainTrips().remove(5);
                counter1 = true;
                counter = true;
            }
        }
    }

    public void RemoveTrip7() {

        BusStation busStation = BusStation.getInstance();
        if (!busStation.getMainTrips().isEmpty()) {
            if (counting == 1) {
                busStation.getMainTrips().remove(6);
                counter1 = true;
                counter = true;
            }
        }
    }

    public void RemoveTrip8() {

        BusStation busStation = BusStation.getInstance();
        if (!busStation.getMainTrips().isEmpty()) {
            if (counting == 1) {
                busStation.getMainTrips().remove(7);
                counter1 = true;
                counter = true;
            }
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
