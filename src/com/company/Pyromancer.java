package com.company;

public class Pyromancer extends Proletarian{

    private int bombsQuantity;
    private int pyroDmg;

    Pyromancer(String name, int HP, int Strength, int speed, int bombsQuantity, String race){
        super(name, HP, Strength, speed, race);
        this.bombsQuantity = bombsQuantity;
    }

    public void takeDamages(int Dmg){
        this.HP = this.HP - Dmg;
    }

    public int getDamages(String opponentRace) {
        String nothing = opponentRace;
        int randomInt = (int) Math.random();
        if(bombsQuantity>0 && randomInt>0.9){
            bombsQuantity = bombsQuantity - 1;
            this.HP = this.HP - this.Strength;
            System.out.println(this.name+" the Pyromancer blows up the battlefield! They deal "+this.Strength*2+" damage, but loose"+this.Strength+" HP.");
            pyroDmg = this.Strength-1;
            return this.Strength*2;
        }else{
            pyroDmg = pyroDmg - 1;
            if(pyroDmg>0){
                return this.Strength+pyroDmg;
            }else{
                return this.Strength;
            }
        }
    }

    public String toString(){
        String chara = " Mage " + this.name+"'s Stats: HP: "+this.HP+" Strength: "+this.Strength+" Speed: "+this.speed+" Bombs: "+this.bombsQuantity;
        return chara;
    }

}
