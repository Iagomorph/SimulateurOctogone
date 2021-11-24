package com.company;
import java.util.List;
import java.util.ArrayList;

public class GestionCHR {
    final static List<Proletarian> characters = new ArrayList<>();
    final static List<String> charNames = new ArrayList<>();

    public void addCharacters(Proletarian perso){
        characters.add(perso);
    }

    public Proletarian GetCharacter(int index){
        return characters.get(index);
    }


}
