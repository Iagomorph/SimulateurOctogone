package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Proletarian implements Cloneable{

//    public double getRandomDmg(int min, int max) {
//        double mini = Math.ceil(min);
//        double maxi = Math.floor(max);
//        double result = Math.floor(Math.random() * (maxi - mini + 1)) + mini;
//        return result;
//    }
    protected String race;
    protected String name;
    protected int HP;
    //Strength = damage
    protected int Strength;
    //Speed = initiative
    protected int speed;

    Proletarian(String name, int HP, int Strength, int speed, String race){
        this.race = race;
        this.name = name;
        this.HP = HP;
        this.Strength = Strength;
        this.speed = speed;
        if (this.race.equals("Elve")){
            this.speed = this.speed +3;
        }else if (this.race.equals("Orc")){
            this.Strength = this.Strength + 3;
        }else if (this.race.equals("Human")){
            this.HP = this.HP + 1;
            this.Strength = this.Strength +1;
            this.speed = this.speed + 1;
        }else if (this.race.equals("Dwarf")){
            this.HP = this.HP + 3;
        }else{
            System.out.println("invalid race ");
        }

    }
    public Object clone() throws CloneNotSupportedException
    {
        return (Proletarian)super.clone();
    }
    public void takeDamages(int Dmg){
        this.HP = this.HP - Dmg;
    }
    public int getDamages(String opponentRace){
        String nothing = opponentRace;
        return this.Strength;
    }
    public String toString(){
        String chara = this.name+"'s Stats: HP: "+this.HP+" Strength: "+this.Strength+" Speed: "+this.speed+ " Race: " + this.race;
        return chara;
    }


}
