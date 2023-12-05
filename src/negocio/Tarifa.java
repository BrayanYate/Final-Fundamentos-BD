
package negocio;

public class Tarifa {
    private int idTarifa;
    private int valor;
    private char tipoPaquete;
    private int codigoPostal;

    // Constructor
    public Tarifa(int idTarifa, int valor, char tipoPaquete, int codigoPostal) {
        this.idTarifa = idTarifa;
        this.valor = valor;
        this.tipoPaquete = tipoPaquete;
        this.codigoPostal = codigoPostal;
    }

    // Getters
    public int getIdTarifa() {
        return idTarifa;
    }

    public int getValor() {
        return valor;
    }

    public char getTipoPaquete() {
        return tipoPaquete;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    // Setters
    public void setIdTarifa(int idTarifa) {
        this.idTarifa = idTarifa;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setTipoPaquete(char tipoPaquete) {
        this.tipoPaquete = tipoPaquete;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
}
