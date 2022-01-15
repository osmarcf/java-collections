import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Curso colecoes = new Curso("Dominando as colecoes Java", "Paulo Silveira");
        //List<Aula> aulas = colecoes.getAulas();

        colecoes.adiciona(new Aula("Trabalhando com arraylists", 21));
        colecoes.adiciona(new Aula("Relacionamento com colecoes", 23));
        colecoes.adiciona(new Aula("Encapsulando o acesso", 15));

        System.out.println(colecoes.getAulas());

        List<Aula> aulas = new ArrayList<>(colecoes.getAulas());
        aulas.sort(Comparator.comparing(Aula::getDescricao));
        System.out.println(aulas);

        //Integer tempoTotal = aulas.stream().mapToInt(a -> a.getDuracao()).sum();
        //System.out.println(tempoTotal);
 
        System.out.println(colecoes.getTempoTotal());

        Aluno a1 = new Aluno("Fulano", 5792);
        Aluno a2 = new Aluno("Sicrano", 4432);
        Aluno a3 = new Aluno("Beltrano", 2351);

        colecoes.matricula(a1);
        colecoes.matricula(a2);
        colecoes.matricula(a3);

        colecoes.getAlunos().forEach(a -> System.out.println(a.getNome()));

        System.out.println(colecoes.estaMatriculado(new Aluno("Beltrano", 2351)));

        Aluno aluno = colecoes.buscaPorMatricula(2351);
        System.out.println(aluno);

    }
}
