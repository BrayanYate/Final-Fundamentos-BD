package negocio;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PagoMensajero {
    private int idPago;
    private LocalDate inicioPeriodo;
    private LocalDate finPeriodo;
    private BigDecimal valor;
    private String estado;
    private long idMensajero;
    private String tipoId;

    // Constructor
    public PagoMensajero(int idPago, LocalDate inicioPeriodo, LocalDate finPeriodo, BigDecimal valor, String estado, long idMensajero, String tipoId) {
        this.idPago = idPago;
        this.inicioPeriodo = inicioPeriodo;
        this.finPeriodo = finPeriodo;
        this.valor = valor;
        this.estado = estado;
        this.idMensajero = idMensajero;
        this.tipoId = tipoId;
    }

    // Getters
    public int getIdPago() {
        return idPago;
    }

    public LocalDate getInicioPeriodo() {
        return inicioPeriodo;
    }

    public LocalDate getFinPeriodo() {
        return finPeriodo;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public String getEstado() {
        return estado;
    }

    public long getIdMensajero() {
        return idMensajero;
    }

    public String getTipoId() {
        return tipoId;
    }

    // Setters
    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public void setInicioPeriodo(LocalDate inicioPeriodo) {
        this.inicioPeriodo = inicioPeriodo;
    }

    public void setFinPeriodo(LocalDate finPeriodo) {
        this.finPeriodo = finPeriodo;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setIdMensajero(long idMensajero) {
        this.idMensajero = idMensajero;
    }

    public void setTipoId(String tipoId) {
        this.tipoId = tipoId;
    }

}
