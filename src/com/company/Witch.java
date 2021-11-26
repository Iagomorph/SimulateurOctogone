package com.company;

public class Witch extends Proletarian{

    private int potionsQuantity;

    Witch(String name, int HP, int Strength, int speed, int potionsQuantity, String race){
        super(name, HP, Strength, speed, race);
        this.potionsQuantity = potionsQuantity;
    }

    public void takeDamages(int Dmg){
        this.HP = this.HP - Dmg;
    }

    public int getDamages(String opponentRace) {
        String nothing = opponentRace;
        int randomInt = (int) Math.random();
        if(potionsQuantity>0 && randomInt>0.7){
            potionsQuantity = potionsQuantity - 1;
            int coinFlip = (int) Math.random() <= 0.5 ? 1 : 2;
            if(coinFlip == 1){this.HP = this.HP + 20; System.out.println(this.name+" the witch uses a healing potion! +20 HP."); return 0;}
            else{System.out.println(this.name+" the witch uses a damage boost potion! She deals "+this.Strength*2+" damage for this turn."); return this.Strength*2;}
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