package com.company;

public class Rogue extends Proletarian{
    int dodgeChance;
    int critChance;
    int critCount = 0;


    Rogue(String name, int HP, int Strength, int speed, int dodgeChance, int critChance) {
        super(name, HP, Strength, speed);
        this.dodgeChance = dodgeChance;
        this.critChance = critChance;
    }
    public void takeDamages(int dmg){
        int randomNbr = (int) Math.floor(Math.random() * (100 - 0 + 1)) + 0;
        if (randomNbr >= dodgeChance){
            this.HP = this.HP - dmg;
        }
        else {
            System.out.println( this.name + " dodged the hit!");
        }
    }
    public int getDamages(){
        int randomNbr = (int) Math.floor(Math.random() * (100 - 0 + 1)) + 0;
        if (randomNbr <= critChance && critCount == 0){
            int damages = this.Strength * 2;
            critCount++;
            System.out.println(this.name + " dealt a critical strike");
            return damages;
        }
        else {
            int damages = this.Strength;
            critCount = 0;
            return damages;
        }
    }
    public String toString() {
        String chara = " Rogue " + this.name
                + "'s Stats: HP: " + this.HP
                + " Strength: " + this.Strength
                + " Speed: " + this.speed
                + " Dodge Chances: " + this.dodgeChance
                + " Crit Chance: " + this.critChance;
        return chara;
    }
}
