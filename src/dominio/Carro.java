package dominio;

import dominio.interfaces.Conducible;

public class Carro extends Vehiculo {
    private String color;
    private String ejes;

    public Carro(int id, String marca, String modelo, String placa, String color, Conductor conductor) {
        super(id, marca, modelo, placa, conductor);
        this.color = color;
    }

    @Override
    public String obtenerTipo() {
        return "Carro";
    }

    @Override
    public double calcularTarifa(int minutos) {
        return minutos*2000;
    }

    @Override
    public void iniciarViaje() {
        System.out.println("Viaje en carro iniciado");
    }

    @Override
    public void terminarViaje() {
        System.out.println("Viaje en carro terminado");
    }
}
