package FlightControl.domain;

public class Flight {
    private Place destination;
    private Place departure;
    private Plane plane;

    public Flight(Plane plane,Place departure,Place destination){
        this.plane = plane;
        this.departure = departure;
        this.destination = destination;
    }

    public Plane getPlane(){
        return plane;
    }

    public Place getDeparture() {
        return departure;
    }

    public Place getDestination() {
        return destination;
    }

    public String toString(){
        return plane + " ("+departure+"-"+destination+")";
    }
}
