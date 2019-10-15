package wtvr;

import java.util.ArrayList;

public class DriversProfiles {

    private String Username;
    private ArrayList<Trips> AssignedTrips = new ArrayList<Trips>();

    public String getUsername() {
        return this.Username;
    }

    public ArrayList<Trips> getProfileTrips() {
        return this.AssignedTrips;
    }

    public void setUsername(String username) {
        this.Username = username;
    }

    public void setProfileTrips(ArrayList<Trips> profileTrips) {
        this.AssignedTrips = profileTrips;
    }

    public void BookATrip(Trips Trip){

        this.AssignedTrips.add(Trip);

    }
}
