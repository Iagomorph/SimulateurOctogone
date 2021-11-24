package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static void menu(){
        System.out.println("Chose :");
        System.out.println("1. Quit\n2. Create Proletarian\n3. Display Character List\n");
        Scanner sc = new Scanner(System.in);
        int choix = sc.nextInt();
        sc.nextLine();
        if (choix == 1){
            System.exit(0);
        }else if(choix == 2){
            System.out.println("Name your Proletarian : ");
            String name = sc.nextLine();
            System.out.println("Define Hp for " + name + " ");
            int HP = sc.nextInt();
            System.out.println("Define Strength for "+ name );
            int Strength = sc.nextInt();
            System.out.println("Define Speed (Initiative) for " +name);
            int Speed = sc.nextInt();
            Proletarian Proletarian = new Proletarian(name,HP,Strength,Speed);
            System.out.println("Character "+ name +" successfully created");
            String charinf = Proletarian.toString();
            GestionCHR.characters.add(charinf);
            menu();

        }else if(choix == 3){
            for(Object s : GestionCHR.characters){
                System.out.println(s);

            }

        }
    }

    public static void main(String[] args) {
        menu();
    }
}
