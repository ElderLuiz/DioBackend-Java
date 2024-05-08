package dev.elder.Cdebbuging;

public class Amain {
    public static void main(String[] args) {
        System.out.println("Iniciou do programa no método main.");
        a();
        System.out.println("Finalizou do programa no método main.");
    }

    static void a() {
        System.out.println("Entrou no metodo a.");
        b();
        System.out.println("Finalizou no metodo a.");
    }

    static void b() {
        System.out.println("Entrou no metodo b.");
        for(int i=0; i <= 4; i++) System.out.println(i);
        System.out.println("Finalizou o método b.");
    }
    static void c(){
        System.out.println("Entrou no método c.");
//Thread.dumpStack();
        System.out.println("Finalizou o método c.");

    }
}
