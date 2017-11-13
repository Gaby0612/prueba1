/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exceociones;

import java.util.Scanner;

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
     

        int hora;
        String dia="";
        System.out.println("Ingrese un hora: ");
        hora = scanner.nextInt();
        String resultado = "";
        
        try {
         Excepcion.rangohora(dia,hora);
            resultado = String.valueOf(hora+""+dia); 
        } catch (Excepcion me) {
            resultado = me.getMessage();
        } catch (Exception e) {
            resultado = e.getMessage();
        } finally {
            System.out.println("hora: " + resultado);
        }
    }
}
