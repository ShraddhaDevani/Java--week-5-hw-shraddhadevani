package javaprogramme;

import java.util.HashMap;
import java.util.Map;

/**
 * Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */
public class Programme_10_TubeLinesInZone1 {
    public static void main(String[] args) {
        // Create a map to associate Zone 1 stations with the lines that pass through them
        Map<String, String> zone1stations = new HashMap();

        // Zone 1 station names and their corresponding lines
        zone1stations.put("Baker Street", "Bakerloo, Circle, Hammersmith & City, Jubilee, Metropolitan");
        zone1stations.put("Kings Cross St Pancras", "Circle, Hammersmith & City, Metropolitan, Northern, Piccadilly, Victoria");
        zone1stations.put("Waterloo", "Bakerloo, Jubilee, Northern, Waterloo & City");
        zone1stations.put("London Bridge", "Jubilee, Northern");

        //Specify the station you want to query
        String stationName = "Waterloo";

        //Enter a zone 1 station name to find out which tube lines pass through it
        if (zone1stations.containsKey(stationName)) {
            String tubeLines = zone1stations.get(stationName);
            System.out.println("Tube lines passing through " + stationName + " : " + tubeLines);
        } else {
            System.out.println("Station not found in Zone 1. ");
        }
    }
}
