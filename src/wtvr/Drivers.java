package wtvr;

import java.util.ArrayList;

public class Drivers extends Human  {

    //object to access class of loginparserpassenger
    LoginParserDriver access;
    TripsParser accessd;
    //Array Of type Driver and will be filled by the array list in the loginparserpassenger class
    private ArrayList<Drivers> dataToFillBy;
    private ArrayList<Trips>  tripsArrayList;
    private ArrayList<Trips> driverProfileTrips;

    public ArrayList<Trips> getDriverProfileTrips() {
        return driverProfileTrips;
    }

    public void setDriverProfileTrips(ArrayList<Trips> driverProfileTrips) {
        this.driverProfileTrips = driverProfileTrips;
    }

    public ArrayList<Drivers> getDataToFillBy() {
        return dataToFillBy;
    }

    public void setDataToFillBy(ArrayList<Drivers> dataToFillBy) {
        this.dataToFillBy = dataToFillBy;
    }

    public ArrayList<Trips> getTripsArrayList() {
        return tripsArrayList;
    }

    public void setTripsArrayList(ArrayList<Trips> tripsArrayList) {
        this.tripsArrayList = tripsArrayList;
    }

//    public void PrintDriversInfo () {
//
//
//        for (int temp = 0 ; temp < dataToFillBy.size() ; temp++ ) {
//
//            System.out.println(dataToFillBy.get(temp).getUsername()+ " " + dataToFillBy.get(temp).getPassword());
//        }
//        }

    public void fillDriverProfile(){
        driverProfileTrips = new ArrayList<>();
        accessd = new TripsParser();
        this.driverProfileTrips=accessd.driverTripsAssigned();


    }



    public void FillDriversArrayList() {
        //instance
        dataToFillBy = new ArrayList<Drivers>();
        //instance
        access = new LoginParserDriver();
        //adding all data in one take from the index i want to start with

        dataToFillBy.addAll(0, access.DriversData());
    }

    public boolean validatePassenger(String username, String password){
        for(int temp = 0 ; temp<dataToFillBy.size() ;temp++ ){

            if(dataToFillBy.get(temp).getUsername().equals(username)&& dataToFillBy.get(temp).getPassword().equals(password)){
//                System.out.println("Access granted azmeli");

                //TODO: make a way for the user to read from his own file, brainstorm it with morty
                return true;
            }

        }
        return false;
    }}












