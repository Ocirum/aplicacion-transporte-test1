package dominio;

import dominio.interfaces.Conducible;

public abstract class Vehiculo implements Conducible { //Super clase
    protected int id;
    protected String marca;
    protected String modelo;
    protected String placa;
    protected int capacidadPasajeros;
    protected Conductor conductor;

    public Vehiculo(int id, String marca, String modelo, String placa, Conductor conductor) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.conductor = conductor;
    }

    public abstract String obtenerTipo();

    public abstract double calcularTarifa(int minutos);

    public String obtenerDescripcion() {
        return "Id: " + id + ", Marca: " + marca + ", Modelo: " + modelo + ", Placa: " + placa;
    }
}