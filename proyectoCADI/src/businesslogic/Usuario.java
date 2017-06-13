package businesslogic;

/**
 * Clase que crea el objeto Usuario con sus respectivos atributos.
 * @author Jesús Enrique Flores Nestozo
 * @version 1.0
 */
public class Usuario {
    private String idUsuario = "";
    private String nombreUsuario = "";
    private String contrasenia = "";
    private String tipo = "";

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
