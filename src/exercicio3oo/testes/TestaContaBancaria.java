package exercicio3oo.testes;

import exercicio3oo.classes.ContaBancaria;

public class TestaContaBancaria {
    public static void main(String[] args){
        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta("12345-6");
        conta.setTitular("Laura Bassani dos Anjos");
        conta.setSaldo(123.45);

        System.out.printf("Numero da Conta: %s", conta.getNumeroConta());
        System.out.printf("\nTitular: %s", conta.getTitular());
        System.out.printf("\nSaldo: R$%.2f", conta.getSaldo());
    }
}
