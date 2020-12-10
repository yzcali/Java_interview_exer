package com.company;

public class Main6 {

    //reverse number
    public static void main(String[] args) {

        int num = 123675849 , reversed = 0;

        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    } //Reversed Number: 948576321

    /*
    //Reverse number 2. yol deger vermeden
    public static int reverse(int number)  {
        int reverse =0;
        int remainder=0;
        do {
            remainder=number%10;
            reverse = reverse*10 + remainder;
            number=number/10;

        } while (number> 0);

        return   reverse;
     */
    /* reverse number 3. yol
    public static void main(String[] args) {

        int num = 1234567, reversed = 0;

        for(;num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }

        System.out.println("Reversed Number: " + reversed);
    }
     */
}
