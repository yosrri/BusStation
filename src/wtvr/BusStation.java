package wtvr;

import java.util.ArrayList;

public class BusStation  {
    private static BusStation MyBusStation;
    private ArrayList<Trips> MainTrips = new ArrayList<Trips>() ;
    private TripsParser access;

    static{
        MyBusStation = new BusStation();
    }

    private BusStation(){

    }
    public static BusStation getInstance(){
        return MyBusStation;
    }


//    public void PrintTripsInfo(){
//        for (int temp = 0; temp < MainTrips.size(); temp++) {
//            System.out.println("-------------------------------------------------------------");
//            System.out.println(MainTrips.get(temp).getType());
//            System.out.println(MainTrips.get(temp).getSource());
//            System.out.println(MainTrips.get(temp).getDestination());
//            System.out.println(MainTrips.get(temp).getCircle());
//            System.out.println(MainTrips.get(temp).getStops());
//            System.out.println(MainTrips.get(temp).getVehicle());
//            System.out.println(MainTrips.get(temp).getSeats());
//            System.out.println(MainTrips.get(temp).getTicket());
//
//        }
//    }



    public void FillMainTrips(){

        access = new TripsParser();
        MainTrips=access.TripsData();



    }


    public ArrayList<Trips> getMainTrips() {


        return MainTrips;
    }

    public void setMainTrips(ArrayList<Trips> mainTrips) {
        this.MainTrips = mainTrips;
    }
}
