package FlightControl.logic;

import FlightControl.domain.Flight;
import FlightControl.domain.Place;
import FlightControl.domain.Plane;

import java.util.Collection;
import java.util.HashMap;

public class FlightControl {
    private HashMap<String,Flight> flights;
    private HashMap<String, Place> place;
    private HashMap<String, Plane> plane;

    public FlightControl(){
        this.place = new HashMap<>();
        this.plane = new HashMap<>();
        this.flights = new HashMap<>();
    }

    public void addPlane(String id, int capacity){
        plane.putIfAbsent(id,new Plane(id,capacity));
    }

    public void addFlight(Plane plane,String departure,String destination){
        this.place.putIfAbsent(departure,new Place(departure));
        this.place.putIfAbsent(destination,new Place(destination));
        Flight flight = new Flight(plane,this.place.get(departure),this.place.get(destination));
        flights.put(flight.toString(),flight);
    }

    public Collection<Plane> getPlanes() {
        return this.plane.values();
    }

    public Collection<Flight> getFlights() {
        return this.flights.values();
    }

    public Plane getPlane(String ID) {
        return this.plane.get(ID);
    }
}
