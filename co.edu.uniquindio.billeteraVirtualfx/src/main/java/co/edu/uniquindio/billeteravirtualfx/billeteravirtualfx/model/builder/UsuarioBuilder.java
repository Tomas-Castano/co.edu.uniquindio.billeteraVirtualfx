package co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.model.builder;

import co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.model.EntidadCuenta;
import co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.model.Usuario;

public class UsuarioBuilder extends PersonaBuilder<UsuarioBuilder>{
    protected String idUsuario;
    protected double saldoDisponible;
    protected EntidadCuenta entidadCuenta;

    public UsuarioBuilder idUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
        return this;
    }

    public UsuarioBuilder saldoDisponible(double saldo) {
        this.saldoDisponible = saldo;
        return this;
    }

    public UsuarioBuilder entidadCuenta(EntidadCuenta cuenta) {
        this.entidadCuenta = cuenta;
        return this;
    }

    @Override
    protected UsuarioBuilder self() {
        return this;
    }

    public Usuario build() {
        return new Usuario(nombre, correo, telefono, direccion, contraseña, idUsuario, saldoDisponible, entidadCuenta);
    }
}
