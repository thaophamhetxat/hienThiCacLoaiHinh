package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        choice = input.nextInt();

        if(choice==2){
            for (int i=1;i<=5;i++){
                System.out.println(" ");
                for (int j=1;j<i;j++){
                    System.out.print(" * ");
                }
            }

        }
        if(choice==3){
            for(int i = 5; i>=1;i--){
                System.out.println(" ");
                for (int j = 1; j<=i;j++){
                    System.out.print(" * ");
                }
            }
        }
        if(choice==1){
            for(int i=1;i<=4;i++){
                System.out.println(" ");
                for(int j=0;j<6;j++){
                    System.out.print(" * ");
                }
            }
        }
        if(choice==4){
            System.out.println("No Choise");
        }


    }
}
