/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulate;

/**
 *
 * @author therapy
 */
public class TestEnc {

    public static void main(String[] args) {
        TestEnc t = new TestEnc();
        t.printTestEnc();
    }

    public void printTestEnc() {
        Encapsulate c = new Encapsulate();
        c.setGeekName("Emmanuel");
        c.setGeekAge(2);
        System.out.println("Age:" + c.getGeekAge()+"\nName:" + c.getGeekName());

    }

}
