package com.khoilg2008110135.tuan9;

public class testdrive {
    public static void main(String[] args) {
        listAnimal list = new listAnimal();
        Dog d = new Dog("dog", 2.5, 5);
        Cat c = new Cat("cat", 10, 2);
        Tiger t = new Tiger("cop", 200, 10);
        list.addList(c);
        list.addList(t);
        list.addList(d);
        list.showList();
        list.findName();
    }
}
