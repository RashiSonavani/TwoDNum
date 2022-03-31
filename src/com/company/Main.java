package com.company;

class TwoDNum {

    public static void main(String[] args) {

        int i,j , sum= 0;
        int matrix[][]= new int[10][10];

        for(i=0;i< matrix.length;i++){
            for(j=0; j< matrix.length; j++)
            {
                if (i == j)
                {
                    matrix[i][j] = i;
                    sum += matrix[i][j];
                }
                else
                {
                    matrix[i][j] = 0;
                }
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Sum of Diagonal Line: " + sum);
    }
}