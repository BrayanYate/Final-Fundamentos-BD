package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import negocio.Cliente;

import util.RHException;
import util.ServiceLocator;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Santiago
 */
public class ClienteDAO {
    
    public ClienteDAO(){

    }

    public void registroCliente(Cliente cliente) throws RHException {
        try {
            String strSQL = "INSERT INTO cliente(k_tipoid, k_idcliente, n_nombre, n_apellido, q_telefono, n_correo, n_contrasena) VALUES (?, ?, ?, ?, ?, ?, ?)";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setString(1, cliente.getTipoId()); // Check method name in Cliente class
            prepStmt.setLong(2, cliente.getIdCliente()); // Assuming idCliente is a long
            prepStmt.setString(3, cliente.getNombre());
            prepStmt.setString(4, cliente.getApellido());
            prepStmt.setLong(5, cliente.getTelefono()); // Assuming telefono is a long
            prepStmt.setString(6, cliente.getCorreo());
            prepStmt.setString(7, cliente.getContrasena()); // Check method name in Cliente class
            prepStmt.executeUpdate();
            prepStmt.close();
            ServiceLocator.getInstance().commit();
        } catch (SQLException e) {
            ServiceLocator.getInstance().rollback();
            throw new RHException("ClienteDAO", "No pudo crear el cliente: " + e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }
    }

     
    public void actualizarCliente(long id, long nuevoTelefono, String nuevoCorreo) throws RHException {
        try {
            String strSQL = "UPDATE cliente SET q_telefono = ?, n_correo = ? WHERE k_idcliente = ?";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setLong(1, nuevoTelefono);
            prepStmt.setString(2, nuevoCorreo);
            prepStmt.setLong(3, id);
            prepStmt.executeUpdate();
            prepStmt.close();
            ServiceLocator.getInstance().commit();
        } catch (SQLException e) {
            ServiceLocator.getInstance().rollback();
            throw new RHException("ClienteDAO", "No pudo actualizar el contacto del cliente: " + e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }
    }

    /*public Cliente consultarCliente(long idCliente) throws RHException {
        try {
            String strSQL = "SELECT k_tipoid, k_idcliente, n_nombre, n_apellido, q_telefono, n_correo, n_contrasena FROM cliente WHERE k_idcliente = ?";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setLong(1, idCliente);
            ResultSet rs = prepStmt.executeQuery();
            if (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setTipoId(rs.getString("k_tipoid"));
                cliente.setIdCliente(rs.getLong("k_idcliente"));
                cliente.setNombre(rs.getString("n_nombre"));
                cliente.setApellido(rs.getString("n_apellido"));
                cliente.setTelefono(rs.getLong("q_telefono"));
                cliente.setCorreo(rs.getString("n_correo"));
                cliente.setContrasena(rs.getString("n_contrasena"));
                return cliente;
            }
            rs.close();
            prepStmt.close();
            return null;
        } catch (SQLException e) {
            throw new RHException("ClienteDAO", "Error consultando cliente: " + e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }
    }*/

    public Cliente consultarClientePorCorreo(String correo) throws RHException {
        try {
            String strSQL = "SELECT n_nombre, n_correo, n_contrasena FROM cliente WHERE n_correo = ?";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setString(1, correo);
            ResultSet rs = prepStmt.executeQuery();
            if (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setNombre(rs.getString("n_nombre"));
                cliente.setCorreo(rs.getString("n_correo"));
                cliente.setContrasena(rs.getString("n_contrasena"));
                return cliente;
            }
            rs.close();
            prepStmt.close();
            return null;
        } catch (SQLException e) {
            throw new RHException("ClienteDAO", "Error consultando cliente por correo: " + e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }
    }



    public List<Cliente> obtenerTodosLosClientes() throws RHException {
        List<Cliente> clientes = new ArrayList<>();
        Connection conexion = null;
        PreparedStatement prepStmt = null;
        ResultSet rs = null;
            try {
                String strSQL = "SELECT k_tipoid, k_idcliente, n_nombre, n_apellido, q_telefono, n_correo, n_contrasena FROM cliente";
                conexion = ServiceLocator.getInstance().tomarConexion();
                prepStmt = conexion.prepareStatement(strSQL);
                rs = prepStmt.executeQuery();

                while (rs.next()) {
                    Cliente cliente = new Cliente();
                    cliente.setTipoId(rs.getString("k_tipoid"));
                    cliente.setIdCliente(rs.getLong("k_idcliente"));
                    cliente.setNombre(rs.getString("n_nombre"));
                    cliente.setApellido(rs.getString("n_apellido"));
                    cliente.setTelefono(rs.getLong("q_telefono"));
                    cliente.setCorreo(rs.getString("n_correo"));
                    cliente.setContrasena(rs.getString("n_contrasena"));
                    clientes.add(cliente);
                }
            } catch (SQLException e) {
                throw new RHException("ClienteDAO", "Error al obtener todos los clientes: " + e.getMessage());
            } finally {
                ServiceLocator.getInstance().liberarConexion();
                try {
                    if (rs != null) rs.close();
                    if (prepStmt != null) prepStmt.close();
                } catch (SQLException e) {
                    throw new RHException("ClienteDAO", "Error al cerrar recursos: " + e.getMessage());
                }
            }
            return clientes;
        }
    
}
