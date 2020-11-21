package com.company;

public class General extends Human implements CombatCapable{
    private String general_rank; //генеральские чины
    private int bonus;

    public void sayRank(){
        System.out.println("I have got " + general_rank + "rank!");
    }
    @Override
    public void fight(boolean capable) throws MtException {
        if(capable)
            throw new MtException("sth has gone wrong! I CAN NOT fight!");
    }

    @Override
    public void report() {
        System.out.println("I have got bonus = " + bonus);
    }

    public General(String name, int age, String general_rank, int bonus) {
        super(name, age);
        this.general_rank = general_rank;
        this.bonus = bonus;
    }

    public String getGeneral_rank() {
        return general_rank;
    }

    public void setGeneral_rank(String general_rank) {
        this.general_rank = general_rank;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
