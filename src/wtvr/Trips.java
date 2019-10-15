package wtvr;




//TODO: A CONSTRUCTOR IN ALL CLASSES THAT WILL USE THE TRIPS AND SEND THEM AN ARRAY LIST OF TRIPS SO IF THE ADMIN MAKE A CHANGE IT GET CHANGED IN ALL THE OTHER CLASSES


public  class  Trips {
    private String type;
    private String source;
    private String destination;
    private String circle;
    private String stops;
    private String vehicle;
    private String seats;
    private String ticket;







    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getCircle() {
        return circle;
    }

    public void setCircle(String circle) {
        this.circle = circle;
    }

    public String getStops() {
        return stops;
    }

    public void setStops(String stops) {
        this.stops = stops;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }
}
