package aulas3threads.aula01;

public class MinhaThread extends Thread{

    private String nome;
    private int tempo;

    public MinhaThread(String nome, int tempo){
        this.nome = nome;
        this.tempo = tempo;
        start();
    }


    public void run() {

        for (int i = 0 ; i < 6 ; i++){
            System.out.println(nome + " contador "+i);
            try {
                Thread.sleep(this.tempo);
            }catch (InterruptedException e){

            }
        }
        System.out.println("Thread "+nome+" terminou.");

    }
}
