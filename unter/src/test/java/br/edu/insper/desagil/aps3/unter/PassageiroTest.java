package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassageiroTest {
    private Passageiro passageiro;
    private Corrida corrida;

    @BeforeEach
    public void setUp() {
        passageiro = new Passageiro("528", "John");
        corrida = new Corrida(passageiro);
        corrida.setMotorista(new Motorista("123", "Khalil"));
    }

    @Test
    public void constroi() {
        assertEquals("528", passageiro.getCpf());
        assertEquals("John", passageiro.getNome());
    }

    @Test
    public void mudaNome() {
        passageiro.setNome("Iman");
        assertEquals("Iman", passageiro.getNome());
    }

    @Test
    public void avalia() {
        passageiro.avalia(corrida, 3);
        assertEquals(3, corrida.getNotaMotorista());
    }

    @Test
    public void avaliaBaixo() {
        passageiro.avalia(corrida, 0);
        assertEquals(1, corrida.getNotaMotorista());
    }

    @Test
    public void avaliaAlto() {
        passageiro.avalia(corrida, 6);
        assertEquals(5, corrida.getNotaMotorista());
    }
}
