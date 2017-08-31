/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swornim;
/**IMportant topics=OOP 
 *                  Encaptulation
 *                  Polymorphism
 *                  Abstraction    
 *
 * @author Guest
 */
public class Swornim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//         TODO code application logic here
//        System.out.println("Anmol");
//        System.out.println("Shrestha");
//        System.out.println("Bhkatapur");
//        System.out.println("aluu");
//        System.out.println("64235");
//        String name="Anmol Shrestha";
//        String address="Bhaktapur,Bholachhen-5";
//        int age=0xaf1000;
//        char gender='M';
//        String mobile="+9779810102264";
//        String destinationCountry="Australia";
//        double plusTwoPercentage=768768;
//        System.out.println(name);
//        System.out.println("I am"+" "+name+" "+"from"+" "+address+" "+age+" "+"years old."+"\t\t"+"I am"+" "+gender);
//        System.out.println(age);
//       int x=12,y=18,z=24;
//       int a=2*x+7*y-5*z;
//        System.out.println(a);
//        if (a%2==0) {
//            System.out.println("Even");            
//        } else {
//            System.out.println("odd");
//        }
//     
//            int a=12;
//                    int b=11;
//                    System.out.println(a<=b);
//            int age =12;
//        
//        } else { System.out.println("adolscence");
         int age=2;
           if (age<=5) { 
               System.out.println("infant");
            
        } else if(age>5&&age<=15 ) {
            System.out.println("child");
        }else if(age>15&&age<=20){
               System.out.println("teen");
            
        }
        else{
        System.out.println("adult");
    }
           int salary=10000000;
           double tax=0;
           if (salary<=300_000) {
               tax=salary*0.01;
               
            
        } else if (salary>300000 && salary<=500000) {
             tax= 300000*0.01+(50000-salary)*0.10;
        
        } else if (salary >500000 && salary<= 1000000){
           tax= 300000*0.01 + 200000 *0.1+(1000000-salary)*0.15;               
        }
               else {
            tax = 300000*0.01+200000*0.1+500000*0.15+(salary-1000000)*0.25;
                       
                       }
           System.out.println("A person having salary of Rs."+ salary +" has to pay " +tax+ " as tax");
           int[] ages = {1,2,3,4,};
//        System.out.println(ages[2]);
        String[] names= {"anmol","om","yunisha=gadhaini,"};
//        System.out.println(names[1]+" "+ ages[ 2]);
        double marks[]= {0.4,0.5,0.6,};
        char gender[]={'M','M','F','h',};
//        for (int i = 0; i < names.length; 
for (String  n :names){
    System.out.println(n);
}


        
//        {System.out.println((gender[i]=='M'?"His":"Her")+" name is "+ names[i]+". \t"+ "Phone number :  " + marks[i]);
//        }
        //              for (int i = 0; i < 10; i++) {
        //            car c=new car();
        //            c.drive();
        //            c.turnLeft();
        //            c.turnRight();
        //            c.stop();
        //
        //        }

                car c=new car();
                c.model="hyundai";
                c.color="red";
                c.noOfWheel=5;
                c.manufacturer="hugdjaid";
                System.out.println();
c.getFullInfo(); 
                

    }
        
        
       
//          int age=12;
    
}

    
            

