package co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.model;

import co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.services.IEntidadPresupuesto;

public class EntidadPresupuesto implements IEntidadPresupuesto{
    private String idPresupuesto;
    private String nombre;
    private double monto;
    private double montoGastado;

    public EntidadPresupuesto() {}

    public EntidadPresupuesto(String idPresupuesto, String nombre, double monto, double montoGastado) {
        this.idPresupuesto = idPresupuesto;
        this.nombre = nombre;
        this.monto = monto;
        this.montoGastado = montoGastado;
    }

    public String getIdPresupuesto() {
        return idPresupuesto;
    }

    public void setIdPresupuesto(String idPresupuesto) {
        this.idPresupuesto = idPresupuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getMontoGastado() {
        return montoGastado;
    }

    public void setMontoGastado(double montoGastado) {
        this.montoGastado = montoGastado;
    }

    @Override
    public boolean crearPresupuesto() {
        return false;
    }

    @Override
    public boolean eliminarPresupuesto() {
        return false;
    }

    @Override
    public boolean actualizarPresupuesto() {
        return false;
    }

    @Override
    public boolean consultarEstadoPresupuesto() {
        return false;
    }

    @Override
    public boolean consultarGastoPresupuesto() {
        return false;
    }
}