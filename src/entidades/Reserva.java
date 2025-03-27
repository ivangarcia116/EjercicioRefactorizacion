package entidades;

import java.time.LocalDateTime;

/** 
 * Clase Reserva con las propiedades de la reserva, el id de la pista, la fecha de la reserva y la duración.
 */

public class Reserva {

    private int idPista;
    private LocalDateTime fecha;
    private int duracion;

    /**
     * Constructor de Reserva
     * @param idPista Contiene el id de la pista a la que se hace referencia.
     * @param fecha Contiene la fecha en la que se hace la reserva de la pista.
     * @param duracion Contiene la duración de la reserva de la pista.
     */
    public Reserva (int idPista, LocalDateTime fecha, int duracion) {
    	
        this.idPista = idPista;
        this.fecha = fecha;
        this.duracion = duracion;
    }

    /**
     * Obtenemos el id de la pista referenciada
     * @return idPista es el valor a devolver
     */
    public int getIdPista() {
    	
        return idPista;
    }

    /**
     * Obtenemos la fecha de la pista referenciada
     * @return fecha es el valor a devolver
     */
    public LocalDateTime getFecha() {
    	
        return fecha;
    }

    /**
     * Obtenemos la duracion de la pista referenciada
     * @return duracion es el valor a devolver
     */
    public int getDuracion() {
    	
        return duracion;
    }
}
