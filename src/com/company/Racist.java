package com.company;

public class Racist extends Proletarian{

    Racist(String name, int HP, int Strength, int speed, String race){
        super(name, HP, Strength, speed, race);

    }


    public int getDamages(String opponentsRace) {
        String sameRace = opponentsRace;
        if (this.race.equals(sameRace)){
            System.out.println(this.name + ": 'Oh I see you're an " + this.race + " aswell...'");
            System.out.println(this.name  + " The Racist has lost the will to fight");
            System.out.println("facing the inevitable fight ahead " + this.name + " commit toaster bath to avoid hurting his compatriots");
            this. HP = this.HP - this.HP;
            return (this.Strength - this.Strength);
        }
        else {
            System.out.println("die you filthy " + opponentsRace + " !");
            return this.Strength*3;
        }
    }

    public void takeDamages(int Dmg){
        this.HP = this.HP - Dmg;
    }

    public String toString(){
        String chara =" Racist " + this.name+
                "'s Stats: HP: "+this.HP+
                " Strength: "+this.Strength+
                " Speed: "+this.speed+
                " Race: " + this.race;
        return chara;
    }


}
