package co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.model.builder;

import co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.model.Administrador;

public class AdministradorBuilder extends PersonaBuilder<AdministradorBuilder>{
    protected String idAdministrador;

    public AdministradorBuilder idAdministrador(String idAdministrador) {
        this.idAdministrador = idAdministrador;
        return this;
    }

    @Override
    protected AdministradorBuilder self() {
        return null;
    }

    public Administrador build() {
        return new Administrador(nombre, correo, telefono, direccion, contraseña, idAdministrador);
    }
}
