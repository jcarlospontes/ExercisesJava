package aulase2lementos.aula08;

public class Anonima {

    public void imprimeText(){
        System.out.println("Texto qualquer");
    }

    public static void main(String[] args){
        Anonima anonima = new Anonima(){
            public void imprimeText(){
                System.out.println("qualquer texto que foi sobrescrito");
            }
        };
        anonima.imprimeText();
    }

}
