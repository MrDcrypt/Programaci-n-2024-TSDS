/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase0905;

import java.util.Scanner;

/**
 *
 * @author daniel
 */

public class Clase0905 {

    /**
     * @param args the command line arguments
     *
     */
    private static class Persona {

        private String direccion;
        private String nombrePersona;
        private Double pesoPersona = 72.5;
        private Double pesoComida;
        private Double ahorros = 1000.00;
        private Double salarioXhora;
        private Integer horasTrabajo;

        public String caminar() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingresa la direccion en texto ejemplo >la esquina< ");
            direccion = scanner.nextLine();

            return "caminando hacia-->" + direccion;
        }

        public String hablar() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingresa nombre de la persona ");
            nombrePersona = scanner.nextLine();
            scanner.close();
            return "Hablando con -->" + nombrePersona;
        }

        public String comer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa cuanto pesa tu comida en kilos, por ejemplo 1,2 o 1,0: ");
        pesoComida = scanner.nextDouble();
        pesoPersona += pesoComida * 0.5;
        
        // No cierres el Scanner aquí
        
        return "Comiendo... Tu nuevo peso es: " + pesoPersona;
    }
    
    // Otros métodos de la clase...

        public String ejercitar() {

            pesoPersona -= pesoPersona * 0.005;
            return "Has ejercitado tu nuevo peso es->" + pesoPersona;
        }

        public String trabajar() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingresa el salario por hora ejemplo 700.00->");
            salarioXhora = scanner.nextDouble();
            System.out.println("Ingresa las horas trabajadas->");
            horasTrabajo = scanner.nextInt();
            Double calculo = horasTrabajo * salarioXhora;
            ahorros += calculo;
            scanner.close();

            return "Has trabajado tus ahorros ahora son ->" + ahorros;

        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = new Persona();
       
        System.out.println(persona.trabajar());
      
      

    }

}
