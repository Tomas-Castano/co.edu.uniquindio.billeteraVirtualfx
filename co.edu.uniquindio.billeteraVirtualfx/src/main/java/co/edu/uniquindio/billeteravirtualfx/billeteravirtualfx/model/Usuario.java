package co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.model;

import co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.services.IUsuario;

public class Usuario extends Persona implements IUsuario {
    private String idUsuario;
    private double saldoDisponible;
    EntidadCuenta entidadCuenta;

    public Usuario(String nombre, String correo, String telefono, String direccion, String contraseña, String idUsuario, double saldoDisponible, EntidadCuenta entidadCuenta) {
        super(nombre, correo, telefono, direccion, contraseña);
        this.idUsuario = idUsuario;
        this.saldoDisponible = saldoDisponible;
        this.entidadCuenta = entidadCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    @Override
    public boolean agregarDinero() {
        return false;
    }

    @Override
    public boolean retirarDinero() {
        return false;
    }

    @Override
    public boolean transferirDinero() {
        return false;
    }

    @Override
    public double consultarSaldo() {
        return 0;
    }

    @Override
    public boolean consultarTransacciones() {
        return false;
    }

    @Override
    public boolean categorizarTransacciones() {
        return false;
    }

    @Override
    public boolean gestionarCuentas() {
        return false;
    }

    @Override
    public boolean crearPresupuesto() {
        return false;
    }

    @Override
    public boolean modificarPresupuesto() {
        return false;
    }

    @Override
    public boolean eliminarPresupuesto() {
        return false;
    }
}