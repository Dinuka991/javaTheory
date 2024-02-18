package org.example.mapDemo;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

/**
 * Given an array of bird sightings where each element represents a bird type ID, determine the most frequently
 * sighted type ID. If multiple types share the maximum sighting count, return the smallest ID among them.
 */
public class MigratoryBirds {

    public static void main(String[] args) {
        List<Integer> arr = List.of(1, 4, 4, 4, 5, 3); // Use List.of for immutable lists

        int java11MethodResult = migratoryBirds(arr);
        int java17MethodResult = migratoryBirdsJava17(arr);

        System.out.println("Java 11: " + java11MethodResult);
        System.out.println("Java 17: " + java17MethodResult);

    }
    // Java 11 implementation
    public static int migratoryBirds(List<Integer> typeList) {
        // Count frequencies using HashMap
        Map<Integer, Integer> birdMap = new HashMap<>();
        for (int birdType : typeList) {
            birdMap.put(birdType, birdMap.getOrDefault(birdType, 0) + 1);
        }

        // Find the max frequency using Collections.max and filter entries with max frequency
        int maxFrequency = Collections.max(birdMap.values());
        List<Integer> maxFrequencyBirds = birdMap.entrySet().stream()
                .filter(entry -> entry.getValue() == maxFrequency)
                .map(Map.Entry::getKey).sorted(Comparator.naturalOrder()).toList();

        // Sort by bird type ID and return the smallest one
        return maxFrequencyBirds.get(0);
    }

    // Java 17 implementation (similar logic to Java 11)
    public static int migratoryBirdsJava17(List<Integer> typeList) {
        Map<Integer, Integer> birdMap = new HashMap<>();
        for (int birdType : typeList) {
            birdMap.put(birdType, birdMap.getOrDefault(birdType, 0) + 1);
        }

        int maxFrequency = Collections.max(birdMap.values());
        List<Integer> maxFrequencyBirds = birdMap.entrySet().stream()
                .filter(entry -> entry.getValue() == maxFrequency)
                .map(Map.Entry::getKey).sorted(Comparator.naturalOrder()).toList();

        return maxFrequencyBirds.get(0);
    }


}
