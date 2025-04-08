package co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.model;

import co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.services.IEntidadCategoria;

public class EntidadCategoria implements IEntidadCategoria{
    private String idCategoria;
    private String nombre;
    private String descripcion;

    public EntidadCategoria() {}

    public EntidadCategoria(String idCategoria, String nombre, String descripcion) {
        this.idCategoria = idCategoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean crearCategoria() {
        return false;
    }

    @Override
    public boolean eliminarCategoria() {
        return false;
    }

    @Override
    public boolean actualizarCategoria() {
        return false;
    }

    @Override
    public boolean asignarCategoria() {
        return false;
    }
}