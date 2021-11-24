package com.company;

public class Rogue extends Proletarian{
    int dodgeChance;
    int critChance;
    int critCount = 0;

    public int getRandomNbr() {
        int mini = 0;
        int maxi = 100;
        return (int) Math.floor(Math.random() * (maxi - mini + 1)) + mini;
    }

    Rogue(String name, int HP, int Strength, int speed, int dodgeChance, int critChance) {
        super(name, HP, Strength, speed);
        this.dodgeChance = dodgeChance;
        this.critChance = critChance;
    }
    void takeDamage(){
        if (getRandomNbr() >= dodgeChance){
            this.HP = this.HP - getDamage();
        }
        else {
            System.out.println("The Rogue dodged the hit!");
        }
    }
    public int getDamage(){
        if (getRandomNbr() <= critChance && critCount == 0){
            int damages = getDamages() * 2;
            critCount++;
            return damages;
        }
        else {
            critCount = 0;
            return getDamages();
        }
    }
}
