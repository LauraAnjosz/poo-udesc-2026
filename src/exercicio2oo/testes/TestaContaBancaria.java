package exercicio2oo.testes;

import exercicio2oo.classes.ContaBancaria;

public class TestaContaBancaria {
    public static void main(String[] args){
        ContaBancaria conta = new ContaBancaria();

        conta.numeroConta = "12345-6";
        conta.titular = "Laura Bassani dos Anjos";
        conta.saldo = 123.45;

        System.out.println("Número da Conta: "+conta.numeroConta);
        System.out.println("Titular: "+conta.titular);
        System.out.println("Saldo: R$"+conta.saldo);
    }
}
