package com.stackroute.lambdanstreamexercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDemoNew {
    private String names;

    @Override
    public String toString() {
        return "StreamNewDemo{" +
                "names='" + names + '\'' +
                '}';
    }

    public StreamDemoNew(String names) {
        this.names = names;
    }

    public String getNames() {
        return names;
    }

    public static void main(String[] args)
    {
        //Creating an array list of object type StreamDemoNew Type
        ArrayList<StreamDemoNew> memberNames=new ArrayList<>();

        memberNames.add(new StreamDemoNew("Amitabh"));
        memberNames.add(new StreamDemoNew("Shekhar"));
        memberNames.add(new StreamDemoNew("Aman"));
        memberNames.add(new StreamDemoNew("ahana"));
        memberNames.add(new StreamDemoNew("Shahrukh"));
        memberNames.add(new StreamDemoNew("Salman"));
        memberNames.add(new StreamDemoNew("Yana"));
        memberNames.add(new StreamDemoNew("Lokesh"));

        //printing all the names starting with A
        memberNames.stream().filter(name->name.getNames().startsWith("A")).forEach(name->System.out.println(name));
        System.out.println("");

        //printing all names in upper case
        memberNames.forEach(name->System.out.println(name.toString().toUpperCase()));
        System.out.println("");

        //printing all the names ending with s in upper case
        memberNames.stream().filter(name->name.getNames().endsWith("s")).forEach(name->System.out.println(name.toString().toUpperCase()));
        System.out.println("");

        //count the names ending with h
        System.out.println(memberNames.stream().filter(name->name.getNames().endsWith("h")).count());
        System.out.println("");

        //printing the names starting with S
        memberNames.stream().filter(name->name.getNames().startsWith("S")).forEach(name->System.out.println(name));
        System.out.println("");

        //creating an array list of numbers
        List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8);

        numbers.stream().filter(num->num%2==0).forEach(num->System.out.println(num));
        System.out.println("");
    }
}
