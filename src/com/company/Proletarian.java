package com.company;


import java.util.ArrayList;
import java.util.List;

public class Proletarian {

//    public double getRandomDmg(int min, int max) {
//        double mini = Math.ceil(min);
//        double maxi = Math.floor(max);
//        double result = Math.floor(Math.random() * (maxi - mini + 1)) + mini;
//        return result;
//    }
    private String name;
    private int HP;
    //Strength = damage
    private int Strength;
    //Speed = initiative
    private int speed;

    Proletarian(String name, int HP, int Strength, int speed){
        this.name = name;
        this.HP = HP;
        this.Strength = Strength;
        this.speed = speed;

    }

    public void takeDamages(int Dmg){
        this.HP = this.HP - Dmg;
    }
    public int getDamages(){
        return this.Strength;
    }
    public String toString(){
        return this.name+"'s Stats: HP: "+this.HP+" Strength: "+this.Strength+" Speed: "+this.speed;
    }

}
