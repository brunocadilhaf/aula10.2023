package Pacote3;

public class Passageiro extends Pessoa {
    private int codigoCliente;


    public Passageiro (String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
}
