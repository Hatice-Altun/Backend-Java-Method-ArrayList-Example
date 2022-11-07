package com.altun.Java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// An ArrayList example of my favorite singers

        List<String> singers = new ArrayList<>();
        singers.add("Jennifer Lopez");
        singers.add("Aaliyah");
        singers.add("Adele");
        singers.add("Christina Aguilera");
        singers.add("Sertab Erener");
        singers.add("Selena Gomez");
        singers.add("Lady Gaga");
        singers.add("Ariana Grande");
        singers.add("Madonna");
        singers.add("Whitney Houston");
        singers.add("Alicia Keys");
        singers.add("Beyonce Knowles");
        singers.add("Katy Perry");
        singers.add("Pink");
        singers.add("Rihanna");
        singers.add("Shakira");
        singers.add("Britney Spears");
        singers.add("Tina Turner");

        System.out.println("How many favorite singers do I have: " + singers.size());
        System.out.println("The winner is: " + singers.get(8));
        singers.remove(16);
        singers.set(0,"JLO");
        System.out.println("Name is changed to: " + singers.get(0));
        System.out.println("The last person in the list is: " + singers.get(singers.size()-1));
        System.out.println("The winner of Eurovision Songfestival in 2003 is: " + singers.get(4));
        singers.clear();

    }
}
