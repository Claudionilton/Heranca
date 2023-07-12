package Heranca;

import java.util.Date;

public class Main {



    public static void main(String[] args) {

        Vendedor v = new Vendedor();
        v.setNome("Claudionilton");
        v.setSalario(3815.0f);
        v.setCpf("22555885578");
        v.setDataNascimento(new Date());
        v.setComissaoPorItem(10.0f);
        v.setTotalItensVendidos(10);

        System.out.println("O salario do vendedor é: " + v.calcularSalario());
        v.calcularSalario();

        Motorista m = new Motorista();

    }

}