package com.bridgelabz;

public class FrequencyOfElementInArray {
    public static void main(String[] args) {
        int b[] = {21,12,25,18,12,30,35,18,25};
        int frq[] = new int[b.length];
        int visited = -1;

        for(int i = 0; i< b.length  ; i++){
            int count = 1 ;

            for(int j = i+1 ; j<b.length ; j++){
                if(b[i] == b[j]){
                    count++;
                    frq[j] = visited;
                }

            }
            if (frq[i] != visited){
                frq[i] = count;
                System.out.println(b[i] + " is " + frq[i] + " times ");
            }



        }
    }
}
