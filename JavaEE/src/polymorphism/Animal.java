/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author therapy
 */
public class Animal {
    private String name;
    private int age;
    
    
    public void AnimalData(String name) {
        this.name = name;
    }
    public void AnimalData(String name,int age) {
        this.name = name;
        this.age = age;
    }
    
}
