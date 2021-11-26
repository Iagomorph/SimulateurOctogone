package com.company;

public class Pyromancer extends Proletarian{

    private int bombsQuantity;

    Pyromancer(String name, int HP, int Strength, int speed, int bombsQuantity, String race) throws InterruptedException, CloneNotSupportedException {
        super(name, HP, Strength, speed, race);
        this.bombsQuantity = bombsQuantity;
    }

    public void takeDamages(int Dmg){
        this.HP = this.HP - Dmg;
    }

    public int getDamages(String opponentRace) {
        String nothing = opponentRace;
        float randomFloat = (float) Math.random();
        if(bombsQuantity>0 && randomFloat>0.8){
            bombsQuantity = bombsQuantity - 1;
            this.HP = this.HP - this.Strength;
            System.out.println(this.name+" the Pyromancer blows up the battlefield! They deal triple damage, but loose "+ this.Strength +" HP.");
            return this.Strength*3;
            }else{
                return this.Strength;
        }
    }

    public String toString(){
        String chara = " Pyromancer " + this.name+"'s Stats: HP: "+this.HP+" Strength: "+this.Strength+" Speed: "+this.speed+ " Race: "+ this.race + " Bombs: " + this.bombsQuantity;
        return chara;
    }

}
