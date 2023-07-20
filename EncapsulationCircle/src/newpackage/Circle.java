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

//  مشروع حساب مساحة ومحيط دائرة
public class Circle {
    
    private double redius;    // نصف القطر
    private String color;
    
    public Circle(){}

    public double getRedius() {
        return redius;
    }

    public void setRedius(double redius) {
        this.redius = redius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    // قانون مساحة الدائرة هو باي ضرب نصف القطر تربيع
    // 3.14 باي تساوي
    
    public double getArea(){  // معادلة حساب مساحة الدائرة
        return Math.PI * redius * redius ;
    }
    // قانون محيط الدائرة هو باي ضرب اتنين ضرب نصف القطر
     public double getCircumference(){  // معادلة حساب محيط الدائرة
        return Math.PI * 2 * redius ;
    }
    
    
    
    
}
