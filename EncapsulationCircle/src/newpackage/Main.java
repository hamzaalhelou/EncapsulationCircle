/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Moatasem
 */
public class Main {
    public static void main(String[] args) {
    
    Circle c1= new Circle();
    Circle c2= new Circle();
    
    c1.setRedius(3.0);
    c1.setColor("Black");
    System.out.println("c1 Area = "+c1.getArea());
    
    c2.setRedius(2.0);
    c2.setColor("Blue");
    System.out.println("c2 Circumference = "+c2.getCircumference());
        
        
    
   }    
}
