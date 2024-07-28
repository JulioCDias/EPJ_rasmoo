package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio01 {
    /*
        Faça um Programa que receba como entrada um valor que represente uma
        temperatura em graus Celcius e imprima esse valro convertido em Kelvin e Fahrenheit
        CALCULOS:
        Kelvin = Celcius + 273.15
        Fahrenheit = Celcius * 1.8 + 32
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor da temperatura em celcius: ");
        double valorTemperatura = teclado.nextDouble();
        double kelvin = valorTemperatura + 273.15;
        double fahrenheit = valorTemperatura * 1.8 + 32;
        System.out.println("O valor da temperatura: "+valorTemperatura+" em Kelvin é: "+kelvin+
                "\n e em Fahrenheit é: "+fahrenheit);
    }
}
