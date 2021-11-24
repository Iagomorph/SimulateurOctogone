package com.company;

import java.util.Scanner;

public class Main {

    static void menu(){
        System.out.println("Chose :");
        System.out.println("1. Quit\n");
        Scanner sc = new Scanner(System.in);
        int choix = sc.nextInt();
        if (choix == 1){
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        menu();

    }
}
