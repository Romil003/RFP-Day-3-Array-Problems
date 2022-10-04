package com.bridgelabz;

public class ReverseArray {
    public static void main(String[] args) {
        int b[] = {21, 12, 25, 49, 18, 30, 35};

        for (int i = b.length-1 ; i>=0  ; i--){
            System.out.print(b[i] + " ");
        }
    }
}
