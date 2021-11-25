package com.company;

import java.util.Scanner;

public class Main {

    static void menu() throws CloneNotSupportedException {
        System.out.println("Chose :");
        System.out.println("1. Create Proletarian\n" +
                "2. Create Warrior\n" +
                "3. Create Mage\n" +
                "4. Create Rogue\n" +
                "5. Display Character List\n" +
                "6. Display Character Info\n" +
                "7. Delete Character \n" +
                "8. Initiate Fight\n" +
                "9. Quit");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        sc.nextLine();
        if (choice == 9) {
            //quitte le programme
            System.exit(0);

        } else if (choice == 1) {
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

        }else if(choice == 2){
            //créer un nouveau guerrier
            System.out.println("Name your Warrior : ");
            String nameWarrior = sc.nextLine();
            System.out.println("Define Hp for " + nameWarrior + " ");
            int HP = sc.nextInt();
            System.out.println("Define Strength for " + nameWarrior);
            int Strength = sc.nextInt();
            System.out.println("Define Speed (Initiative) for " + nameWarrior);
            int Speed = sc.nextInt();
            System.out.println("Define Shield Strength for " + nameWarrior);
            int shieldStrength = sc.nextInt();
            Proletarian Warrior = new Warrior(nameWarrior, HP, Strength, Speed, shieldStrength);
            System.out.println("Character " + nameWarrior + " successfully created");
            GestionCHR.characters.add(Warrior);
            GestionCHR.charNames.add(nameWarrior);
            menu();

        }else if(choice == 3){
            //créer un nouveau Mage
            System.out.println("Name your Mage : ");
            String name = sc.nextLine();
            System.out.println("Define Hp for " + name + " ");
            int HP = sc.nextInt();
            System.out.println("Define Strength for " + name);
            int Strength = sc.nextInt();
            System.out.println("Define Speed (Initiative) for " + name);
            int Speed = sc.nextInt();
            System.out.println("Define Magic Damage for " + name);
            int magicDmg = sc.nextInt();
            Proletarian Mage = new Mage(name, HP, Strength, Speed, magicDmg);
            System.out.println("Character " + name + " successfully created");
            GestionCHR.characters.add(Mage);
            GestionCHR.charNames.add(name);
            menu();


        }else if(choice == 4){
            //créer un nouveau Voleur
            System.out.println("Name your Rogue : ");
            String name = sc.nextLine();
            System.out.println("Define Hp for " + name + " ");
            int HP = sc.nextInt();
            System.out.println("Define Strength for " + name);
            int Strength = sc.nextInt();
            System.out.println("Define Speed (Initiative) for " + name);
            int Speed = sc.nextInt();
            System.out.println("Define Dodge Chances (%) for " + name);
            int DodgeChance = sc.nextInt();
            System.out.println("Define Critical Hit Chances (%) for " + name);
            int CritChance = sc.nextInt();
            Proletarian Rogue = new Rogue(name, HP, Strength, Speed, DodgeChance, CritChance);
            System.out.println("Character " + name + " successfully created");
            GestionCHR.characters.add(Rogue);
            GestionCHR.charNames.add(name);
            menu();

        }else if (choice == 5) {
            //Affiche la liste des persos et leur position
            for (int i = 0; i < GestionCHR.charNames.size(); i++) {
                System.out.println("Fighter " + (i + 1) + " " + GestionCHR.charNames.get(i));
            }
            menu();

        } else if (choice == 6) {
            //Affiche les infos d'un perso spécifique
            System.out.println("Input Character's number ");
            int charac = sc.nextInt();
            System.out.println(GestionCHR.characters.get(charac - 1));
            menu();


        }else if (choice == 7){
            GestionCHR list = new GestionCHR();
            System.out.println("Select Character To Delete :");
            for (int i = 0; i < GestionCHR.characters.size(); i++) {
                System.out.println((i+1) + " " + GestionCHR.characters.get(i));
            }
            int index = sc.nextInt();
            list.DeleteCharacter(index);
            System.out.println("Character Successfully Deleted\n");
            System.out.println();
            menu();
        }
        else if (choice == 8) {
//            //Bagarre Time !
            GestionCHR list = new GestionCHR();
            for (int i = 0; i < GestionCHR.characters.size(); i++) {
                System.out.println("Fighter " + (i+1) + " " + GestionCHR.characters.get(i));
            }
            //selection combattant 1
            System.out.println("Choose Fighter One : ");
            int indexOp1 = sc.nextInt() - 1;
            Proletarian Fighter = list.GetCharacter(indexOp1);
            Proletarian FighterC1 = (Proletarian) Fighter.clone();

            //selection combattant 2
            System.out.println("Choose Fighter Two : ");
            int indexOp2 = sc.nextInt() - 1;
            Proletarian Fighter1 = list.GetCharacter(indexOp2);
            Proletarian FighterC2 = (Proletarian) Fighter1.clone();
            int coinFlip = (int) Math.random() <= 0.5 ? 1 : 2;

            if (FighterC1.speed == FighterC2.speed){
                System.out.println("Both Fighters have equal speed");
                System.out.println("We toss a coin to decide who goes first");
            }

            while (FighterC1.HP > 0 && FighterC2.HP > 0) {
                //tant que les deux tiennent debout
                if (FighterC1.speed > FighterC2.speed) {
                    int hit = FighterC1.getDamages();
                    System.out.println(FighterC1.name + " Attacks ");
                    //attaque du fighter 1
                    System.out.println(FighterC1.name + " Deals " + hit + " points of damage");
                    FighterC2.takeDamages(hit);
                    //on affiche les pv restants
                    System.out.println("Remaining Hp of" + FighterC2.name + " = " + FighterC2.HP);
                    // Nouvelle Bagarre
                    System.out.println(FighterC2.name + " Attacks ");
                    int hit2 = FighterC2.getDamages();
                    //attaque du fighter 2
                    System.out.println(FighterC2.name + " Deals " + hit2 + " points of damage");
                    FighterC1.takeDamages(hit2);
                    //on affiche les pv restants
                    System.out.println("Remaining Hp of " + FighterC1.name + " = " + FighterC1.HP);
                    System.out.println("Press enter to continue");
                    sc.nextLine();

                } else if (FighterC1.speed < FighterC2.speed) {
                    System.out.println(FighterC2.name + " Attacks ");
                    int hit = FighterC2.getDamages();
                    //attaque du fighter 1
                    System.out.println(FighterC2.name + " Deals " + hit + " points of damage");
                    FighterC1.takeDamages(hit);
                    //on affiche les pv restants
                    System.out.println("Remaining Hp of " + FighterC1.name + " = " + FighterC1.HP);
                    // Nouvelle Bagarre
                    System.out.println(FighterC1.name + " Attacks ");
                    int hit2 = FighterC1.getDamages();
                    //attaque du fighter 2
                    System.out.println(FighterC1.name + " Deals " + hit2 + " points of damage");
                    FighterC2.takeDamages(hit2);
                    //on affiche les pv restants
                    System.out.println("Remaining Hp of" + FighterC2.name + " = " + FighterC2.HP);
                    System.out.println("Press enter to continue");
                    sc.nextLine();

                }else{
                    if (coinFlip == 1){
                        System.out.println(FighterC1.name + " Attacks ");
                        int hit = FighterC1.getDamages();
                        //attaque du fighter 1
                        System.out.println(FighterC1.name + " Deals " + hit + " points of damage");
                        FighterC2.takeDamages(hit);
                        //on affiche les pv restants
                        System.out.println("Remaining Hp of " + FighterC2.name + " = " + FighterC2.HP);
                        // Nouvelle Bagarre
                        System.out.println(FighterC2.name + " Attacks ");
                        int hit2 = FighterC2.getDamages();
                        //attaque du fighter 2
                        System.out.println(FighterC2.name + " Deals " + hit2 + " points of damage");
                        FighterC1.takeDamages(hit2);
                        //on affiche les pv restants
                        System.out.println("Remaining Hp of " + FighterC1.name + " = " + FighterC1.HP);
                        System.out.println("Press enter to continue");
                        sc.nextLine();
                    }
                    else{
                        System.out.println(FighterC2.name + " Attacks ");
                        int hit = FighterC2.getDamages();
                        //attaque du fighter 1
                        System.out.println(FighterC2.name + " Deals " + hit + "points of damage");
                        FighterC1.takeDamages(hit);
                        //on affiche les pv restants
                        System.out.println("Remaining Hp of " + FighterC1.name + " = " + FighterC1.HP);
                        // Nouvelle Bagarre
                        System.out.println(FighterC1.name + " Attacks ");
                        int hit2 = FighterC1.getDamages();
                        //attaque du fighter 2
                        System.out.println(FighterC1.name + " Deals " + hit2 + "points of damage");
                        FighterC2.takeDamages(hit2);
                        //on affiche les pv restants
                        System.out.println("Remaining Hp of" + FighterC2.name + " = " + FighterC2.HP);
                        System.out.println("Press any key to continue");
                        sc.nextLine();
                    }
                }
            }
            if (FighterC2.HP <= 0){
                System.out.println(FighterC1.name + " won the hustle, he clapped his opponnent's cheeks");
            }
            else {
                System.out.println(FighterC2.name + " won the hustle, he clapped his opponnent's cheeks");
            }
            System.out.println("Press enter to return to menu");
            sc.nextLine();
            menu();
        }
    }


//    void Fight() throws CloneNotSupportedException {
//        GestionCHR list = new GestionCHR();
//        Scanner sc = new Scanner(System.in);
//        System.out.println(GestionCHR.characters);
//        //selection combattant 1
//        System.out.println("Choose Fighter One  : ");
//        int indexOp1 = sc.nextInt()-1;
//        Proletarian Fighter = list.GetCharacter(indexOp1);
//        Proletarian FighterC1 = (Proletarian)Fighter.clone();
//
//        //selection combattant 2
//        System.out.println("Choose Fighter Two : ");
//        int indexOp2 = sc.nextInt()-1;
//        Proletarian Fighter1 = list.GetCharacter(indexOp2);
//        Proletarian FighterC2 = (Proletarian)Fighter1.clone();
//
//        while (FighterC1.HP > 0 && FighterC2.HP > 0) {
//            //tant que les deux tiennent debout
//            if (FighterC1.speed > FighterC2.speed) {
//                System.out.println(FighterC1.name + " Attacks ");
//                int hit = FighterC1.getDamages();
//                //attaque du fighter 1
//                System.out.println(FighterC1.name + " Deals " + hit + "points of damage");
//                FighterC2.takeDamages(hit);
//                //on affiche les pv restants
//                System.out.println("Remaining Hp of " + FighterC1.name + " = " + FighterC1.HP) ;
//                System.out.println("Remaining Hp of" + FighterC2.name + " = " + FighterC2.HP) ;
//                // Nouvelle Bagarre
//                System.out.println(FighterC2.name + " Attacks ");
//                int hit2 = FighterC2.getDamages();
//                //attaque du fighter 2
//                System.out.println(FighterC2.name + " Deals " + hit + "points of damage");
//                FighterC1.takeDamages(hit2);
//                //on affiche les pv restants
//                System.out.println("Remaining Hp of " + FighterC1.name + " = " + FighterC1.HP) ;
//                System.out.println("Remaining Hp of" + FighterC2.name + " = " + FighterC2.HP) ;
//                sc.next();
//
//            }else if(FighterC1.speed < FighterC2.speed){
//                System.out.println(FighterC2.name + " Attacks ");
//                int hit = FighterC2.getDamages();
//                //attaque du fighter 1
//                System.out.println(FighterC2.name + " Deals " + hit + "points of damage");
//                FighterC1.takeDamages(hit);
//                //on affiche les pv restants
//                System.out.println("Remaining Hp of " + FighterC1.name + " = " + FighterC1.HP) ;
//                System.out.println("Remaining Hp of" + FighterC2.name + " = " + FighterC2.HP) ;
//                // Nouvelle Bagarre
//                System.out.println(FighterC1.name + " Attacks ");
//                int hit2 = FighterC1.getDamages();
//                //attaque du fighter 2
//                System.out.println(FighterC1.name + " Deals " + hit + "points of damage");
//                FighterC2.takeDamages(hit2);
//                //on affiche les pv restants
//                System.out.println("Remaining Hp of " + FighterC1.name + " = " + FighterC1.HP) ;
//                System.out.println("Remaining Hp of" + FighterC2.name + " = " + FighterC2.HP) ;
//                sc.next();
//
//            }
//        }






    public static void main(String[] args) throws CloneNotSupportedException {
        menu();
    }
}