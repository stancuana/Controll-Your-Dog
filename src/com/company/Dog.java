package com.company;

public class Dog {

    String name;

    public static void main(String[] args) {

        Dog dog1=new Dog();

        dog1.bark();
        dog1.eat();
        dog1.name="Bart";

        Dog[] myDog=new Dog[3];

        myDog[0]=new Dog();
        myDog[1]=new Dog();
        myDog[2]=dog1;

        myDog[0].name="Fred";
        myDog[1].name="Marge";

        System.out.print("last dog's name is ");
        System.out.println(myDog[2].name+"\n");

        int x=0;
        while (x<myDog.length){

            myDog[x].bark();
            x+=1;
        }
        System.out.println("\n");

        int y=0;
        while(y<myDog.length){
            myDog[y].eat();
            y+=1;
        }
    }
    public void bark(){
        System.out.println(name+" says Ruff!");
    }
    public void eat(){
        System.out.println(name+" eat all the food!");
    }
}
