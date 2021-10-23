package com.khoilg2008110135.tuan7;

public class TestDriver {
    public static void main(String[] args){
        Lion L = new Lion();
        System.out.println("Lion Attributes");
        System.out.println("==>");
        L.Roam();
        L.eatFood();
        L.Claws();
        L.Chase();
        L.Work();
        L.Sound();
        L.Sleep();
        L.Pictures();

        System.out.println("-----------");

        Dog D = new Dog();
        System.out.println("Dog Attributes");
        System.out.println("==>");        
        D.Roam();
        D.eatFood();
        D.Claws();
        D.Chase();
        D.Work();
        D.Sound();
        D.Sleep();
        D.Pictures();

        System.out.println("-----------");

        Wolf W = new Wolf();
        System.out.println("Wolf Attributes");
        System.out.println("==>");
        W.Roam();
        W.eatFood();
        W.Claws();
        W.Chase();
        W.Work();
        W.Sound();
        W.Sleep();
        W.Pictures();

        System.out.println("-----------");

        Tiger T = new Tiger();
        System.out.println("Tiger Attributes");
        System.out.println("==>");
        T.Roam();
        T.eatFood();
        T.Claws();
        T.Chase();
        T.Work();
        T.Sound();
        T.Sleep();
        T.Pictures();

        System.out.println("-----------");

        Cat C = new Cat();
        System.out.println("cat Attributes");
        System.out.println("==>");
        C.Roam();
        C.eatFood();
        C.Claws();
        C.Chase();
        C.Work();
        C.Sound();
        C.Sleep();
        C.Pictures();

        System.out.println("-----------");

        Hippo H = new Hippo();
        System.out.println("cat Attributes");
        System.out.println("==>");
        H.Roam();
        H.eatFood();
        H.Chase();
        H.Work();
        H.Sound();
        H.Sleep();
        H.Pictures();
    }
}