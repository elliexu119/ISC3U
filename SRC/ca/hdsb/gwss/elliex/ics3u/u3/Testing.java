/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.elliex.ics3u.u3;

import java.text.NumberFormat;

/**
 *
 * @author elli
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    NumberFormat number = NumberFormat.getIntegerInstance();
int num = 1234;
System.out.println( number.format( num ) );
    }
    
}
