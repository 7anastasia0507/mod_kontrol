package com.company;

public class Commander extends Human implements CombatCapable{
    private int salary;
    private int count_of_subordinates; //кол-во людей в подчинении
    private General general;

    public int annualSalary(){
        int result;
        result = salary * 12;
        return result;
    }
    @Override
    public void fight(boolean capable) throws MtException {
        if(capable)
            throw new MtException("sth has gone wrong! I CAN NOT fight!");
    }

    @Override
    public void report() {
        System.out.println("I have got " + count_of_subordinates + " people im my regiment");
    }

    public Commander(String name, int age, int salary, int count_of_subordinates, General general) {
        super(name, age);
        this.salary = salary;
        this.count_of_subordinates = count_of_subordinates;
        this.general = general;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getCount_of_subordinates() {
        return count_of_subordinates;
    }

    public void setCount_of_subordinates(int count_of_subordinates) {
        this.count_of_subordinates = count_of_subordinates;
    }

    public General getGeneral() {
        return general;
    }

    public void setGeneral(General general) {
        this.general = general;
    }
}
