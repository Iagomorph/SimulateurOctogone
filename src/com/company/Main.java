package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static void menu() {
        System.out.println("Chose :");
        System.out.println("1. Quit\n2. Create Proletarian\n3. Display Character List\n4. Display Character Info");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        sc.nextLine();
        if (choice == 1) {
            System.exit(0);
        } else if (choice == 2) {
            //créer un nouveau Prolétaire
            System.out.println("Name your Proletarian : ");
            String name = sc.nextLine();
            System.out.println("Define Hp for " + name + " ");
            int HP = sc.nextInt();
            System.out.println("Define Strength for " + name);
            int Strength = sc.nextInt();
            System.out.println("Define Speed (Initiative) for " + name);
            int Speed = sc.nextInt();
            Proletarian Proletarian = new Proletarian(name, HP, Strength, Speed);
            System.out.println("Character " + name + " successfully created");
            GestionCHR.characters.add(Proletarian);
            GestionCHR.charNames.add(name);
            menu();

        } else if (choice == 3) {
            for(int i = 0; i < GestionCHR.charNames.size(); i++) {
                System.out.println((i+1) + " " +  GestionCHR.charNames.get(i));
            }
            menu();
        }else if (choice == 4){
            System.out.println("Input Character's number ");
            int charac = sc.nextInt();
            System.out.println(GestionCHR.characters.get(charac-1));
            menu();
        }

    }


    public static void main(String[] args) {
        menu();
    }
}