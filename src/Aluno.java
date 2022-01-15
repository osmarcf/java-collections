public class Aluno {
    private String nome;
    private int numeroMatricula;

    public Aluno(String nome, int numeroMatricula) {
        if (nome == null) {
            throw new NullPointerException();
        }
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    @Override
    public String toString() {
        return "[Nome: " + nome + ", " + numeroMatricula + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        Aluno outro = (Aluno) obj;
        if (nome == null) {
            if (outro.nome != null)
                return false;
        }
        else if (!nome.equals(outro.nome))
            return false;
        
        if (numeroMatricula != outro.numeroMatricula)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = result * prime + ((nome == null) ? 0 : nome.hashCode());
        result = result * prime + numeroMatricula;
        return result;
    }
}
