package negocio;


import java.time.LocalTime;

public class Horario {
    private String idHorario;
    private String dia;
    private LocalTime horaInicial;
    private LocalTime horaFinal;
    private long idMensajero;
    private String tipoId;

    // Constructor
    public Horario(String idHorario, String dia, LocalTime horaInicial, LocalTime horaFinal, long idMensajero, String tipoId) {
        this.idHorario = idHorario;
        this.dia = dia;
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
        this.idMensajero = idMensajero;
        this.tipoId = tipoId;
    }

    // Getters
    public String getIdHorario() {
        return idHorario;
    }

    public String getDia() {
        return dia;
    }

    public LocalTime getHoraInicial() {
        return horaInicial;
    }

    public LocalTime getHoraFinal() {
        return horaFinal;
    }

    public long getIdMensajero() {
        return idMensajero;
    }

    public String getTipoId() {
        return tipoId;
    }

    // Setters
    public void setIdHorario(String idHorario) {
        this.idHorario = idHorario;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public void setHoraInicial(LocalTime horaInicial) {
        this.horaInicial = horaInicial;
    }

    public void setHoraFinal(LocalTime horaFinal) {
        this.horaFinal = horaFinal;
    }

    public void setIdMensajero(long idMensajero) {
        this.idMensajero = idMensajero;
    }

    public void setTipoId(String tipoId) {
        this.tipoId = tipoId;
    }


}
