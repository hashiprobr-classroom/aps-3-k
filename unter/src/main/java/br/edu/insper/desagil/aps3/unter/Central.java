package br.edu.insper.desagil.aps3.unter;

import java.util.ArrayList;
import java.util.List;

public class Central {
    private List<Corrida> corridas;

    public Central() {
        this.corridas = new ArrayList<>();
    }
    public void adiciona(Corrida corrida) {
        corridas.add(corrida);
    }
    public double mediaPassageiro(String cpf) {
        int contador = 0;
        double media_pass = 0;
        if (corridas.isEmpty()) {
            return 0;
        }
        for (Corrida corrida : corridas) {
            if (corrida.getPassageiro().getCpf().equals(cpf)) {
                if (corrida.getNotaPassageiro() > 0) {
                    media_pass += corrida.getNotaPassageiro();
                    contador += 1;
                }
            }
        }
        return media_pass / contador;
    }

    public double mediaMotorista(String cpf) {
        if (corridas.isEmpty()) {
            return 0;
        }
        int contador = 0;
        double media_mot = 0;
        for (Corrida corrida : corridas) {
            if ((corrida.getMotorista() != null) && (corrida.getMotorista().getCpf().equals(cpf))) {
                if (corrida.getNotaMotorista() > 0) {
                    media_mot += corrida.getNotaMotorista();
                    contador += 1;
                }
            }
        }
        return media_mot / contador;
    }
}