package co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.model;

import co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.services.IAdministrador;

public class Administrador extends Persona implements IAdministrador{
    private String idAdministrador;
    private String contraseña;

    public Administrador(String nombre, String correo, String telefono, String direccion, String idAdministrador, String contraseña) {
        super(nombre, correo, telefono, direccion, contraseña);
        this.idAdministrador = idAdministrador;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(String idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    @Override
    public boolean crearUsuario() {
        return false;
    }

    @Override
    public boolean actualizarUsuario() {
        return false;
    }

    @Override
    public boolean eliminarUsuario() {
        return false;
    }

    @Override
    public boolean listarUsuario() {
        return false;
    }

    @Override
    public boolean crearTransaccion() {
        return false;
    }

    @Override
    public boolean listarTransaccion() {
        return false;
    }

    @Override
    public boolean eliminarTransaccion() {
        return false;
    }

    @Override
    public boolean crearCuenta() {
        return false;
    }

    @Override
    public boolean eliminarCuenta() {
        return false;
    }

    @Override
    public boolean actualizarCuenta() {
        return false;
    }
}