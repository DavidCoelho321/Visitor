public class Desenvolvedor {
    private int identificador;
    private String nome;
    private Grau grau;

    public Desenvolvedor(int identificador, String nome, String grau) {
        this.identificador = identificador;
        this.nome = nome;
        this.grau = grau;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeGrau() {
        return this.grau.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirDesenvolvedor(this);
    }
}
