public class Aula {
    private String descricao;
    private Integer duracao;

    Aula(String descricao, Integer duracao) {
        this.descricao = descricao;
        this.duracao = duracao;
    }
    public String getDescricao() {
        return descricao;
    }
    public Integer getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        return "[Aula: " + descricao + ", " + duracao + " minutos]";
    }
}
