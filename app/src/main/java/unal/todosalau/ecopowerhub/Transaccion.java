package unal.todosalau.ecopowerhub;

import java.util.Date;

public class Transaccion {
    private Usuario vendedor;
    private Usuario comprador;
    private double cantidadEnergia;
    private Date fechaTransaccion;

    // Constructor, getters y setters

    public Transaccion(Usuario vendedor, Usuario comprador, double cantidadEnergia, Date fechaTransaccion) {
        this.vendedor = vendedor;
        this.comprador = comprador;
        this.cantidadEnergia = cantidadEnergia;
        this.fechaTransaccion = fechaTransaccion;
    }

    public Transaccion() {
    }
    // ...

    public Usuario getVendedor() {
        return vendedor;
    }

    public void setVendedor(Usuario vendedor) {
        this.vendedor = vendedor;
    }

    public Usuario getComprador() {
        return comprador;
    }

    public void setComprador(Usuario comprador) {
        this.comprador = comprador;
    }

    public double getCantidadEnergia() {
        return cantidadEnergia;
    }

    public void setCantidadEnergia(double cantidadEnergia) {
        this.cantidadEnergia = cantidadEnergia;
    }

    public Date getFechaTransaccion() {
        return fechaTransaccion;
    }

    public void setFechaTransaccion(Date fechaTransaccion) {
        this.fechaTransaccion = fechaTransaccion;
    }
}
