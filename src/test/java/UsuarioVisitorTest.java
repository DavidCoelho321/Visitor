import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class UsuarioVisitorTest {
    @Test
    void deveExibirJogador() {
        Jogador jogador = new Jogador(03547, "João", "primeiro");

        UsuarioVisitor visitor = new UsuarioVisitor();
        assertEquals("Jogador{identificador=03547, nome='João', Grau=1}", visitor.exibir(jogador));
    }

    @Test
    void deveExibirDesenvolvedor() {
        Desenvolvedor desenvolvedor = new Desenvolvedor(02574, "Pedro", "terceiro");

        UsuarioaVisitor visitor = new UsuarioVisitor();
        assertEquals("Desenvolvedor{identificador=02574, nome='Pedro', Grau='3'}", visitor.exibir(desenvolvedor));
    }

}