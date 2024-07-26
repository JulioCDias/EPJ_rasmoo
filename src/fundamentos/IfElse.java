package fundamentos;

public class IfElse {
    public static void main(String[] args) {
        double media = 9.0;
        // se media do aluno for maior ou igual a 6 = aprovado
        //ou se media for maor ou igual a 4 = recuperação
        //se nao reprovado
        if (media >= 6){
            System.out.println("Parabens! ");
            System.out.println("Voçe esta aprovado!!");
        } else if (media >= 5){
                System.out.println("Voçe ficou de Recuperação");
            }
        else {
                System.out.println("Infelizmente voçe foi reprovado!");
        }
    }
}
