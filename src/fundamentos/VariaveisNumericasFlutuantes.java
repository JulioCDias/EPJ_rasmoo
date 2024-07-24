package fundamentos;

public class VariaveisNumericasFlutuantes {
    public static void main(String[] args) {
        //Float
        //Double
        double nota = 19.0;
        float nota1 = 8.0F;
        double media;
        System.out.println("_______FLOAT________");
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println("_______DOUBLE________");
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println("_______SAIDAS_________");
        System.out.println("A nota do Aluno x é: "+nota);
        System.out.println("A nota do Aluno Y é: "+nota1);
        media = (nota1+nota)/2;
        System.out.println("A Meda da Classe é: "+media);
    }
}
