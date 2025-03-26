
package servicios;

import java.util.ArrayList;
import java.util.List;
import entidades.Reserva;

/**
 * Clase relacionada a Sistema de Reservas Deportivas
 */

public class SistemaReservasDeportivas {

    private List<Reserva> reservas;
    private boolean[] iluminacion;
    private static final int MAX_PISTAS = 10; // Número máximo de pistas disponibles

    /**
     * Constructor que inicializa la lista de reservas y el estado de iluminación.
     */
    
    public SistemaReservasDeportivas() {
    	
        reservas = new ArrayList<>();
        iluminacion = new boolean[MAX_PISTAS];
    }

    /**
     * Intenta reservar una pista en una fecha específica.
     * 
     * @param idPista  ID de la pista.
     * @param fecha    Fecha de la reserva de las pistas.
     * @param duracion Duración de la reserva en horas.
     * @return true si la reserva fue exitosa, false si la pista ya está reservada o el ID es inválido.
     */
    
    public boolean reservarPista(int idPista, String fecha, int duracion) {
    	
        if (idPista < 0 || idPista >= MAX_PISTAS) {
        	
            return false; // ID de pista inválido
        }
        
        for (Reserva r : reservas) {
        	
            if (r.getIdPista() == idPista && r.getFecha().equals(fecha)) {
            	
                return false; // Pista ya reservada en esa fecha
            }
        }
        
        reservas.add(new Reserva(idPista, fecha, duracion));
        return true;
    }

    /**
     * Cancela una reserva basada en su ID.
     * 
     * @param idReserva ID de la reserva a cancelar.
     * @return true si la cancelación fue exitosa, false si no se encontró la reserva.
     */
    
    public boolean cancelarReserva(int idReserva) {
    	
        for (int i = 0; i < reservas.size(); i++) {
        	
            if (reservas.get(i).getIdPista() == idReserva) {
            	
                reservas.remove(i);
                return true;
            }
        }
        
        return false; // No se encontró la reserva
    }

    /**
     * Activa la iluminación de una pista específica.
     * 
     * @param idPista ID de la pista.
     * @return true si la iluminación se activó correctamente, false si el ID es inválido.
     */
    
    public boolean activarIluminacion(int idPista) {
    	
        if (idPista < 0 || idPista >= MAX_PISTAS) {
        	
            return false; // ID de pista inválido
        }
        
        iluminacion[idPista] = true;
        return true;
    }

    /**
     * Desactiva la iluminación de la pista que le indiques.
     * 
     * @param idPista ID de la pista.
     * @return true si la iluminación se desactivó correctamente, false si el ID es inválido.
     */
    
    public boolean desactivarIluminacion(int idPista) {
    	
        if (idPista < 0 || idPista >= MAX_PISTAS) {
        	
            return false; // ID de pista inválido
        }
        
        iluminacion[idPista] = false;
        return true;
    }

    /**
     * Verifica si una pista está disponible en una fecha y hora determinada.
     * @param idPista ID de la pista.
     * @param fecha Fecha a consultar en formato "YYYY-MM-DD".
     * @param hora Hora de la consulta (actualmente no usada en la lógica).
     * @return true si la pista está disponible, false si ya está reservada o el ID es inválido.
     */
    
    public boolean verificarDisponibilidad(int idPista, String fecha, String hora) {
    	
        if (idPista < 0 || idPista >= MAX_PISTAS) {
        	
            return false; // ID de pista inválido
        }
        
        for (Reserva r : reservas) {
        	
            if (r.getIdPista() == idPista && r.getFecha().equals(fecha)) {
            	
                return false; // La pista ya está reservada
            }
        }
        
        return true; // La pista está disponible
    }
}
