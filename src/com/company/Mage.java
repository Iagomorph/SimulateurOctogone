package com.company;

public class Mage extends Proletarian{

    private int magicDmg;

    Mage(String name, int HP, int Strength, int speed, int magicDmg){
        super(name, HP, Strength, speed);
        this.magicDmg = magicDmg*2;
    }

    public void takeDamages(int Dmg){
        this.HP = this.HP - Dmg;
    }
    public int getDamages(){
        this.magicDmg = this.magicDmg/2;
        return this.Strength + this.magicDmg;
    }

    public String toString(){
        String chara = " Mage " + this.name+"'s Stats: HP: "+this.HP+" Strength: "+this.Strength+" Speed: "+this.speed+" Magic Power: "+this.magicDmg/2;
        return chara;
    }
//    public void recalculateMagicDmg(){
//        this.magicDmg = this.magicDmg/2;
//
//    }
}