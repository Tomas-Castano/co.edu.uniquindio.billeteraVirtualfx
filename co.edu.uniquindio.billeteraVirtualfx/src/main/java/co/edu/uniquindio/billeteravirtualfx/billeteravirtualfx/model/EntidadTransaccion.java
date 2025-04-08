package co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.model;

import co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.services.IEntidadTransaccion;

import java.util.Date;

public class EntidadTransaccion implements IEntidadTransaccion{
    private String idTransaccion;
    private Date fechaTransaccion;
    TipoTransaccion tipoTransaccion;
    private double monto;
    private String descripcion;

    public EntidadTransaccion() {}

    public EntidadTransaccion(String idTransaccion, Date fechaTransaccion, double monto, String descripcion) {
        this.idTransaccion = idTransaccion;
        this.fechaTransaccion = fechaTransaccion;
        this.monto = monto;
        this.descripcion = descripcion;
    }

    public String getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(String idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public Date getFechaTransaccion() {
        return fechaTransaccion;
    }

    public void setFechaTransaccion(Date fechaTransaccion) {
        this.fechaTransaccion = fechaTransaccion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean filtrarTransacciones() {
        return false;
    }

    @Override
    public boolean listarTransacciones() {
        return false;
    }
}