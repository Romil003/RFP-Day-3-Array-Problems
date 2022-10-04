package com.bridgelabz;

public class LargestElement {
    public static void main(String[] args) {
        int b[] = {21,12,25,49,18,30,35};
        int a = b.length;
        int c = 0;
        int i = 0;
         for( i = 0 ; i< a-1 ; i++ ){
             for(int j = i+1 ; j<a; j++){
                 if(b[i]>b[j]){
                     c = b[i];
                     b[i] = b[j];
                     b[j] = c;
                 }
             }

         }
        System.out.println(b[i]);

    }
}
