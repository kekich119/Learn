package application;


import java.util.ArrayList;

interface Runnable{
    void run();

}


class Car implements Runnable {
    @Override
    public void run(){
        System.out.println("Car is running");
    }

}


class Plane implements Runnable {
    @Override
    public void run(){
        System.out.println("Plane is flying");
    }

}



 class Solution {

    public static ArrayList <Runnable> list = new ArrayList<>();

    public static void addToList(Runnable r){
        list.add(r);
    }
    public static void runAll(){
        for(Runnable runnable : list){
            runnable.run();
        }

    }



    public static void main(String[] args) {
        Solution.addToList(new Car());
        Solution.addToList(new Plane());
        Solution.runAll();


    }
}





