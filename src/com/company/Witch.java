package com.company;

public class Witch extends Proletarian{

    private int potionsQuantity;

    Witch(String name, int HP, int Strength, int speed, int potionsQuantity, String race) throws InterruptedException, CloneNotSupportedException {
        super(name, HP, Strength, speed, race);
        this.potionsQuantity = potionsQuantity;
    }

    public void takeDamages(int Dmg){
        this.HP = this.HP - Dmg;
    }

    public int getDamages(String opponentRace) {
        String nothing = opponentRace;
        float randomFloat = (float) Math.random();
        if(potionsQuantity>0 && randomFloat>0.6){
            potionsQuantity = potionsQuantity - 1;
            float randomFloat2 = (float) Math.random();
            if(randomFloat2 > 0.5){
                this.HP = this.HP + 20;
                System.out.println(this.name+" the witch uses a healing potion! +20 HP.");
                return (this.Strength - this.Strength);
            }
            else{System.out.println(this.name+ " the witch uses a damage boost potion! She deals double damage for this turn .");
                return this.Strength*2;}
        }else{
            return this.Strength;
        }
    }

    public String toString(){
        String chara = " Witch " + this.name+
                "'s Stats: HP: "+this.HP+
                " Strength: "+this.Strength+
                " Speed: "+this.speed+
                " Potions: "+this.potionsQuantity+
                " Race: "+ this.race;
        return chara;
    }

}