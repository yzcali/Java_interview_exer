package com.company;

public class Main {
 //fibonacci
    public static void main(String[] args) {
	int a= 0;
	int b = 1;
        System.out.println(a+" "+b+ " ");
        for (int i = 2; i<=10; i++){
            int c= a+b;
            a=b;
            b=c;
            System.out.println(c+ " + ");
        }
    }
    /*
0 1
1 +
2 +
3 +
5 +
8 +
13 +
21 +
34 +
55 +
     */
}
