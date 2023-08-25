package aulas1enum.exercicio;

import java.util.Scanner;

public class OperacoesEnum{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double x, y;

        System.out.print("Digite o valor de x: ");
        x = sc.nextDouble();
        System.out.print("Digite o valor de y: ");
        y = sc.nextDouble();


        for(Operacoes op:Operacoes.values()){
            System.out.println("operacao "+op.toString()+ " com "+x+" e "+y+": "+op.executarOperacao(x,y));
        }
    }
}

//Criacao de Enum para armazenar e fazer o controle das operacoes
enum Operacoes {

    SOMAR("+") {
        @Override
        public double executarOperacao(double x, double y) {
            return x+y;
        }
    }, SUBTRAIR("-") {
        @Override
        public double executarOperacao(double x, double y) {
            return x-y;
        }
    }, MULTIPLICAR("*") {
        @Override
        public double executarOperacao(double x, double y) {
            return x*y;
        }
    }, DIVIDIR("/") {
        @Override
        public double executarOperacao(double x, double y) {
            return x/y;
        }
    };

    //atributo que armazena o tipo da operacao
    private String operador;

    //construtor solicitando o tipo de operacao do Enum
    Operacoes(String operador){
        this.operador=operador;
    }


    //toString para printar o operador
    @Override
    public String toString() {
        return this.operador;
    }

    //metodo abstrato para realizar a operacao com base no operador do enum
    public abstract double executarOperacao(double x, double y);

}
