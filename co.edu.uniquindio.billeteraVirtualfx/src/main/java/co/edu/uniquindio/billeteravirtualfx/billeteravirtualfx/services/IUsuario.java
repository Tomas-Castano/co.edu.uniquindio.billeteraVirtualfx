package co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.services;

import co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.model.Usuario;

public interface IUsuario {
    public boolean agregarDinero();
    public boolean retirarDinero();
    public boolean transferirDinero();
    public double consultarSaldo();
    public boolean consultarTransacciones();
    public boolean categorizarTransacciones();
    public boolean gestionarCuentas();
    public boolean crearPresupuesto();
    public boolean modificarPresupuesto();
    public boolean eliminarPresupuesto();
}
