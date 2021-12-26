
package lec3;

import java.util.Scanner;


public class Lec3 {


    public static void main(String[] args) {
       
        StringBuilder a1 = new  StringBuilder("amir swailem");
        a1.setLength(4);
        a1.ensureCapacity(58);
        a1.append(" swailem");
        a1.delete(4,a1.length());
        System.out.println(a1); 
        System.out.println(a1.capacity()); 
        
     
     // By amir
        
     }    
    }
    

