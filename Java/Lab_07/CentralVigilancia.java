package Lab_07;

import java.util.ArrayList;

public class CentralVigilancia {
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private Casa c;

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public CentralVigilancia(Casa c) {
        this.c = c;
    }

    public boolean vigiar() {
        boolean algoSuspeito = false;
        for (int i = 0; i < 10; i++) {
            if (c.movimentacao()) {
                algoSuspeito = true;
                System.out.println("Tem gente em casa.");
            } else
                System.out.println("Ninguem em casa.");

        }
        return algoSuspeito;

    }
}