package com.khoilg2008110135.tuan9;
import java.util.ArrayList;
import java.util.Scanner;

public class listAnimal {
    ArrayList<animal> listAnimal = new ArrayList<animal>();

    public void addList(animal Animal) {
        listAnimal.add(Animal);
    }

    public void showList() {
        for (animal Animal : listAnimal) {
            System.out.println(Animal.toString());
        }
    }

    public void findName(){
        System.out.println("Nhap ten can tim: ");
        String name = new java.util.Scanner(System.in).nextLine();
        for (animal Animal : listAnimal) {
            if (Animal.getName().equals(name)) {
                System.out.println(Animal.toString());
                break;
            }
            else {
                System.out.println("Khong tim thay");
                break;
            }
        }
    }

    public animal searchNameDog(String name){
        Dog d = null;
        for (animal animal : listAnimal) {
            if(animal instanceof Dog){
                Dog dog =(Dog)animal;
                if(dog.getName().equalsIgnoreCase(name)){
                    d = dog;
                }
            }
        }
        return d;
    }
}
