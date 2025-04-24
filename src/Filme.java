public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoplano;
    double somaDasAvaliacoes;
    int totalDeAvaliacao;
    int duracaoEmMinutos;

    void exibeFichaTecnica(){
        System.out.println("O nome do filme é : " +nome);
        System.out.println("O filme lançou em : " +anoDeLancamento);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacao++;

    }

    double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacao;
    }
}

