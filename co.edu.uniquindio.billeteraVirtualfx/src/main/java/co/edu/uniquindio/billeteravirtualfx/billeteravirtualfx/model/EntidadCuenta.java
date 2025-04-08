package co.edu.uniquindio.billeteravirtualfx.billeteravirtualfx.model;

public class EntidadCuenta {
    private String idCuenta;
    private String nombreBanco;
    private String numeroCuenta;
    private TipoCuenta TipoCuenta;

    public EntidadCuenta() {}

    public EntidadCuenta(String idCuenta, String nombreBanco, String numeroCuenta) {
        this.idCuenta = idCuenta;
        this.nombreBanco = nombreBanco;
        this.numeroCuenta = numeroCuenta;
    }

    public String getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(String idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
}
