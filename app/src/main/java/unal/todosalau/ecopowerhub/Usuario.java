package unal.todosalau.ecopowerhub;

public class Usuario {
    private String nombre;
    private String direccion;
    private String contacto;
    private TerrazaJardin terrazaJardin;

    // Constructor, getters y setters

    public Usuario(String nombre, String direccion, String contacto, TerrazaJardin terrazaJardin) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.contacto = contacto;
        this.terrazaJardin = terrazaJardin;
    }

    public Usuario() {
    }
    // ...

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public TerrazaJardin getTerrazaJardin() {
        return terrazaJardin;
    }

    public void setTerrazaJardin(TerrazaJardin terrazaJardin) {
        this.terrazaJardin = terrazaJardin;
    }
}
