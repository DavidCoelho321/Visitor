public class UsuarioVisitor implements UsuarioVisito, Usuario.UsuarioVisitor {
    @Override
    public String exibir(Usuario usuario) {
        return usuario.aceitar(this);
    }

    @Override
    public String exibirJogador(Jogador jogador) {
        return "Jogador{" +
                "numero=" + jogador.getIdentificador() +
                ", nome='" + jogador.getNome() + '\'' +
                ", grau=" + jogador.getNomeGrau() +
                '}';
    }

    @Override
    public String exibirDesenvolvedor(Desenvolvedor desenvolvedor) {
        return "Jogador{" +
                "numero=" + desenvolvedor.getIdentificador() +
                ", nome='" + desenvolvedor.getNome() + '\'' +
                ", grau=" + desenvolvedor.getNomeGrau() +
                '}';
    }

}
