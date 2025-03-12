package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MotoristaTest {
    private Motorista motorista;
    private Corrida corrida;
    @BeforeEach
    public void setUp() {
        motorista = new Motorista("000", "Kn");
        corrida = new Corrida(new Passageiro("321", "JM"));
    }

    @Test
    public void constroi() {
        assertEquals("Kn", motorista.getNome());
        assertEquals("000", motorista.getCpf());
    }

    @Test
    public void mudaNome() {
        motorista.setNome("Pk");
        assertEquals("Pk", motorista.getNome());
    }

    @Test
    public void avalia() {
        motorista.avalia(corrida, 3);
        assertEquals(3, corrida.getNotaPassageiro());
    }

    @Test
    public void avaliaBaixo() {
        motorista.avalia(corrida, 1);
        assertEquals(1, corrida.getNotaPassageiro());
    }
    @Test
    public void avaliaAlto() {
        motorista.avalia(corrida, 6);
        assertEquals(5, corrida.getNotaPassageiro());
    }
}
