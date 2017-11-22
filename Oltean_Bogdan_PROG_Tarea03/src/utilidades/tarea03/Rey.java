package utilidades.tarea03;

/**
 * Clase que crea y mueve el rey sobre la tabla de ajedrez
 * @author bogdan
 */
public class Rey {

    private Color color;
    private Posicion posicion;
    private Direccion direccion;

    /**
     * Constructor por defecto que crea un rey blanco
     */
    public Rey() {
        this(Color.BLANCO);
    }

    /**
     * Constructor que recibe el parametro colo y crea un rey blanco o negro
     * @param color 
     */
    public Rey(Color color) {
        this.color = color;
        switch (color) {
            case BLANCO:
                posicion = new Posicion(1, 'e');
                break;
            case NEGRO:
                posicion = new Posicion(8, 'e');
                break;
        }
    }

    /**
     * 
     * @return color
     */
    public Color getColor() {
        return color;
    }
    
    /**
     * 
     * @return posición
     */
    public Posicion getPosicion() {
        return posicion;
    }

    /**
     * Metodo que recibe la dirección(norte, este, sur, etc.) y mueve el rey en dicha dirección
     * Controla que los movimientos son correctos
     * @param direccion 
     */
    public void mueve(Direccion direccion) {
        this.direccion = direccion;
        switch (direccion) {
            case NORTE:
                if (posicion.getFila() < 8) {
                    posicion.setFila(posicion.getFila() + 1);
                } else {
                    System.out.println("No puedes desplazarte al NORTE");
                }
                break;

            case NORESTE:
                if (posicion.getFila() < 8 && posicion.getColumna() < 'h') {
                    posicion.setFila(posicion.getFila() + 1);
                    posicion.setColumna((char) (posicion.getColumna() + 1));
                } else {
                    System.out.println("No se puede desplazar a NORESTE");
                }
                break;

            case ESTE:
                if (posicion.getColumna() < 'h') {
                    posicion.setColumna((char) (posicion.getColumna() + 1));
                } else {
                    System.out.println("No se puede desplazar a ESTE");
                }
                break;

            case SURESTE:
                if (posicion.getFila() > 1 && posicion.getColumna() < 'h') {
                    posicion.setFila(posicion.getFila() - 1);
                    posicion.setColumna((char) (posicion.getColumna() + 1));
                } else {
                    System.out.println("No se puede desplazar a SURESTE");
                }
                break;
 
            case SUR:
                if (posicion.getFila() > 1) {
                    posicion.setFila(posicion.getFila() - 1);
                } else {
                    System.out.println("No se puede desplazar a SUR");
                }
                break;

            case SUROESTE:
                if (posicion.getFila() > 1 && posicion.getColumna() > 'a') {
                    posicion.setColumna((char) (posicion.getColumna() - 1));
                    posicion.setFila(posicion.getFila() - 1);
                } else {
                    System.out.println("No se puede desplazar a SUROESTE");
                }
                break;

            case OESTE:
                if (posicion.getColumna() > 'a') {
                    posicion.setColumna((char) (posicion.getColumna() - 1));
                } else {
                    System.out.println("No se puede desplazar a OESTE");
                }
                break;
                
            case NOROESTE:
                if (posicion.getColumna() > 'a' && posicion.getFila() < 8) {
                    posicion.setColumna((char) (posicion.getColumna() - 1));
                    posicion.setFila(posicion.getFila() + 1);
                } else {
                    System.out.println("No se puede desplazar a NORESTE");
                }
                break;
        }
    }

    /**
     * Metodo toString que devuelve el colo y la posición del rey
     * @return color
     * @return posicion
     */
    @Override
    public String toString() {
        return "Rey [Color=" + color + ", " + posicion + "]";
    }

}
