package ex_9thfeb_tasks;

import java.util.Scanner;

public class LeftTriangleStarPattern {

    public static void main(String[] args) {
// *****
//
//****
//
//***
//
//**
// *

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows");
        int rows = sc.nextInt();
        for (int i = 5;i>=1;i--)
        {
            for(int j = 1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
