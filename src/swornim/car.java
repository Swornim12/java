/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swornim;

/**
 *
 * @author Guest
 */
public class car {
    String model;
    String manufacturer;
    int noOfWheel;
    String color;
    
    public void drive(){
        System.out.println("I am driving.");
    }
    public void turnRight (){
        System.out.println("Turning Right");
    }
    
    public void stop(){
        System.out.println("Stopping car");   
}
    public void turnLeft(){
        System.out.println("Turning left");
    }
    public void getFullInfo(){
        System.out.println("-------------------");
        System.out.println("model\t "+model);
        System.out.println("manufacture\t"+ manufacturer);
        System.out.println("color\t"+color);
        System.out.println("noOfWheel\t"+noOfWheel);
                System.out.println("-------------------------------");
                
    }
}