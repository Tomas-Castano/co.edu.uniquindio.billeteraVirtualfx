package co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.model.builder;

import co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.model.Persona;

public abstract class PersonaBuilder<T extends PersonaBuilder<T>> {
    protected String nombre, correo, telefono, direccion, contraseña;

    public T nombre(String nombre) {
        this.nombre = nombre;
        return self();
    }

    public T correo(String correo) {
        this.correo = correo;
        return self();
    }

    public T telefono(String telefono) {
        this.telefono = telefono;
        return self();
    }

    public T direccion(String direccion) {
        this.direccion = direccion;
        return self();
    }

    public T contraseña(String contraseña) {
        this.contraseña = contraseña;
        return self();
    }

    protected abstract T self();
}
