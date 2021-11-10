package com.khoilg2008110135.tuan9;

public class animal {
    private String name;
    private double weight;
    private int age;
    
    animal (String name, double weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    protected void eat(){
        System.out.println("Animal is eating");
    }

    protected void sleep(){
        System.out.println("Animal is sleeping");
    }

    protected void roam() {
        System.out.println("Animal is relax");
    }

    protected void chase(){
        System.out.println("Animal is chasing");
    }

    protected void makeNoise(){
        System.out.println("Animal barking !!!");
    }

    public String toString() {
        return "animal {" + "name=" + name + ", weight=" + weight + ", age=" + age + '}';
    }
}
