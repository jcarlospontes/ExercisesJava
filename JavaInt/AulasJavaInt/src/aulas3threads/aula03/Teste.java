package aulas3threads.aula03;

public class Teste {

    public static void main(String[] args){
        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1",500);
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2",500);
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3",500);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.start();

        try {
            t1.join(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();
        t3.start();

        while(t1.isAlive() || t2.isAlive() || t3.isAlive()){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Programa Finalizado");

        //A classe Runnable pode extender qualquer outra classe
        //A classe Thread só pode extender aquela classe chamada

        //Se não for sobrepor qualquer outro método da Thread é melhor usar o Runnable.
    }
}
