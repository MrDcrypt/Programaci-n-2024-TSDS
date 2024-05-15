/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase0205;

import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class Clase0205 {

    /**
     * @param args the command line arguments
     *
     */
    private static class Auto {

        private Boolean consultaEncendido = Boolean.FALSE;
        private Integer cambio = 0;
        private Integer cantidadCombustible = 20;
        private Integer cantidadRuedas = 4;
        private Integer cantidadPuertas = 4;
        private String color = "Rojo";

        public String encenderAuto() {
            if (consultaEncendido) {
                return "El auto ya está encendido.";
            } else if (consultaEncendido == true || cantidadCombustible >= 10) {

                consultaEncendido = true;
                return "Encendiendo";
            } else {
                return "vehiculo no puede encender compruebe combustible";
            }
        }

        public String apagarAuto() {
            if (!consultaEncendido) {
                return "El auto ya está apagado.";
            } else {
                consultaEncendido = false;
                return "Apagando";
            }
        }

        public String cargarNafta() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingresa el número de litros de nafta a cargar (máximo 40 litros): ");
            int litros = scanner.nextInt();

            if (litros <= 0) {
                return "No se ha cargado nafta. La cantidad de litros debe ser menor que cero.";
            } else if (litros > 40) {
                return "No se ha cargado nafta. La cantidad de litros no puede ser mayor que 40.";
            } else {
                int suma = cantidadCombustible + litros;
                if (suma > 40) {
                    int excedente = suma - 40; 
                    int litrosCargados = litros - excedente; 
                    cantidadCombustible += litrosCargados; 
                    return "Solo se ha cargado " + litrosCargados + " litros";
                } else {
                    cantidadCombustible += litros; // Si no hay excedente, cargar la cantidad solicitada
                    return "Se cargaron " + litros + " litros. Ahora tienes " + cantidadCombustible + " litros.";
                }
            }
        }

        public String ingresarCambio() {
            if (consultaEncendido) {
                System.out.println("Estas en la marcha: " + cambio);
                System.out.println("1 para SUBIR marcha, 0 para bajar marcha ->");
                Scanner scanner = new Scanner(System.in);
                int numeroMarcha = scanner.nextInt();

                if (numeroMarcha == 0 && cambio > 0) {
                    cambio -= 1;
                    return "Bajaste a " + cambio;
                } else if (numeroMarcha == 1 && cambio < 6) {
                    cambio += 1;
                    return "Subiste a " + cambio;
                } else {
                    return "No se realizó ningún cambio de marcha.";
                }
            } else {
                return "No se puede cambiar de marcha porque el auto está apagado.";
            }
        }

        public String avanzar() {
            if (consultaEncendido) {
                cantidadCombustible -= 2;
                return "Avanzando";
            } else {
                return "No se puede avanzar porque el auto está apagado.";
            }
        }

        public String retroceder() {
            if (consultaEncendido) {
                cantidadCombustible -= 1;
                return "Retrocediendo";

            } else {
                return "No se puede retroceder porque el auto está apagado.";
            }
        }

        public Boolean getConsultaEncendido() {
            return consultaEncendido;
        }

        public String sensorCombustible() {
            return "hay" + cantidadCombustible + "litros de combustible en el tanque";
        }
    }

    public static void main(String[] args) {
        Auto auto = new Auto();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar el menú de opciones

            System.out.println("Seleccione una opción:");
            System.out.println("1. Encender el auto");
            System.out.println("2. Apagar el auto");
            System.out.println("3. Cargar nafta");
            System.out.println("4. Cambiar de marcha");
            System.out.println("5. Avanzar");
            System.out.println("6. Retroceder");
            System.out.println("0. Salir");
            System.out.println(auto.sensorCombustible());
            System.out.print("Opción: ");
            System.out.println("---------------------------------");

            // Leer la opción del usuario
            opcion = scanner.nextInt();

            // Ejecutar la opción seleccionada
            switch (opcion) {
                case 1:
                    System.out.println(auto.encenderAuto());
                    break;
                case 2:
                    System.out.println(auto.apagarAuto());
                    break;
                case 3:
                    System.out.println(auto.cargarNafta());
                    break;
                case 4:
                    System.out.println(auto.ingresarCambio());
                    break;
                case 5:
                    System.out.println(auto.avanzar());
                    break;
                case 6:
                    System.out.println(auto.retroceder());
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }
}
