package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import negocio.Servicio;
import util.RHException;
import util.ServiceLocator;

public class ServicioDAO {

    public ServicioDAO(){

    }

        public void registroServicio(Servicio servicio) throws RHException{//Clase que maneja el acceso a la tabla servicio de la BD.
        try{
            String strSQL = "INSERT INTO public.servicio(k_idservicio, k_tipoidcliente, k_idcliente,"+
            " k_tipoidmensajero, k_idmensajero, k_codigopostal, q_costo, i_tipopaquete, f_solicitud,"+
            " i_estado) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setInt(1,servicio.getIdServicio()); 
            prepStmt.setString(2,  servicio.getTipoIdCliente()); 
            prepStmt.setInt(3, servicio.getIdCliente()); 
            prepStmt.setString(4, servicio.getTipoIdMensajero()); 
            prepStmt.setInt(5, servicio.getIdMensajero());  
            prepStmt.setInt(6, servicio.getCodigoPostal()); 
            prepStmt.setInt(7, servicio.getCosto());  
            prepStmt.setString(8, servicio.getTipoPaquete());
            prepStmt.setDate(9, java.sql.Date.valueOf(servicio.getF_solicitud())); 
            prepStmt.setString(10, servicio.getEstado());
            prepStmt.executeUpdate();
            prepStmt.close();
            ServiceLocator.getInstance().commit();
        }catch(SQLException e){
            ServiceLocator.getInstance().rollback();
            throw new RHException( "ServicioDAO", "No pudo crear el servicio"+ e.getMessage());
        }finally{
            ServiceLocator.getInstance().liberarConexion();
        }
    }
    
}
