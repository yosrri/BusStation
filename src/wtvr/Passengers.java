package wtvr;

import java.util.ArrayList;

public class Passengers extends Human {

    //object to access class of loginparserpassenger
    LoginParserPassenger access;
    //Array Of type passengers and will be filled by the array list in the loginparserpassenger class
    private ArrayList<Passengers> dataToFillBy;
    private ArrayList<Trips> tripsArrayList;
    private static ArrayList<Trips> passengerBookedTrips = new ArrayList<Trips>();

    public static ArrayList<Trips> getPassengerBookedTrips() {
        return passengerBookedTrips;
    }

    public static void setPassengerBookedTrips(ArrayList<Trips> passengerBookedTrips) {
        passengerBookedTrips = passengerBookedTrips;
    }
//    public void printTripsInfo(){
//        for (int temp = 0; temp < tripsArrayList.size(); temp++) {
//            System.out.println("-------------------------------------------------------------");
//            System.out.println(tripsArrayList.get(temp).getType());
//            System.out.println(tripsArrayList.get(temp).getSource());
//            System.out.println(tripsArrayList.get(temp).getDestination());
//            System.out.println(tripsArrayList.get(temp).getCircle());
//            System.out.println(tripsArrayList.get(temp).getStops());
//            System.out.println(tripsArrayList.get(temp).getVehicle());
//            System.out.println(tripsArrayList.get(temp).getSeats());
//            System.out.println(tripsArrayList.get(temp).getTicket());
//
//        }
//    }

    public ArrayList<Passengers> getDataToFillBy() {
        return dataToFillBy;
    }

    public void setDataToFillBy(ArrayList<Passengers> dataToFillBy) {
        this.dataToFillBy = dataToFillBy;
    }

    public ArrayList<Trips> getTripsArrayList() {
        return tripsArrayList;
    }

    public void reserve(int index,int numTickets){

       int c= Integer.parseInt(tripsArrayList.get(index).getSeats()) ;
       int b = c-numTickets;
       tripsArrayList.get(index).setSeats(String.valueOf(b));
       passengerBookedTrips = new ArrayList<>();
       passengerBookedTrips.add(tripsArrayList.get(index));
    }

    public void setTripsArrayList(ArrayList<Trips> tripsArrayList) {
        this.tripsArrayList = tripsArrayList;
    }
    public void PrintPassengersInfo(){

        for (int temp = 0 ; temp < dataToFillBy.size() ; temp++ ) {

            System.out.println(dataToFillBy.get(temp).getUsername()+ " " + dataToFillBy.get(temp).getPassword());
        }


    }
    public void FillPassengersArrayList() {
//        //instance
//        dataToFillBy = new ArrayList<Passengers>();
//        //instance
        access = new LoginParserPassenger();
        //adding all data in one take from the index i want to start with
//
//        dataToFillBy.addAll(0, access.PassengersData());
        dataToFillBy = access.PassengersData();

    }
    public boolean validatePassenger(String username, String password){
        for(int temp = 0 ; temp<dataToFillBy.size() ;temp++ ){

            if(dataToFillBy.get(temp).getUsername().equals(username)&& dataToFillBy.get(temp).getPassword().equals(password)){
//                System.out.println("Access granted azmeli");

                return true;
            }

        }
        return false;
    }


}