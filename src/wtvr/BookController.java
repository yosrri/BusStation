package wtvr;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class BookController {

    @FXML private TextArea TextAreaC;
    @FXML private Hyperlink HyperLink1;

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
        }else if(counter3) {TextAreaC.appendText("No Trips Available");
            counter3=false;
        }
    }


    public void AddTrip1() {

        BusStation busStation = BusStation.getInstance();
        Passengers.getPassengerBookedTrips().add(busStation.getMainTrips().get(0));


    }

    public void AddTrip2() {

        BusStation busStation = BusStation.getInstance();
        Passengers.getPassengerBookedTrips().add(busStation.getMainTrips().get(1));


    }

    public void AddTrip3() {

        BusStation busStation = BusStation.getInstance();
        Passengers.getPassengerBookedTrips().add(busStation.getMainTrips().get(2));


    }

    public void AddTrip4() {

        BusStation busStation = BusStation.getInstance();
        Passengers.getPassengerBookedTrips().add(busStation.getMainTrips().get(3));


    }

    public void AddTrip5() {

        BusStation busStation = BusStation.getInstance();
        Passengers.getPassengerBookedTrips().add(busStation.getMainTrips().get(4));


    }

    public void AddTrip6() {

        BusStation busStation = BusStation.getInstance();
        Passengers.getPassengerBookedTrips().add(busStation.getMainTrips().get(5));


    }

    public void AddTrip7() {

        BusStation busStation = BusStation.getInstance();
        Passengers.getPassengerBookedTrips().add(busStation.getMainTrips().get(6));


    }

    public void AddTrip8() {

        BusStation busStation = BusStation.getInstance();
        Passengers.getPassengerBookedTrips().add(busStation.getMainTrips().get(7));


    }



    public void SwitchToPassengerMenu(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("PassengerMenu.fxml"));
        Stage window = (Stage) (((Node)event.getSource()).getScene().getWindow());
        window.setScene(new Scene(root,600,400));
        window.setTitle("Passenger Menu");
        window.show();
    }
}
