package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayGamesTest {

    @org.junit.Test
    @Test
    public  void  testFindSecondLargestElementArray(){
        int[] arr= {1,2,4,5};
        int result = ArrayGames.findSecondLargestElementArray(arr);
        assertEquals(4,result);
    }
}
