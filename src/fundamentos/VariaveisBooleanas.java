package fundamentos;

public class VariaveisBooleanas {
    public static void main(String[] args) {
        boolean focado = true;
        int idade = 28;
        //Operadores de Igualdade
        // == Igual
        // != Diferente

        //Operadores relacionais
        // > Maior
        // < menor
        // <= Maior Igual
        // >= Menor Igual

        //Operadores Logicos
        // && E
        // || OU
        if (focado || idade == 28){
            System.out.println("Estou Cada Dia Mais Focado!!");
        }
        System.out.println(idade > 20);
        System.out.println(idade < 29);
        System.out.println(focado || idade == 28);
        System.out.println(focado && idade <= 25);
    }
}
