package com.company;

public class Soldier extends Human implements CombatCapable{
    private float experience;
    private String name_of_soldier_regiment; //название солдатского полка
    private Commander commander;

    public float serviceTerm(){
        float result;
        result = 3 - experience;
        return result;
    }

    @Override
    public void fight(boolean capable) throws MtException {
        if(!capable)
            throw new MtException("sth has gone wrong! I CAN fight!");
    }

    @Override
    public void report() {
        System.out.println("I'm from " + name_of_soldier_regiment + "regiment");
    }

    public Soldier(String name, int age, float experience, String name_of_soldier_regiment, Commander commander) {
        super(name, age);
        this.experience = experience;
        this.name_of_soldier_regiment = name_of_soldier_regiment;
        this.commander = commander;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }

    public String getName_of_soldier_regiment() {
        return name_of_soldier_regiment;
    }

    public void setName_of_soldier_regiment(String name_of_soldier_regiment) {
        this.name_of_soldier_regiment = name_of_soldier_regiment;
    }

    public Commander getCommander() {
        return commander;
    }

    public void setCommander(Commander commander) {
        this.commander = commander;
    }
}
