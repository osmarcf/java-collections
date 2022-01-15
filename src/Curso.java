import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<>();
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer, Aluno> matriculaAluno = new HashMap<>();

    Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }

    public int getTempoTotal() {
        return aulas.stream().mapToInt(Aula::getDuracao).sum();
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public void matricula(Aluno aluno) {
        alunos.add(aluno);
        matriculaAluno.put(aluno.getNumeroMatricula(), aluno);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public Aluno buscaPorMatricula(int matricula) {
        /*
        return alunos
            .stream()
            .filter(a -> a.getNumeroMatricula() == matricula)
            .findAny()
            .orElse(null);
            //.orElseThrow(NoSuchElementException::new);
        */

        if (!matriculaAluno.containsKey(matricula))
            throw new NoSuchElementException();
        return matriculaAluno.get(matricula);
    }
}
