package aulase2lementos.aula08;

public class Externa{

    private String texto = "texto exemplo";
    public class Interna{

        private String texto = "texto exemplo interno";

        public void imprimeText(){
            System.out.println(texto);
            System.out.println(Externa.this.texto);

        }

    }

    public static void main(String[] args){
        Externa externa = new Externa();
        Interna interna = externa.new Interna();

        interna.imprimeText();
    }
}