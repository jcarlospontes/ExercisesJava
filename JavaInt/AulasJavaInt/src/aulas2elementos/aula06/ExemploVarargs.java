package aulase2lementos.aula06;

public class ExemploVarargs {
    public static void main(String[] args){


        int x[] = {6,6,6};


        System.out.println(soma(x));


        System.out.println(soma(1,2,3,4,5,6));

    }

    static int soma(int a, int b){
        return a+b;
    }

    static int soma(int a, int b, int c){
        return a+b+c;
    }

    static int soma(int[] vetor){

        int total = 0;

        for(int x : vetor){
            total += x;
        }
        return total;
    }


    //usando varargs

    static int soma(int a, int b,Integer... vetor){

        int total = 0;

        for(int x : vetor){
            total += x;
        }
        return total;
    }


}
