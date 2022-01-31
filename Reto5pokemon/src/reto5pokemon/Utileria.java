
package reto5pokemon;

import java.util.Scanner;

public class Utileria {
            Scanner lector  = new Scanner(System.in); 
            public int ingresoInt(String text){
                System.out.println(text);
                return (lector.nextInt());
            }


}
