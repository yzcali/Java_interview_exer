package com.company;

public class Main4 {

    //largest Number in Array using Collections

    public static int getLargest(int[] a, int total) {
        int temp;
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;


                }
            }
        }
        return a[total - 1];
    }

        public static void main(String args[]){
            int a[]={1,2,5,6,3,2,4,7};
            int b[]={44,66,89,77,33,22,55,65};
            System.out.println("Largest: "+getLargest(a,8));
            System.out.println("Largest: "+getLargest(b,8));




}  //Largest: 7
    //Largest: 89

}
