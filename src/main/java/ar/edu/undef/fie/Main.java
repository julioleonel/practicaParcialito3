package ar.edu.undef.fie;

public class Main {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.print("No se proporcionaron argumentos");
            return;
        }

        System.out.print("Ingreso los siguientes argumentos: ");
        for (String argumento : args){
            System.out.print(argumento + " ");

        }
        System.out.println(" ");
        for (String argumento : args){

            float numero = Float.parseFloat(argumento);

            float conversion = (float) (numero * 9/5) +32;
            System.out.println("grados Fahrenheit: " + conversion);
        }
    }
}






/*
. Conversión de Unidades:
Desarrolla un programa que convierta una cantidad de grados Celsius en grados Fahrenheit.
El programa debe tomar la temperatura en grados Celsius como argumento de línea de comandos y mostrar
la temperatura equivalente en grados Fahrenheit. La fórmula de conversión es: Fahrenheit = (Celsius * 9/5) + 32.
 */