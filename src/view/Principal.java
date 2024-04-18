package view;

import model.Conta;

public class Principal {
    public static void main(String[] args) throws Exception {
        Conta c = new Conta();

        c.setAgencia(1);
        c.setCodigo(1);
        c.setLimite(10);
        c.setSaldo(50);

        c.depositar(50);
        System.out.println(c.getSaldo());
        c.sacar(100);
        System.out.println(c.getSaldo());
        c.sacar(20);
        System.out.println(c.getSaldo());
        c.depositar(800);
        System.out.println(c.getSaldo());
    }
}
