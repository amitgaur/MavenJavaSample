package com.mycompany.app;


public class Inter{
    
        public static void main(String... args){
            Inter i  = new Inter();

            int[][] arrays = new int[10][100];
            i.inter(arrays);
        }
        public int[] inter(int[][] arrays) {
            System.out.println(arrays.length);
            if (arrays.length>0){
                System.out.println(arrays[0].length);
            }
            return null;

        }

}
