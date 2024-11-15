package dominio;

public class Usuario extends Personas{

    private String correo;

    public Usuario(int id, String nombre, String telefono, String correo) {
        super(id, nombre, telefono);
        this.correo = correo;
    }
}
