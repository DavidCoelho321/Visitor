public class Jogador {

    private int identificador;
    private String nome;
    private Grau grau;

    public Jogador(int identificador, String nome, Grau grau) {
        this.identificador = identificador;
        this.nome = nome;
        this.grau = grau;
    }

    public Jogador(int identificador, String joão, String primeiro) {

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
        return visitor.exibirJogador(this);
    }

}

