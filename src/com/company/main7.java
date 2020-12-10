package com.company;

import java.util.Arrays;

public class main7 {
    public static void main(String args[]){
        // find first two Max number in an Array using variable

        int numbs []={1,12,5,6,33,26,4,7,12,58,22,44};

        Arrays.sort(numbs);
        System.out.println("Max1- "+(numbs[numbs.length-1])); //58
        System.out.println("Max2- "+(numbs[numbs.length-2]));  //44

}
}
