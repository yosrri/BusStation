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

public class CancelController {

    @FXML private TextArea TextAreaC;

    boolean counter =false;
    Boolean counter1=true;
    int counting=0;
    boolean counter3 = true;

    public void ListAllTrips() {

        if (!Passengers.getPassengerBookedTrips().isEmpty()) {
            if (counter) {
                TextAreaC.appendText("-------------------------------------------\nNew Trips List :\n");
                counter = false;

            }
            if (counter1) {
                TextAreaC.appendText("Type" + " " + "Source" + " " + "Destination" + " " + "Circle" + " " + "Vehicle"+ " " + "Seats" + " " + "Stops" + " " + "Tickets" + "\n");
                for (int temp = 0; temp < Passengers.getPassengerBookedTrips().size(); temp++) {
                    TextAreaC.appendText((temp+1 +  "-" +  Passengers.getPassengerBookedTrips().get(temp).getType() + " " + Passengers.getPassengerBookedTrips().get(temp).getSource() + " " + Passengers.getPassengerBookedTrips().get(temp).getDestination() + " " + Passengers.getPassengerBookedTrips().get(temp).getCircle() + " " + Passengers.getPassengerBookedTrips().get(temp).getVehicle() + " " + Passengers.getPassengerBookedTrips().get(temp).getSeats() + " " + Passengers.getPassengerBookedTrips().get(temp).getStops() + " " + Passengers.getPassengerBookedTrips().get(temp).getTicket() + "\n"));
                    counter1 = false;
                }
            }
            counting = 1;
        }else if(counter3) {TextAreaC.appendText("All Trips Are Deleted");
            counter3=false;
        }
    }

    public void RemoveTrip1() {


        if (!Passengers.getPassengerBookedTrips().isEmpty()) {
            if (counting == 1) {
                Passengers.getPassengerBookedTrips().remove(0);
                counter1 = true;
                counter = true;
            }
        }
    }

    public void RemoveTrip2() {


        if (!Passengers.getPassengerBookedTrips().isEmpty()) {
            if (counting == 1) {
                Passengers.getPassengerBookedTrips().remove(1);
                counter1 = true;
                counter = true;
            }
        }
    }

    public void RemoveTrip3() {


        if (!Passengers.getPassengerBookedTrips().isEmpty()) {
            if (counting == 1) {
                Passengers.getPassengerBookedTrips().remove(2);
                counter1 = true;
                counter = true;
            }
        }
    }

    public void RemoveTrip4() {


        if (!Passengers.getPassengerBookedTrips().isEmpty()) {
            if (counting == 1) {
                Passengers.getPassengerBookedTrips().remove(3);
                counter1 = true;
                counter = true;
            }
        }
    }

    public void RemoveTrip5() {


        if (!Passengers.getPassengerBookedTrips().isEmpty()) {
            if (counting == 1) {
                Passengers.getPassengerBookedTrips().remove(4);
                counter1 = true;
                counter = true;
            }
        }
    }

    public void RemoveTrip6() {


        if (!Passengers.getPassengerBookedTrips().isEmpty()) {
            if (counting == 1) {
                Passengers.getPassengerBookedTrips().remove(5);
                counter1 = true;
                counter = true;
            }
        }
    }

    public void RemoveTrip7() {


        if (!Passengers.getPassengerBookedTrips().isEmpty()) {
            if (counting == 1) {
                Passengers.getPassengerBookedTrips().remove(6);
                counter1 = true;
                counter = true;
            }
        }
    }

    public void RemoveTrip8() {


        if (!Passengers.getPassengerBookedTrips().isEmpty()) {
            if (counting == 1) {
                Passengers.getPassengerBookedTrips().remove(7);
                counter1 = true;
                counter = true;
            }
        }
    }




    public void SwitchToPassengerMenu(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("PassengerMenu.fxml"));
        Stage window = (Stage) (((Node)event.getSource()).getScene().getWindow());
        window.setScene(new Scene(root,600,400));
        window.setTitle("Passenger Menu");
        window.show();
    }
}
