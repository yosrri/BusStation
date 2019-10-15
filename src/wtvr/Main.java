package wtvr;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {

        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("UserChoice.fxml"));
        primaryStage.setTitle("User Choice");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
        BusStation busStation = BusStation.getInstance();
        busStation.FillMainTrips();


//        LoginParserPassenger parserPassenger = new LoginParserPassenger();
//        parserPassenger.PassengersData();
//        Passengers passengers = new Passengers();
//        passengers.FillPassengersArrayList();
//        passengers.PrintPassengersInfo();
//
//
//        Admins admins = new Admins();
//
//
//        TripsParser tripsParser = new TripsParser();
//        //Parsing trips from xml files
//        tripsParser.TripsData();
//
//
//
//        BusStation busStation = new BusStation();
//        //Filled main trips from the parsed data
//        busStation.FillMainTrips();
//        // printing from busstation to make sure
//        busStation.PrintTripsInfo();
//        //sending the maintrips array list to the passenger to do wtvr he wants
//        passengers.setTripsArrayList(busStation.getMainTrips());
//        //printing to make sure
//        passengers.printTripsInfo();
//
//
//        //sending the maintrips array list to the admins to do wtvr
//        admins.setTripsArrayList(busStation.getMainTrips());
//        //printing to make sure
//        admins.PrintTripsInfo();
//
//        Trips trips = new Trips();
//        trips.setDestination("Italy");
//        trips.setSource("America");
//        trips.setType("Ay haga");
//        trips.setStops("3");
//
//
//        //sending the new trips to main trips
//        admins.addTrip(trips);
//        busStation.setMainTrips(admins.getTripsArrayList());
//        //  busStation.setMainTrips(admins.addTrip(trips));
//        System.out.println("AFTERTTTETEGDBDGKYF");
//        busStation.PrintTripsInfo();
//
//
//
    }
}
