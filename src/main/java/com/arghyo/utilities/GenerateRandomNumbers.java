package com.arghyo.utilities;

import java.util.Random;

public class GenerateRandomNumbers {
    public static void main(String... argvs) {
        
        GenerateRandomNumbers obj = new GenerateRandomNumbers();
        int[] returnIntArray = obj.generateNRandomNumbersInRange(-10, 10, 10);
        
        for(int i=0; i<10; i++){
            System.out.println(returnIntArray[i]);
        }
        
        
        
    }
    
    public int[] generateNRandomNumbersInRange(int min, int max, int n){
        int [] intArray = new int[n];
        
        Random rand = new Random();
        
        for(int i=0; i < n; i++){
            intArray[i] = rand.nextInt(max + 1 - min) + min;
        }
        return intArray;
        
        
    }
}
