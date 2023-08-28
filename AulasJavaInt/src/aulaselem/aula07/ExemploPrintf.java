package aulaselem.aula07;

public class ExemploPrintf {
    public static void main(String[] args) {
        //format padrao
        //System.out.printf(format, args);

        //string normal
        System.out.printf("%s", "Olá, Mundo!");
        System.out.println();
        //string em caixa alta
        System.out.printf("%S", "Olá, Mundo!");
        System.out.println();
        //caractere
        System.out.printf("%c", 'c');
        System.out.println();
        //caractere em caixa alta
        System.out.printf("%C", 'c');
        //pula linha
        System.out.printf("%n");

        int valor = 32423423;
        //formata numero
        System.out.printf("%d", valor);
        System.out.println();
        //formata numero com x digitos com 0 completando a esquerda
        System.out.printf("%015d", valor);
        System.out.println();
        //formata numero separando com virgula
        System.out.printf("%,d", valor);
        System.out.println();
        //formata numero com sinal positivo(caso positivo)
        System.out.printf("%+d", valor);
        System.out.println();

        int valor2 = -1322323;
        //formata numero com sinal positivo(caso negativo)
        System.out.printf("% d", valor2);
        System.out.println();
        
        double valorfloat = 3.1456789;
        //formata float normal
        System.out.printf("%f", valorfloat);
        System.out.println();
        //formata float com casa decimal especifica arredondando
        System.out.printf("%.2f", valorfloat);
        System.out.println();
        //formata float com valor monetario
        System.out.printf("R$%10.2f", valorfloat);
        System.out.println();

        String stringnormal = "Olá Mundo!";
        //formata para que a string toda tenha x caracteres completando a esquerda
        System.out.printf("%20s", stringnormal);
        System.out.println();
        //formata para que a string toda tenha x caracteres completando a direita
        System.out.printf("%-20s", stringnormal);
        System.out.println();


        testeMaisCompleto();



    }

    private static void testeMaisCompleto(){
        double[] precos = {10000, 123.54, 7843.567, 1, 4.56789};

        for(int i = 0; i < precos.length;i++){
            System.out.printf("%s %02d: total de R$%,10.2f%n","Item", i+1, precos[i]);
        }
    }

        //Java.util.Formater

}
