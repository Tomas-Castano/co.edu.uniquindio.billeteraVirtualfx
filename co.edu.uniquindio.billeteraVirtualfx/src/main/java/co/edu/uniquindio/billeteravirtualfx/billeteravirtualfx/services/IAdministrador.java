package co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.services;

public interface IAdministrador {
    public boolean crearUsuario();
    public boolean actualizarUsuario();
    public boolean eliminarUsuario();
    public boolean listarUsuario();
    public boolean crearTransaccion();
    public boolean listarTransaccion();
    public boolean eliminarTransaccion();
    public boolean crearCuenta();
    public boolean eliminarCuenta();
    public boolean actualizarCuenta();
}
