package com.stackroute.lambdanstreamexercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StreamDemo {
    private String country,state;

    public StreamDemo(String country, String state) {
        this.country = country;
        this.state = state;
    }

    @Override
    public String toString() {
        return "StreamDemo{" +
                "country='" + country + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public static void main(String[] args)
    {
        //a hash map for places is created
        ArrayList<StreamDemo> places=new ArrayList<>();

        //add values to map
        places.add(new StreamDemo("Nepal", "Kathmandu"));
        places.add(new StreamDemo("Nepal", "Pokhara"));
        places.add(new StreamDemo("India", "Delhi"));
        places.add(new StreamDemo("USA", "New York"));
        places.add(new StreamDemo("Africa", "Nigeria"));

        places.stream().filter(place->place.country.equals("Nepal")).forEach(p->System.out.println(p.state));
    }

}
