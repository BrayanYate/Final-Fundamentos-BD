package negocio;


import datos.ClienteDAO;
import java.util.List;
import util.RHException;

/**
 * Clase controladora de la aplicación para manejar operaciones de clientes.
 */
public class GestionClientes {
    private ClienteDAO clienteDAO;
    private Cliente cliente;

    public GestionClientes() {
       clienteDAO = new ClienteDAO();
    }

    /**
     * Registra un nuevo cliente en el sistema.
     * 
     * @param id Identificador del cliente.
     * @param nombre Nombre del cliente.
     * @param apellido Apellido del cliente.
     * @param telefono Teléfono del cliente.
     * @param correo Correo electrónico del cliente.
     * @param contrasena Contraseña del cliente.
     * @throws RHException Si ocurre un error en el registro.
     */
    public void registrarCliente(String tipoId, long id, String nombre, String apellido, long telefono, String correo, String contrasena) throws RHException {
        cliente = new Cliente();
        cliente.setTipoId(tipoId);
        cliente.setIdCliente(id);
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setTelefono(telefono);
        cliente.setCorreo(correo);
        cliente.setContrasena(contrasena);
        clienteDAO.registroCliente(cliente);
    }
    public void actualizarDatosContacto(long id, long nuevoTelefono, String nuevoCorreo) throws RHException {
        clienteDAO.actualizarCliente(id, nuevoTelefono, nuevoCorreo);
    }

   /* public Cliente consultarClienteGeneral(long id) throws RHException {
        return clienteDAO.consultarCliente(id);
    }*/
    /**
     * Consulta la información de un cliente por su correo electrónico.
     * 
     * @param correo El correo electrónico del cliente.
     * @return Cliente El cliente consultado.
     * @throws RHException Si ocurre un error durante la consulta.
     */
    public Cliente consultarClientePorCorreo(String correo) throws RHException {
        return clienteDAO.consultarClientePorCorreo(correo);
    }
    
    public List<Cliente> obtenerTodosLosClientes() throws RHException {
        return clienteDAO.obtenerTodosLosClientes();
    }

}
