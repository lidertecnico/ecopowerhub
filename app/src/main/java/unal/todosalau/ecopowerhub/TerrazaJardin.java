package unal.todosalau.ecopowerhub;

public class TerrazaJardin {
    private double capacidadGeneracion;
    private String ubicacion;
    private String descripcion;

    public TerrazaJardin(double capacidadGeneracion, String ubicacion, String descripcion) {
        this.capacidadGeneracion = capacidadGeneracion;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
    }

    public TerrazaJardin() {
    }

    public TerrazaJardin(double capacidadGeneracion, String ubicacion) {
        this.capacidadGeneracion = capacidadGeneracion;
        this.ubicacion = ubicacion;
    }

    public double getCapacidadGeneracion() {
        return capacidadGeneracion;
    }

    public void setCapacidadGeneracion(double capacidadGeneracion) {
        this.capacidadGeneracion = capacidadGeneracion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
