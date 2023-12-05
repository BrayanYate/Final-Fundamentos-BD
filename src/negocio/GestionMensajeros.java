package negocio;

import datos.MensajeroDAO;
import util.RHException;

public class GestionMensajeros {
    private MensajeroDAO mensajeroDAO;

    public GestionMensajeros() {
        mensajeroDAO = new MensajeroDAO();
    }

    public Mensajero consultarMensajeroPorCorreo(String correo) throws RHException {
        return mensajeroDAO.consultarMensajeroPorCorreo(correo);
    }

    // Other methods...
}