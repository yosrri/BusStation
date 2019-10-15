package wtvr;

import java.util.ArrayList;

public class Admins extends Human  {

    LoginParserAdmin access;
    TripsParser accessTripsParser;
    private ArrayList<Admins> dataToFillBy;
    private ArrayList<Trips> tripsArrayList = new ArrayList<>();



    public ArrayList<Admins> getDataToFillBy() {
        return dataToFillBy;
    }

    public void setDataToFillBy(ArrayList<Admins> dataToFillBy) {
        this.dataToFillBy = dataToFillBy;
    }

    public ArrayList<Trips> getTripsArrayList() {
        return tripsArrayList;
    }

    public void setTripsArrayList(ArrayList<Trips> tripsArrayList) {
        this.tripsArrayList = tripsArrayList;
    }


    public void addTrip(Trips a){
        tripsArrayList.add(a);
    }


    public void FillAdminsArrayList() {
        //instance
        this.dataToFillBy = new ArrayList<Admins>();
        //instance
        this.access = new LoginParserAdmin();
        //adding all data in one take from the index i want to start with

        this.dataToFillBy= this.access.AdminsData();

    }



    public void PrintAdminsInfo(){
        for (int temp = 0; temp < this.dataToFillBy.size(); temp++) {

            System.out.println(this.dataToFillBy.get(temp).getUsername() + " " + this.dataToFillBy.get(temp).getPassword());
        }
    }




    public boolean validateAdmin(String username, String password){
        for(int temp = 0 ; temp<this.dataToFillBy.size() ;temp++ ){

            if(this.dataToFillBy.get(temp).getUsername().equals(username) && this.dataToFillBy.get(temp).getPassword().equals(password)){
//                System.out.println("Access granted azmelti");

                //TODO: make a way for the user to read from his own file, brainstorm it with morty
                return true;
            }

        }
        return false;
    }













}