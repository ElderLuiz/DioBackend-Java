package dev.elder.BestruturasCondicionais;

public class DTamanhoCamisa {
    public static void main(String[] args) {
        String tamanho ="G";

        /*if (tamanho == "G"){
            System.out.println("Grande");
        } else if (tamanho == "M") {
            System.out.println("Medio");
        } else if(tamanho == "P"){
            System.out.println("Pequeno");
        }else System.out.println("Indefinido");*/

        switch (tamanho){
            case "P":{
                System.out.println("Pequeno");
                break;
            }
            case "G":{
                System.out.println("Grande");
                break;
            } case "M":{
                System.out.println("Medio");
                break;
            } default:
                System.out.println("Indefinido");
        }
    }
}
