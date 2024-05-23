package dev.elder.DesafioBancoDio;

public abstract class Conta implements IConta{
    private static int AGENCIA_PADRAO = 0001;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    private static int SEQUENCIAL = 0;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++ ;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo += valor;

    }

    @Override
    public void depositar(double valor) {
        saldo -= valor;

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);

    }


    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    protected void imprimirInfo(){
        System.out.println("============= Informações do Titular =============");

        System.out.println("Titular: "+cliente.getNome());
        System.out.println("Idade: "+cliente.getIdade());
        System.out.println("Sexo: "+cliente.getSexo());

        System.out.println("============= Extrado Conta Poupanca =============");

        System.out.println("Agencia: "+ this.agencia);
        System.out.println("Conta: "+ this.numero);
        System.out.println("Saldo: "+ this.saldo);

        System.out.println("============= Extrado Conta Corrente =============");

        System.out.println("Agencia: "+ this.agencia);
        System.out.println("Conta: "+ this.numero);
        System.out.println("Saldo: "+ this.saldo);
    }
}
