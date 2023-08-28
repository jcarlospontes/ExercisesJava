package aulas3threads.aula02;

public class Teste {

    public static void main(String[] args){
        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1",500);
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2",600);
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3",800);

        //A classe Runnable pode extender qualquer outra classe
        //A classe Thread só pode extender aquela classe chamada

        //Se não for sobrepor qualquer outro método da Thread é melhor usar o Runnable.
    }
}
