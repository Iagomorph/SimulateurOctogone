package com.company;

public class MageWarrior extends Proletarian{

    private int magicDmg;
    private int shieldStrength;

    MageWarrior(String name, int HP, int Strength, int speed, int magicDmg, int shieldStrength){
        super(name, HP, Strength, speed);
        this.magicDmg = magicDmg*2;
        this.shieldStrength = shieldStrength;
    }

    public void takeDamages(int Dmg){
        if(shieldStrength<Dmg) {
            this.HP = this.HP - Dmg + shieldStrength;
            System.out.println();
        }
    }
    public int getDamages(){
        this.magicDmg = this.magicDmg/2;
        return this.Strength + this.magicDmg;
    }

    public String toString(){
        String chara = " MageWarrior " + this.name+"'s Stats: HP: "+this.HP+" Strength: "+this.Strength+" Speed: "+this.speed+" Magic Power : "+this.magicDmg/2 +" Shield Strength: "+this.shieldStrength;
        return chara;
    }
//    public void recalculateMagicDmg(){
//        this.magicDmg = this.magicDmg/2;
//
//    }
}


