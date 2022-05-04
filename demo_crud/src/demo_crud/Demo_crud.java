
package demo_crud;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo_crud {
    public static void main(String[] args) {
        //Operaciones basicas con dos variables
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese el primer valor entero: ");
            int n1 = Integer.parseInt(leer.readLine());
            System.out.println("Ingrese el segundo valor entero:");
            int n2 = Integer.parseInt(leer.readLine());
            
            Multiplicacion(n1, n2);
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
    }
    //metodo para la multiplicacion
    public static void Multiplicacion(int n1, int n2){
        int multi=n1*n2;
        System.out.println("La multiplicacion es: "+multi);
        }
}
