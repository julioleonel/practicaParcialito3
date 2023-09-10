# practicaParcialito3
    ejercicios de practica para el parcialito

# enunciado

    Desarrolla un programa que convierta una cantidad de grados Celsius en grados Fahrenheit.
    El programa debe tomar la temperatura en grados Celsius como argumento de línea de comandos y mostrar
    la temperatura equivalente en grados Fahrenheit. La fórmula de conversión es: Fahrenheit = (Celsius * 9/5) + 32.

# codigo

    for (String argumento : args){
    
                float numero = Float.parseFloat(argumento);
    
                float conversion = (float) (numero * 9/5) +32;
                System.out.println("grados Fahrenheit: " + conversion);
            }

# consola

    Ingreso los siguientes argumentos: 100 0 10 74 5.8  
    grados Fahrenheit: 212.0
    grados Fahrenheit: 32.0
    grados Fahrenheit: 50.0
    grados Fahrenheit: 165.2
    grados Fahrenheit: 42.440002
