package org.example.mapDemo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {

    }

    public static int countFair(List<Integer> arr){

        Map<Integer,Integer> sockCont = new HashMap<>();
        int noOfpairs = 0;

        // count occurrences of each type of sock
        for(int sock: arr){
            sockCont.put(sock,sockCont.getOrDefault(sock,0)+1);
        }

        // count pairs of each socket

        return noOfpairs;
    }


    public void containsKey(Map<String, Integer> map, String key) {
        boolean contains = map.containsKey(key);
        System.out.println("Contains key " + key + ": " + contains);
    }



    public void addAllToMap(Map<String, Integer> map, Map<String, Integer> otherMap) {
        map.putAll(otherMap);
    }
    public void iterateMap(Map<String, Integer> map) {
        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key + " : " + value);
        }
    }

    public Integer getValue(Map<String, Integer> map, String key) {
        return map.get(key);
    }

    public void clearMap(Map<String, Integer> map) {
        map.clear();
    }

    public void updateValue(Map<String, Integer> map, String key, Integer newValue) {
        map.put(key, newValue);
    }

    public void removeFromMap(Map<String, Integer> map, String key) {
        map.remove(key);
    }

    public void addToMap(Map<String, Integer> map, String key, Integer value) {
        map.put(key, value);
    }

    public void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    /**
     * Map.merge method provide a way to automatically update the value associate with a key in a Map. It's
     * combined the existing value with new value  using provided BitFunction. The main benefit is that it's thread safe.
     */

    // Example 1

    public static void demoMerge(List<String> fruits){
        Map<String, Integer> cart = new HashMap<>();
        fruits.forEach( fruit -> cart.merge(fruit, 1 , Integer::sum));
    }





}
