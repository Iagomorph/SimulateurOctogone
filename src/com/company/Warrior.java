package com.company;

public class Warrior extends Proletarian{

    private int shieldStrength;

    Warrior(String name, int HP, int Strength, int speed, int shieldStrength, String race) throws InterruptedException, CloneNotSupportedException {
        super(name, HP, Strength, speed, race);
        this.shieldStrength = shieldStrength;
    }

    public void takeDamages(int Dmg){
        if(shieldStrength<Dmg) {
            this.HP = this.HP - Dmg + shieldStrength;
            System.out.println();
        }
    }
    public int getDamages(String opponentRace){
        String nothing = opponentRace;
        return this.Strength;
    }

    public String toString(){
        String chara = " Warrior " + this.name+
                "'s Stats: HP: "+this.HP+
                " Strength: "+this.Strength+
                " Speed: "+this.speed+
                " Shield Strength: "+this.shieldStrength+
                " Race: "+ this.race;
        return chara;
    }
}