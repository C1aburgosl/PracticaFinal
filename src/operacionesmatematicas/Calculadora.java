package operacionesmatematicas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author angelica
 * @version 2017
 */
public class Calculadora {
     private static int primerNum;
     private static int segundoNum;
     
     
     //Constructor

    /**
     *
     */
    public Calculadora() {
            primerNum=0;
            segundoNum=0;
    }

    //Setters y Getters

    /**
     *
     * @param primerNum
     */
    public static void setPrimerNum(int primerNum) {
        Calculadora.primerNum = primerNum;
    }

    /**
     *
     * @param segundoNum
     */
    public static void setSegundoNum(int segundoNum) {
        Calculadora.segundoNum = segundoNum;
    }

    /**
     *
     * @return
     */
    public static int getPrimerNum() {
        return primerNum;
    }

    /**
     *
     * @return
     */
    public static int getSegundoNum() {
        return segundoNum;
    }

    /**
     *
     * @throws IOException
     */
    public void funcion () throws IOException {
     String c; 
     
     BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

     System.out.println("Introducir primer operando");
     primerNum = Integer.parseInt(lector.readLine()); 
     System.out.println("Introducir segundo operando");
     segundoNum = Integer.parseInt(lector.readLine());
     int s=0;
     do{
      System.out.println("¿QUé operacion desea realizar?");
      System.out.println("S -Suma");
      System.out.println("R -Resta");
      System.out.println("P -Producto");
      System.out.println("D -División");
      c=lector.readLine();
    switch (c) {
       case "S": 
       case "s": System.out.println("Resultado de la suma: " + (primerNum+segundoNum)); break;
       case "R": 
       case "r": System.out.println("Resultado de la resta: " + (primerNum-segundoNum)); break;
       case "M": 
       case "m":  
       case "P": 
       case "p": System.out.println("Resultado del producto: " +  primerNum*segundoNum); break;
       case "D": 
       case "d": System.out.println("Resultado de la division: " + primerNum/segundoNum); break; 
       default: System.out.println("Por favor, indica la operacion correcta"); break; 
        }
    System.out.println("Deseas realizar otra operación con los mismos operandos(s/n)");
     c=lector.readLine();
     if((c.compareTo("n")==0)|| c.compareTo("N")==0)
             s=1;
     }while(s==0);
}

}
