package model;

public class Conta {

    private int agencia;
    private int codigo;
    private int saldo;
    private float limite;

    public Conta() {
        super();
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public void depositar(float valor) {
        saldo += valor;
    }

    public void sacar(float valor) throws Exception {
        if (valor > saldo + limite) {
            throw new Exception("Limite insuficiente... Valor disponível para saque R$ " + (limite + saldo));
        } else if (valor == saldo + limite) {
            saldo = 0;
            limite = 0;
        } else {
            saldo -= valor;
        }
    }
}
