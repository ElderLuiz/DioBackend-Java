package dev.elder.BTratamentoExcecoes.DestruturasExepcionais;
import java.text.NumberFormat;
import java.text.ParseException;

public class Bexemploexcecao {

        public static void main(String[] args) {
            Number valor = null;
            try {
                valor = NumberFormat.getInstance().parse("a1.75");
                System.out.println(valor);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }

//            valor = NumberFormat.getInstance().parse("a1.75");

            System.out.println(valor);

        }
    }

