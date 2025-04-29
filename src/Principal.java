import com.lalibosso1.AluraPOO.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("IVE Tour 2024");
        meuFilme.setAnoDeLancamento(2024);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoplano(true);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações:" +meuFilme.getTotalDeAvaliacao());
        System.out.println(meuFilme.pegaMedia());


    }
}


