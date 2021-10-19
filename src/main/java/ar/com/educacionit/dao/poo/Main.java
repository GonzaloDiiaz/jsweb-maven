package ar.com.educacionit.dao.poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Auto clio = new Auto();
        clio.setColor("Clio azul");

        Auto astra = new Auto();
        astra.setColor("Astra negro");

        Moto honda = new Moto();
        System.out.println(honda.getColor());

        Moto zanella = new Moto();
        System.out.println(zanella.getColor());

        Auto[] autos = {clio, astra};
        Moto[] motos = {honda, zanella};

        Vehiculo[] vehiculos = new Vehiculo[autos.length + motos.length];
        vehiculos[0] = clio;
        vehiculos[1] = astra;
        vehiculos[2] = zanella;
        vehiculos[3] = honda;

        //Todos los vehiculos
        for (Vehiculo vehiculo : vehiculos){
            System.out.println(vehiculo.getColor());
        }

    }
}
