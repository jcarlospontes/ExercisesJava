package aulas2elementos.aula09;

@interface InformacaoAula {

    String autor();
    int aulaNumero();

    String blog() default "http://loiane.com";

    String site() default "http://loiane.training";



}
