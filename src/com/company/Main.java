package com.company;

public class Main {

    public static void main(String[] args) throws MtException {

        General general = new General("Ivan", 45, "the highest", 1000);
        Commander[] commanders = new Commander[2];
        Soldier[] soldiers = new Soldier[6];

        commanders[0] = new Commander("Maxim", 32, 5000, 6, general);
        commanders[1] = new Commander("John", 34, 7500, 6, general);

        soldiers[0] = new Soldier("Mike", 22,1, "first regiment", commanders[0]);
        soldiers[1] = new Soldier("Alan", 23, 2, "second regiment", commanders[1]);
        soldiers[2] = new Soldier("Jeniffer", 24, 1, "third regiment", commanders[1]);
        soldiers[3] = new Soldier("King", 21, 1, "second regiment", commanders[0]);
        soldiers[4] = new Soldier("Leon", 27, 2, "first regiment", commanders[0]);
        soldiers[5] = new Soldier("Lian", 20, 1, "third regiment", commanders[1]);

        for(int i = 0; i < soldiers.length; i++){
            soldiers[i].fight(true);
        }
        for(int i = 0; i < commanders.length; i++){
            commanders[i].fight(false);
        }
        //soldiers
        for(int i = 0; i < soldiers.length; i++){
            System.out.println("I'm " + soldiers[i].getName() +" and my manager is commander " + soldiers[i].getCommander().getName());
        }
        //commanders
        for(int i = 0; i < commanders.length; i++){
            System.out.println("I'm " + commanders[i].getName() +" and my manager is general " + commanders[i].getGeneral().getName());
        }
        //general
        System.out.println("I'm " + general.getName() +" and i haven't got any manager");
    }
}
