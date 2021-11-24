package com.company;


import java.util.ArrayList;
import java.util.List;

public class Proletarian implements Cloneable{

//    public double getRandomDmg(int min, int max) {
//        double mini = Math.ceil(min);
//        double maxi = Math.floor(max);
//        double result = Math.floor(Math.random() * (maxi - mini + 1)) + mini;
//        return result;
//    }
    protected String name;
    protected int HP;
    //Strength = damage
    protected int Strength;
    //Speed = initiative
    protected int speed;

    Proletarian(String name, int HP, int Strength, int speed){
        this.name = name;
        this.HP = HP;
        this.Strength = Strength;
        this.speed = speed;

    }
    public Object clone() throws CloneNotSupportedException
    {
        return (Proletarian)super.clone();
    }
    public void takeDamages(int Dmg){
        this.HP = this.HP - Dmg;
    }
    public int getDamages(){
        return this.Strength;
    }
    public String toString(){
        String chara = this.name+"'s Stats: HP: "+this.HP+" Strength: "+this.Strength+" Speed: "+this.speed;
        return chara;
    }

}
