package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CentralTest {
    private Central central;

    @BeforeEach
    public void setUp() {
        central = new Central();
    }

    @Test
    public void nenhumaAvaliacaoPassageiro() {
        assertEquals(0,central.mediaPassageiro("555"));
    }

    @Test
    public void nenhumaAvaliacaoMotorista() {
        assertEquals(0, central.mediaMotorista("000"));
    }

    @Test
    public void avaliacoesPassageiro() {
        Corrida c1 = new Corrida(new Passageiro("000", "Eurico"));
        Corrida c2 = new Corrida(new Passageiro("000", "Rubens"));
        Corrida c3 = new Corrida(new Passageiro("000", "Paiva"));
        Corrida c4 = new Corrida(new Passageiro("111", "Donny"));

        c1.avaliaPassageiro(0);
        c2.avaliaPassageiro(4);
        c3.avaliaPassageiro(5);
        c4.avaliaPassageiro(3);

        central.adiciona(c1);
        central.adiciona(c2);
        central.adiciona(c3);
        central.adiciona(c4);

        assertEquals(4.5, central.mediaPassageiro("000"));
    }

    @Test
    public void avalicoesMotorista() {
        Corrida c1 = new Corrida(new Passageiro("000", "Eurico"));
        Corrida c2 = new Corrida(new Passageiro("000", "Eurico"));
        Corrida c3 = new Corrida(new Passageiro("000", "Eurico"));
        Corrida c4 = new Corrida(new Passageiro("001", "Rupert"));
        Corrida c5 = new Corrida(new Passageiro("010", "Stewie"));

        Motorista m1 = new Motorista("000", "Dk");
        Motorista m2 = new Motorista("010", "Pk");

        c1.setMotorista(m1);
        c2.setMotorista(m1);
        c3.setMotorista(m1);
        c4.setMotorista(m2);

        c1.avaliaMotorista(0);
        c2.avaliaMotorista(2);
        c3.avaliaMotorista(3);
        c4.avaliaMotorista(1);
        c5.avaliaMotorista(1);

        central.adiciona(c1);
        central.adiciona(c2);
        central.adiciona(c3);
        central.adiciona(c4);
        central.adiciona(c5);

        assertEquals(2.5, central.mediaMotorista("000"));


    }
}
