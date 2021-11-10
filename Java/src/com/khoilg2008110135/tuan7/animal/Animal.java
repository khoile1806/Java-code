package com.khoilg2008110135.tuan7.animal;

public class Animal {
    private String Name;
    protected void Sound(){
        System.out.println("Animal Sound !!!");
    };
    protected String Food;
    protected void Pictures(){
        System.out.println("Animal Pictures !!!");
    };
    public void makeNoices(){
        System.out.println("Barking !!!");
    }

    protected void eatFood(){
        System.out.println("Eating food !!!");
    }

    protected void Sleep(){
        System.out.println("Sleeping !!!");
    }

    public void Roam(){
        System.out.println("Walking !!!");
    }

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        this.Name = name;
    }
}