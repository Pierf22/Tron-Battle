package org.application.IA._4F;


import java.util.Random;

public class MainClass_4F {
    //Attributi

    //Costruttore

    //Metodi
    public int getDirection() {
        // Questo metodo ritorna la direzione in cui il personaggio deve muoversi
        return new Random().nextInt(4);
    }
}
