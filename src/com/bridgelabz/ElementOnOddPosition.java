package com.bridgelabz;

public class ElementOnOddPosition {
    public static void main(String[] args) {
        int b[] = {21, 12, 25, 49, 18, 30, 35};
        int a = b.length;
        int position = 0;

        for (position = 0; position < a; position++) {
            if (position % 2 != 0) {
                System.out.println(b[position]);
            }
        }
    }
}
