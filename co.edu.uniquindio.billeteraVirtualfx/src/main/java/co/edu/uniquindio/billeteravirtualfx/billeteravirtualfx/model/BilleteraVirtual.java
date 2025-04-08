package co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.model;

import java.util.LinkedList;

public class BilleteraVirtual {
    private LinkedList<Administrador> listaAdministradores;
    private LinkedList<Usuario> listaUsuarios;
    private LinkedList<EntidadPresupuesto> listaEntidadPresupuesto;
    private LinkedList<EntidadCategoria> listaEntidadCategoria;
    private LinkedList<EntidadTransaccion> listaEntidadTransaccion;

    public BilleteraVirtual() {}

    public BilleteraVirtual(LinkedList<Administrador> listaAdministradores, LinkedList<Usuario> listaUsuarios, LinkedList<EntidadPresupuesto> listaEntidadPresupuesto, LinkedList<EntidadCategoria> listaEntidadCategoria, LinkedList<EntidadTransaccion> listaEntidadTransaccion) {
        this.listaAdministradores = listaAdministradores;
        this.listaUsuarios = listaUsuarios;
        this.listaEntidadPresupuesto = listaEntidadPresupuesto;
        this.listaEntidadCategoria = listaEntidadCategoria;
        this.listaEntidadTransaccion = listaEntidadTransaccion;
    }

    public LinkedList<Administrador> getListaAdministradores() {
        return listaAdministradores;
    }

    public void setListaAdministradores(LinkedList<Administrador> listaAdministradores) {
        this.listaAdministradores = listaAdministradores;
    }

    public LinkedList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuario(LinkedList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public LinkedList<EntidadPresupuesto> getListaEntidadPresupuesto() {
        return listaEntidadPresupuesto;
    }

    public void setListaEntidadPresupuesto(LinkedList<EntidadPresupuesto> listaEntidadPresupuesto) {
        this.listaEntidadPresupuesto = listaEntidadPresupuesto;
    }

    public LinkedList<EntidadCategoria> getListaEntidadCategoria() {
        return listaEntidadCategoria;
    }

    public void setListaEntidadCategoria(LinkedList<EntidadCategoria> listaEntidadCategoria) {
        this.listaEntidadCategoria = listaEntidadCategoria;
    }

    public LinkedList<EntidadTransaccion> getListaEntidadTransaccion() {
        return listaEntidadTransaccion;
    }

    public void setListaEntidadTransaccion(LinkedList<EntidadTransaccion> listaEntidadTransaccion) {
        this.listaEntidadTransaccion = listaEntidadTransaccion;
    }

    public LinkedList<Usuario> obtenerUsuarios() {
        return listaUsuarios;
    }

    public LinkedList<Administrador> obtenerAdministradores() {
        return listaAdministradores;
    }
}