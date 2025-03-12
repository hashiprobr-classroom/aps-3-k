package br.edu.insper.desagil.aps3.unter;

public class Corrida {
    private Passageiro passageiro;
    private Motorista motorista;
    private int notaPassageiro;
    private int notaMotorista;

    public Corrida(Passageiro passageiro) {
        this.passageiro = passageiro;
        this.motorista = null;
        this.notaPassageiro = 0;
        this.notaMotorista = 0;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public int getNotaPassageiro() {
        return notaPassageiro;
    }

    public int getNotaMotorista() {
        return notaMotorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    private int truncar(int nota) {
        if ((nota < 1) && (nota != 0)) {
            nota = 1;
        }
        if (nota > 5) {
            nota = 5;
        }
        return nota;
    }

    public void avaliaMotorista(int valor) {
        this.notaMotorista = truncar(valor);
    }
    public void avaliaPassageiro(int valor) {
        this.notaPassageiro = truncar(valor);
    }
}