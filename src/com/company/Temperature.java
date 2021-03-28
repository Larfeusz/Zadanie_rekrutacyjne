package com.company;

import java.util.*;

public class Temperature {
    public Set<Integer> findTheClosestTempToZero (List<Integer> listOfTemperatures){
        TreeMap<Integer, Set<Integer>> lengthFromZeroToTemperature = new TreeMap<>();
        for(int singleTemp : listOfTemperatures){
            if(singleTemp == 0){
                return new HashSet<>(Arrays.asList(singleTemp));
            }
            if(!lengthFromZeroToTemperature.containsKey(Math.abs(singleTemp))){
                lengthFromZeroToTemperature.put(Math.abs(singleTemp), new HashSet<>(Arrays.asList(singleTemp)));
            }else{
                lengthFromZeroToTemperature.get(Math.abs(singleTemp)).add(singleTemp);
            }
        }
        return lengthFromZeroToTemperature.firstEntry().getValue();
    }
}
