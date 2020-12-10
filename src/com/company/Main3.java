package com.company;

public class Main3 {
    public static void main(String[] args){
        //sum of digits
        int number =17892564;
        int sum=0;

        while(number>0){
            sum+=number%10;
            number=number/10;
        }
        System.out.println("sum of digits: "+sum);
    }
    //sum of digits: 42
}
