package com.company;

public class Mage extends Proletarian{

    private int magicDmg;

    Mage(String name, int HP, int Strength, int speed, int magicDmg){
        super(name, HP, Strength, speed);
        this.magicDmg = magicDmg;
    }

    public void takeDamages(int Dmg){
        this.HP = this.HP - Dmg;
    }
    public int getDamages(){
        return this.Strength + this.magicDmg;
    }

    public String toString(){
        String chara = this.name+"'s Stats: HP: "+this.HP+" Strength: "+this.Strength+" Speed: "+this.speed+" Magic: "+this.magicDmg;
        return chara;
    }
    public void recalculateMagicDmg(){
        this.magicDmg = this.magicDmg/2;

    }
}