package negocio;

public class Servicio {

    private int idServicio;
    private String tipoIdCliente;
    private int idCliente;
    private String tipoIdMensajero;
    private int idMensajero;
    private int codigoPostal;
    private int costo;
    private String tipoPaquete;
    private String f_solicitud;
    private String estado;

    
    public Servicio() {
    }


    public int getIdServicio() {
        return idServicio;
    }


    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }


    public String getTipoIdCliente() {
        return tipoIdCliente;
    }


    public void setTipoIdCliente(String tipoCliente) {
        this.tipoIdCliente = tipoCliente;
    }


    public int getIdCliente() {
        return idCliente;
    }


    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }


    public String getTipoIdMensajero() {
        return tipoIdMensajero;
    }


    public void setTipoIdMensajero(String tipoIdMensajero) {
        this.tipoIdMensajero = tipoIdMensajero;
    }


    public int getIdMensajero() {
        return idMensajero;
    }


    public void setIdMensajero(int idMensajero) {
        this.idMensajero = idMensajero;
    }


    public int getCodigoPostal() {
        return codigoPostal;
    }


    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }


    public int getCosto() {
        return costo;
    }


    public void setCosto(int costo) {
        this.costo = costo;
    }


    public String getTipoPaquete() {
        return tipoPaquete;
    }


    public void setTipoPaquete(String tipoPaquete) {
        this.tipoPaquete = tipoPaquete;
    }


    public String getF_solicitud() {
        return f_solicitud;
    }


    public void setF_solicitud(String f_solicitud) {
        this.f_solicitud = f_solicitud;
    }


    public String getEstado() {
        return estado;
    }


    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
