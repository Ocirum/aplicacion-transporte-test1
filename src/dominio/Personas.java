package dominio;

public abstract class Personas { //Super clase
    private int id;
    private String nombre;
    private String telefono;

    public Personas(int id, String nombre, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }
}
