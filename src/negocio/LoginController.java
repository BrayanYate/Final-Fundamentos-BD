package negocio;

import util.RHException;
import javax.swing.JOptionPane;

public class LoginController {

    private GestionClientes gestionClientes;
    private GestionMensajeros gestionMensajeros;

    public LoginController() {
        gestionClientes = new GestionClientes();
        gestionMensajeros = new GestionMensajeros();
    }

    public boolean login(String email, String password) {
        try {
            Cliente cliente = gestionClientes.consultarClientePorCorreo(email);
            if (cliente != null && cliente.getContrasena().equals(password)) {
                return true; // Client login successful
            }

            Mensajero mensajero = gestionMensajeros.consultarMensajeroPorCorreo(email);
            if (mensajero != null && mensajero.getContrasena().equals(password)) {
                return true; // Mensajero login successful
            }

            return false; // Login failed
        } catch (RHException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
