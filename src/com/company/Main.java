package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 17, 3, 5, 7};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int b = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = b;
                }

            }
        }
        for (int i : arr) {
           System.out.print(i + "\t");
        }
        {
            System.out.println();
        }
        {
            int[] arrb = {45, 78, 98, 4, 675, 345, 23, 2, 234, 35423};
            for (int i = 1; i < arrb.length; i++) {
                int c = arrb[i];
                int p = i - 1;
                while (p >= 0 && arrb[p] > c) {
                    arrb[p + 1] = arrb[p];
                    p--;
                }
                arrb[p + 1] = c;
            }
            {
                for (int c : arrb)
                    System.out.print(c + "\t");
            }
        }
    }

}



