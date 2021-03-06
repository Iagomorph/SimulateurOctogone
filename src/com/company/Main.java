package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    static void menu() throws CloneNotSupportedException, InterruptedException {

        System.out.println("Choose :");
        System.out.println("1. Create Character\n" +
                "2. About races and classes\n" +
                "3. Display Character List\n" +
                "4. Display Character Info\n" +
                "5. Delete Character \n" +
                "6. Initiate Fight\n" +
                "7. Quit");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        sc.nextLine();
        if (choice == 7) {
            //quitte le programme
            System.exit(0);

        }
        else if(choice == 1){
            System.out.println("Choose a Class\n" +
                    "1. Create Proletarian\n" +
                    "2. Create Warrior\n" +
                    "3. Create Mage\n" +
                    "4. Create Rogue\n" +
                    "5. Create Racist\n" +
                    "6. Create Witch\n" +
                    "7. Create Pyromancer\n" +
                    "8. Create Mage Warrior\n" +
                    "9. Return to Main Menu");
            int choiceChar = sc.nextInt();
            sc.nextLine();
            if (choiceChar == 1) {
                //créer un nouveau Prolétaire
                System.out.print("Name your Proletarian : ");
                String name = sc.nextLine();
                System.out.print("Define Hp for " + name + " : ");
                int HP = sc.nextInt();
                System.out.print("Define Strength for " + name+ " : ");
                int Strength = sc.nextInt();
                System.out.print("Define Speed (Initiative) for " + name+ " : ");
                int Speed = sc.nextInt();
                sc.nextLine();
                System.out.println("Races available: Elve, Orc, Human, Dwarf");
                System.out.print("Define " + name + "'s race"+ " : ");
                String race = sc.nextLine();
                Proletarian Proletarian = new Proletarian(name, HP, Strength, Speed, race);
                System.out.println("Character " + name + " successfully created");
                GestionCHR.characters.add(Proletarian);
                GestionCHR.charNames.add(name);
                menu();

            }
            else if(choiceChar == 2){
                //créer un nouveau guerrier
                System.out.print("Name your Warrior : ");
                String nameWarrior = sc.nextLine();
                System.out.print("Define Hp for " + nameWarrior + " : ");
                int HP = sc.nextInt();
                System.out.print("Define Strength for " + nameWarrior + " : ");
                int Strength = sc.nextInt();
                System.out.print("Define Speed (Initiative) for " + nameWarrior + " : ");
                int Speed = sc.nextInt();
                System.out.print("Define Shield Strength for " + nameWarrior + " : ");
                int shieldStrength = sc.nextInt();
                sc.nextLine();
                System.out.println("Races available: Elve, Orc, Human, Dwarf");
                System.out.print("Define " + nameWarrior + "'s race"+ " : ");
                String race = sc.nextLine();
                Proletarian Warrior = new Warrior(nameWarrior, HP, Strength, Speed, shieldStrength, race);
                System.out.println("Character " + nameWarrior + " successfully created");
                GestionCHR.characters.add(Warrior);
                GestionCHR.charNames.add(nameWarrior);
                menu();

            }else if(choiceChar == 3){
                //créer un nouveau Mage
                System.out.print("Name your Mage : ");
                String name = sc.nextLine();
                System.out.print("Define Hp for " + name + " : ");
                int HP = sc.nextInt();
                System.out.print("Define Strength for " + name+ " : ");
                int Strength = sc.nextInt();
                System.out.print("Define Speed (Initiative) for " + name+ " : ");
                int Speed = sc.nextInt();
                System.out.print("Define Magic Damage for " + name+ " : ");
                int magicDmg = sc.nextInt();
                sc.nextLine();
                System.out.println("Races available: Elve, Orc, Human, Dwarf");
                System.out.print("Define " + name + "'s race"+ " : ");
                String race = sc.nextLine();
                Proletarian Mage = new Mage(name, HP, Strength, Speed, magicDmg, race);
                System.out.println("Character " + name + " successfully created");
                GestionCHR.characters.add(Mage);
                GestionCHR.charNames.add(name);
                menu();


            }
            else if(choiceChar == 4){
                //créer un nouveau Voleur
                System.out.print("Name your Rogue : ");
                String name = sc.nextLine();
                System.out.print("Define Hp for " + name + " : ");
                int HP = sc.nextInt();
                System.out.print("Define Strength for " + name+ " : ");
                int Strength = sc.nextInt();
                System.out.print("Define Speed (Initiative) for " + name+ " : ");
                int Speed = sc.nextInt();
                System.out.print("Define Dodge Chances (%) for " + name+ " : ");
                int DodgeChance = sc.nextInt();
                System.out.print("Define Critical Hit Chances (%) for " + name+ " : ");
                int CritChance = sc.nextInt();
                sc.nextLine();
                System.out.println("Races available: Elve, Orc, Human, Dwarf");
                System.out.print("Define " + name + "'s race"+ " : ");
                String race = sc.nextLine();
                Proletarian Rogue = new Rogue(name, HP, Strength, Speed, DodgeChance, CritChance, race);
                System.out.println("Character " + name + " successfully created");
                GestionCHR.characters.add(Rogue);
                GestionCHR.charNames.add(name);
                menu();
            }
            else if(choiceChar == 5){
                //créer un nouveau Raciste
                System.out.print("Name your Racist : ");
                String name = sc.nextLine();
                System.out.print("Define Hp for " + name + " : ");
                int HP = sc.nextInt();
                System.out.print("Define Strength for " + name+ " : ");
                int Strength = sc.nextInt();
                System.out.print("Define Speed (Initiative) for " + name+ " : ");
                int Speed = sc.nextInt();
                sc.nextLine();
                System.out.println("Races available: Elve, Orc, Human, Dwarf");
                System.out.print("Define " + name + "'s race"+ " : ");
                String race = sc.nextLine();
                Proletarian Racist = new Racist(name, HP, Strength, Speed, race);
                System.out.println("Character " + name + " successfully created");
                GestionCHR.characters.add(Racist);
                GestionCHR.charNames.add(name);
                menu();

            } else if (choiceChar == 6) {
                //créer une nouvelle Sorcière
                System.out.println("Name your Witch : ");
                String name = sc.nextLine();
                System.out.println("Define Hp for " + name + " ");
                int HP = sc.nextInt();
                System.out.println("Define Strength for " + name);
                int Strength = sc.nextInt();
                System.out.println("Define Speed (Initiative) for " + name);
                int Speed = sc.nextInt();
                System.out.println("Define Number of Potions for " + name);
                int potionsQuantity = sc.nextInt();
                sc.nextLine();
                System.out.println("Races available: Elve, Orc, Human, Dwarf\n");
                System.out.println("Define " + name + "'s race");
                String race = sc.nextLine();
                Proletarian Witch = new Witch(name, HP, Strength, Speed, potionsQuantity, race);
                System.out.println("Character " + name + " successfully created");
                GestionCHR.characters.add(Witch);
                GestionCHR.charNames.add(name);
                menu();

            } else if (choiceChar == 7) {
                //créer un nouveau Pyromancien
                System.out.println("Name your Pyromancer : ");
                String name = sc.nextLine();
                System.out.println("Define Hp for " + name + " ");
                int HP = sc.nextInt();
                System.out.println("Define Strength for " + name);
                int Strength = sc.nextInt();
                System.out.println("Define Speed (Initiative) for " + name);
                int Speed = sc.nextInt();
                System.out.println("Define Number of Bombs for " + name);
                int bombsQuantity = sc.nextInt();
                sc.nextLine();
                System.out.println("Races available: Elve, Orc, Human, Dwarf\n");
                System.out.println("Define " + name + "'s race");
                String race = sc.nextLine();
                Proletarian Pyromancer = new Pyromancer(name, HP, Strength, Speed, bombsQuantity, race);
                System.out.println("Character " + name + " successfully created");
                GestionCHR.characters.add(Pyromancer);
                GestionCHR.charNames.add(name);
                menu();
            } else if (choiceChar == 8) {
                //créer un nouveau Mage Guerrier
                System.out.println("Name your Mage Warrior : ");
                String name = sc.nextLine();
                System.out.println("Define Hp for " + name + " ");
                int HP = sc.nextInt();
                System.out.println("Define Strength for " + name);
                int Strength = sc.nextInt();
                System.out.println("Define Speed (Initiative) for " + name);
                int Speed = sc.nextInt();
                System.out.println("Define Magic Damage for " + name);
                int magicDmg = sc.nextInt();
                System.out.println("Define Shield Strength for " + name);
                int shieldStrength = sc.nextInt();
                sc.nextLine();
                System.out.println("Races available: Elve, Orc, Human, Dwarf\n");
                System.out.println("Define " + name + "'s race");
                String race = sc.nextLine();
                Proletarian MageWarrior = new MageWarrior(name, HP, Strength, Speed, magicDmg, shieldStrength, race);
                System.out.println("Character " + name + " successfully created");
                GestionCHR.characters.add(MageWarrior);
                GestionCHR.charNames.add(name);
                menu();
            }else if(choiceChar == 9){
            menu();
            }
        }
        else if(choice == 2){
            System.out.println("------- About Classes ------");
            System.out.println("Proletarian\n" +
                    "Also known as farmers, this class doesn't provide any sort of advantage whatsoever.");
            System.out.println("Warrior:\n" +
                    "Warriors are Shield Wielding Fighters, each time they take a blow they'll block a flat amount of damage.");
            System.out.println("Mage:\n" +
                    "Mages are powerful Fighters in Short-terms fight, although they are pretty weak in terms of physical capacity,\n" +
                    " they compensate their lack of muscles by enhancing their attacks with magic, but the effects are halved after each attack.");
            System.out.println("Rogue:\n" +
                    "Rogues are mischievous fighters, relaying more on dexterity and precise strikes to overcome their opponents,\n" +
                    "  they have a chance to avoid hits as well as dealing critical strikes by targeting their opponents weaknesses (but not twice in a row)");
            System.out.println();
            System.out.println("Racist:\n" +
                    "Infamous brawlers, racists are mentally challenged fighters,\n" +
                    " they believe people who show any kind of difference are out to get them,\n" +
                    " they will recklessly attack fighters from a different race dealing thrice the damage,\n" +
                    " but it comes with a huge downside, they will game end themselves if they are to fight a member of their own race. ");
            System.out.println();
            System.out.println("Witch:\n" +
                    "From the deep swamps of distant lands, Witches come to the arena\n" +
                    "well equipped with their most trustworthy potions. During a fight,\n" +
                    "they never hesitate to either double their damage or heal their HP using\n" +
                    "one of their elixirs. Good thing witches don't have unlimited potions !");
            System.out.println();
            System.out.println("Pyromancer:\n" +
                    "Pyromancers never fail to bring the heat wherever they go !\n" +
                    "With the power of fire and explosions, they are very volatile fighters,\n" +
                    "sometimes even using bombs to deal incredible damage to the enemy, \n" +
                    "but hurting themselves in the way.");
            System.out.println();
            System.out.println("Mage Warrior:\n" +
                    "Mage Warriors are mages called to defend their kingdom from invaders.\n" +
                    "They have the power of mages, with the defensive abilities of warriors.\n" +
                    "As such, they can deal extra magic damage, \n" +
                    "and use their shield to receive and even negate incoming damage.");
            System.out.println();
            System.out.println("------- About Races ------");
            System.out.println("Elves:\n" +
                    "Elves are tall, slim and agile fighters used to moving on uneven grounds, they get a + 3 to Speed (initiative). ");
            System.out.println();
            System.out.println("Orcs:\n" +
                    "Orcs are brutal and savage beings born for war, they get a + 3 to Strength (Damage).");
            System.out.println();
            System.out.println("Humans:\n" +
                    "Humans are the most common inhabitants of the world living in cities and living a fairly uneventful life,\n they get a + 1 to Strength, Speed and HP");
            System.out.println();
            System.out.println("Dwarves:\n" +
                    "Dwarves are similar to Humans but smaller,\n their rough lifestyle in abrupt mountains forged them a stronger metabolism which grants their HP + 3");
            sc.nextLine();
            menu();
        }
        else if (choice == 3) {
            //Affiche la liste des persos et leur position
            for (int i = 0; i < GestionCHR.charNames.size(); i++) {
                System.out.println("Fighter " + (i + 1) + " " + GestionCHR.charNames.get(i));
            }
            menu();

        } else if (choice == 4) {
            //Affiche les infos d'un perso spécifique
            System.out.print("Input Character's number :");
            int charac = sc.nextInt();
            System.out.println(GestionCHR.characters.get(charac - 1));
            menu();


        }else if (choice == 5){
            GestionCHR list = new GestionCHR();
            System.out.println("Select Character To Delete :");
            for (int i = 0; i < GestionCHR.characters.size(); i++) {
                System.out.println((i+1) + " " + GestionCHR.characters.get(i));
            }
            int index = sc.nextInt();
            sc.nextLine();
            System.out.println("Are you sure you want to delete  " + GestionCHR.characters.get(index - 1) + " ? ");
            String confirm = sc.nextLine();
            if (confirm.equals("y")) {
                list.DeleteCharacter(index);
                System.out.println("Character Successfully Deleted");
                System.out.println();
                menu();
            }
            else {
                System.out.println("returning to menu...");
                menu();
            }
        }
        else if (choice == 6) {
//            //Bagarre Time !
            int turnBet = 0;
            int issueBet = 0;

            GestionCHR list = new GestionCHR();
            for (int i = 0; i < GestionCHR.characters.size(); i++) {
                System.out.println("Fighter " + (i+1) + " " + GestionCHR.characters.get(i));
            }
            //selection combattant 1
            System.out.print("Choose Fighter One : ");
            int indexOp1 = sc.nextInt() - 1;
            sc.nextLine();
            Proletarian Fighter = list.GetCharacter(indexOp1);
            Proletarian FighterC1 = (Proletarian) Fighter.clone();

            //selection combattant 2
            System.out.print("Choose Fighter Two : ");
            int indexOp2 = sc.nextInt() - 1;
            sc.nextLine();
            Proletarian Fighter1 = list.GetCharacter(indexOp2);
            Proletarian FighterC2 = (Proletarian) Fighter1.clone();
            int coinFlip = (int) Math.random() <= 0.5 ? 1 : 2;
            
            //pari
            System.out.print("Would you like to bet ? y/n : ");
            String bet = sc.nextLine();
            if (Objects.equals(bet, "y") || Objects.equals(bet, "Y")){
                System.out.println("What would you like to bet on ? : ");
                System.out.println("1. The issue of the fight\n2. The duration of the fight");
                int betType = sc.nextInt();
                sc.nextLine();
                if (betType == 1){
                    System.out.print("Which fighter do you favor ? ");
                    issueBet = sc.nextInt();
                    sc.nextLine();
                    System.out.println("you picked Fighter "+ issueBet);
                }else if (betType == 2){
                    System.out.print("How long do you think the fight will take ? ");
                    turnBet = sc.nextInt();
                    sc.nextLine();
                    System.out.println("you bet on turn " + turnBet);
                }else {
                    System.out.println("Philemon : 'T'es con, tu retourne au menu'");
                    menu();
                }
            }
// début du combat
            if (FighterC1.speed == FighterC2.speed){
                System.out.println("Both Fighters have equal speed");
                System.out.println("Tossing a coin to decide who goes first");
            }

            int millis = 680;
            int turnCount = 0 ;

            while (FighterC1.HP > 0 && FighterC2.HP > 0 && turnCount <= 20) {
                turnCount++;
                //int hit = FighterC1.getDamages(FighterC2.race);
                //int hit2 = FighterC2.getDamages(FighterC1.race);
                if (FighterC1.speed > FighterC2.speed) {
                    //nouveau tour
                    System.out.println(" ---------- Turn " + turnCount + " ----------");
                    Thread.sleep(millis);
                    System.out.println(FighterC1.name + " Attacks ");
                    Thread.sleep(millis);
                    //attaque du fighter 1
                    int hit = FighterC1.getDamages(FighterC2.race);
                    System.out.println(FighterC1.name + " Deals " + hit + " points of damage");
                    Thread.sleep(millis);
                    FighterC2.takeDamages(hit);
                    //on affiche les pv restants
                    System.out.println("Remaining Hp of " + FighterC2.name + " = " + FighterC2.HP);
                    Thread.sleep(millis);
                    System.out.println();

                    // Nouvelle Bagarre
                    System.out.println(FighterC2.name + " Attacks ");
                    Thread.sleep(millis);
                    int hit2 = FighterC2.getDamages(FighterC1.race);
                    //attaque du fighter 2
                    System.out.println(FighterC2.name + " Deals " + hit2 + " points of damage");
                    Thread.sleep(millis);
                    FighterC1.takeDamages(hit2);
                    //on affiche les pv restants
                    System.out.println("Remaining Hp of " + FighterC1.name + " = " + FighterC1.HP);
                    Thread.sleep(millis);
                    System.out.println();
                    System.out.println("Press enter to initiate next turn...");
                    sc.nextLine();

                } else if (FighterC1.speed < FighterC2.speed) {
                    System.out.println(" ---------- Turn " + turnCount + " ----------");
                    Thread.sleep(millis);
                    System.out.println(FighterC2.name + " Attacks ");
                    Thread.sleep(millis);
                    //attaque du fighter 1
                    int hit = FighterC2.getDamages(FighterC1.race);
                    System.out.println(FighterC2.name + " Deals " + hit + " points of damage");
                    Thread.sleep(millis);
                    FighterC1.takeDamages(hit);
                    //on affiche les pv restants
                    System.out.println("Remaining Hp of " + FighterC1.name + " = " + FighterC1.HP);
                    Thread.sleep(millis);
                    System.out.println();
                    // Nouvelle Bagarre
                    System.out.println(FighterC1.name + " Attacks ");
                    Thread.sleep(millis);
                    //attaque du fighter 2
                    int hit2 = FighterC1.getDamages(FighterC2.race);
                    System.out.println(FighterC1.name + " Deals " + hit2 + " points of damage");
                    Thread.sleep(millis);
                    FighterC2.takeDamages(hit2);
                    //on affiche les pv restants
                    System.out.println("Remaining Hp of " + FighterC2.name + " = " + FighterC2.HP);
                    Thread.sleep(millis);
                    System.out.println();
                    System.out.println("Press enter to initiate next turn...");
                    sc.nextLine();

                }else{
                    if (coinFlip == 1){

                        System.out.println(" ---------- Turn " + turnCount + " ----------");
                        Thread.sleep(millis);
                        System.out.println(FighterC1.name + " Attacks ");
                        Thread.sleep(millis);
                        //attaque du fighter 1
                        int hit = FighterC1.getDamages(FighterC2.race);
                        System.out.println(FighterC1.name + " Deals " + hit + " points of damage");
                        Thread.sleep(millis);
                        FighterC2.takeDamages(hit);
                        //on affiche les pv restants
                        System.out.println("Remaining Hp of " + FighterC2.name + " = " + FighterC2.HP);
                        Thread.sleep(millis);

                        System.out.println();
                        // Nouvelle Bagarre
                        System.out.println(FighterC2.name + " Attacks ");
                        Thread.sleep(millis);
                        //attaque du fighter 2
                        int hit2 = FighterC2.getDamages(FighterC1.race);
                        System.out.println(FighterC2.name + " Deals " + hit2 + " points of damage");
                        Thread.sleep(millis);
                        FighterC1.takeDamages(hit2);
                        //on affiche les pv restants
                        System.out.println("Remaining Hp of " + FighterC1.name + " = " + FighterC1.HP);
                        Thread.sleep(millis);
                        System.out.println();
                        System.out.println("Press enter to initiate next turn...");
                        sc.nextLine();

                    }
                    else{
                        System.out.println(" ---------- Turn " + turnCount + " ----------");
                        Thread.sleep(millis);
                        System.out.println(FighterC2.name + " Attacks ");
                        Thread.sleep(millis);
                        //attaque du fighter 1
                        int hit = FighterC2.getDamages(FighterC1.race);
                        System.out.println(FighterC2.name + " Deals " + hit + "points of damage");
                        Thread.sleep(millis);
                        FighterC1.takeDamages(hit);
                        //on affiche les pv restants
                        System.out.println("Remaining Hp of " + FighterC1.name + " = " + FighterC1.HP);
                        Thread.sleep(millis);
                        System.out.println();
                        // Nouvelle Bagarre
                        System.out.println(FighterC1.name + " Attacks ");
                        Thread.sleep(millis);
                        //attaque du fighter 2
                        int hit2 = FighterC1.getDamages(FighterC2.race);
                        System.out.println(FighterC1.name + " Deals " + hit2 + "points of damage");
                        Thread.sleep(millis);
                        FighterC2.takeDamages(hit2);
                        //on affiche les pv restants
                        System.out.println("Remaining Hp of " + FighterC2.name + " = " + FighterC2.HP);
                        Thread.sleep(millis);
                        System.out.println();
                        System.out.println("Press enter to initiate next turn...");
                        sc.nextLine();
                    }
                }
            }
            if (turnCount > 20){
                System.out.println("after " + turnCount + " tiring rounds both fighters realised the true victory" +
                        " was the friends they made along the way");
            }else if (FighterC1.HP <= 0 && FighterC2.HP <= 0){
                System.out.println("well it seems like both fighter are dead...\n" +
                        " you didn't make two racists of the same race fight against each other did you ?\n" +
                        "guess we're just returning to menu then.");
                System.out.println("Press enter to return to menu");
                sc.nextLine();
                menu();
            }
            else if (FighterC2.HP <= 0){
                System.out.println(FighterC1.name + " won the hustle, he clapped his opponnent's cheeks");
                Thread.sleep(millis);
                if (issueBet == indexOp1 + 1) {
                    System.out.println("Congrats you won your bet");
                }
                else if(turnBet == turnCount){
                    System.out.println("Congrats you won your bet");
                }else {
                    System.out.println("Sadly you lost your bet please give your money to Luciano :D");
                }
            }
            else {
                System.out.println(FighterC2.name + " won the hustle, he clapped his opponnent's cheeks");
                Thread.sleep(millis);
                if (issueBet == indexOp2 + 1) {
                    System.out.println("Congrats you won your bet");
                }
                else if(turnBet == turnCount){
                        System.out.println("Congrats you won your bet");
                    }else {
                        System.out.println("Sadly you lost your bet please give your money to Luciano :D");
                    }
            }
            System.out.println("Press enter to return to menu");
            sc.nextLine();
            menu();
        }
    }









    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        menu();
    }
}