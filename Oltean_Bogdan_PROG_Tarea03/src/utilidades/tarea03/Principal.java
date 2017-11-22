package utilidades.tarea03;

import utilidades.Entrada;

/**
 *
 * @author bogdan
 */
public class Principal {

    public static void main(String[] args) {

        Rey rey = new Rey();
        Posicion posicion = new Posicion();
        int menu;
        System.out.println("*************MENU*************");
        System.out.println("1. Selecciona color del Rey");
        System.out.println("2. Mueve el Rey");
        System.out.println("3. Salir");
        menu = Entrada.entero();
        while (menu < 1 || menu > 3) {
            System.out.println("Opción erronea, intenta de nuevo:");
            menu = Entrada.entero();
        }
        while (menu != 3) {
            switch (menu) {
                case 1:
                    System.out.println("Introduce las letras corespondientes para introducir el rey:");
                    System.out.println("B. Blanco");
                    System.out.println("N. Negro");
                    char color = Entrada.caracter();
                    color = Character.toUpperCase(color);
                    while (color != 'B' && color != 'N') {
                        System.out.println("Opcion erronea, intenta de nuevo:");
                        System.out.println("B. Blanco");
                        System.out.println("N. Negro");
                        color = Entrada.caracter();
                        color = Character.toUpperCase(color);

                    }
                    if (color == 'B') {
                        rey = new Rey(Color.BLANCO);
                        System.out.println("Se ha creado un rey BLANCO.");
                    } else if (color == 'N') {
                        rey = new Rey(Color.NEGRO);
                        System.out.println("Se ha creado un rey NEGRO.");
                    }
                    break;
                case 2:
                    System.out.println("Introduce la dirección a que quieres mover(norte, noreste, este, etc.)");
                    String posicion2 = Entrada.cadena().toUpperCase();
                    System.out.println(posicion2);
                    while (!posicion2.equals("NORTE") && !posicion2.equals("NORESTE") && !posicion2.equals("ESTE") && !posicion2.equals("SURESTE") && !posicion2.equals("SUR") && !posicion2.equals("SUROESTE") && !posicion2.equals("OESTE") && !posicion2.equals("NOROESTE")) {
                        System.out.println("Opcion erronea, intenta de nuevo");
                        System.out.println("Introduce la dirección a que quieres mover(norte, noreste, este, etc.):");
                        posicion2 = Entrada.cadena().toUpperCase();
                    }
                    switch (posicion2) {
                        case "NORTE":
                            rey.mueve(Direccion.NORTE);
                            System.out.println(rey.toString());
                            break;
                        case "NORESTE":
                            rey.mueve(Direccion.NORESTE);
                            System.out.println(rey.toString());
                            break;
                        case "ESTE":
                            rey.mueve(Direccion.ESTE);
                            System.out.println(rey.toString());
                            break;
                        case "SURESTE":
                            rey.mueve(Direccion.SURESTE);
                            System.out.println(rey.toString());
                            break;
                        case "SUR":
                            rey.mueve(Direccion.SUR);
                            System.out.println(rey.toString());
                            break;
                        case "SUROESTE":
                            rey.mueve(Direccion.SUROESTE);
                            System.out.println(rey.toString());
                            break;
                        case "OESTE":
                            rey.mueve(Direccion.OESTE);
                            System.out.println(rey.toString());
                            break;
                        case "NOROESTE":
                            rey.mueve(Direccion.NOROESTE);
                            System.out.println(rey.toString());
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Fin.");
                    break;
            }
            System.out.println("*************MENU*************");
            System.out.println("1. Selecciona color del Rey");
            System.out.println("2. Mueve el Rey");
            System.out.println("3. Salir");
            menu = Entrada.entero();
            while (menu < 1 || menu > 3) {
                System.out.println("Opción erronea, intenta de nuevo:");
                menu = Entrada.entero();
            }
        }
        System.out.println("Fin programa.");

    }

}
