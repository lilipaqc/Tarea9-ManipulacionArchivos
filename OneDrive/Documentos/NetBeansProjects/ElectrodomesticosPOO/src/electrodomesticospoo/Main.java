/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package electrodomesticospoo;

/**
 * Clase Principal: Main
 * Demuestramos la funcionalidad de las clases Electrodomestico, Lavadora y Refrigeradora.
 * Muestra también los principios de POO: Encapsulación, Herencia y Polimorfismo.
 * @author Lilian Quijije
 */
public class Main {

    /**
     * Método principal donde se ejecuta la aplicación.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("--- Demostración de Electrodomésticos ---");

        // 1. Demostración de Encapsulación y Clase Base (Electrodomestico)
        System.out.println("\n--- 1. Electrodoméstico Genérico (Encapsulación) ---");
        Electrodomestico miElectro = new Electrodomestico("Televisor", 599.99, "Samsung", "AU8000");
        System.out.println(miElectro.mostrarInformacion()); 
        System.out.println(miElectro.encender());

        // Modificando un atributo con un setter y validación
        System.out.println("Intentando cambiar precio a -50.0:");
        miElectro.setPrecio(-50.0); // mensaje de error
        System.out.println("Intentando cambiar precio a 650.0:");
        miElectro.setPrecio(650.0); // Cambio válido
        System.out.println("Nuevo precio del Televisor: $" + miElectro.getPrecio());


        // 2. Demostración de Herencia y Polimorfismo (Lavadora)
        System.out.println("\n--- 2. Lavadora (Herencia y Polimorfismo) ---");
        Lavadora miLavadora = new Lavadora("Lavadora", 750.00, "LG", "TurboWash 300", 15, "Frontal");
        System.out.println(miLavadora.mostrarInformacion()); // Método sobreescrito (Polimorfismo)
        System.out.println(miLavadora.encender()); // Método sobreescrito (Polimorfismo)
        System.out.println(miLavadora.encender("ropa delicada")); // Método sobrecargado (Polimorfismo)

        // Accediendo a atributos de Lavadora
        System.out.println("Capacidad de la lavadora: " + miLavadora.getCapacidadKg() + " kg");
        System.out.println("Tipo de carga: " + miLavadora.getTipoCarga());

        // 3. Demostración de Herencia y Polimorfismo (Refrigeradora)
        System.out.println("\n--- 3. Refrigeradora (Herencia y Polimorfismo) ---");
        Refrigeradora miRefrigeradora = new Refrigeradora("Refrigeradora", 1200.50, "Whirlpool", "Side-by-Side Pro", 500, true);
        System.out.println(miRefrigeradora.mostrarInformacion()); // Método sobreescrito (Polimorfismo)
        System.out.println(miRefrigeradora.encender()); // Método sobreescrito (Polimorfismo)

        // Accediendo a atributos de Refrigeradora
        System.out.println("Capacidad de la refrigeradora: " + miRefrigeradora.getCapacidadLitros() + " litros");
        System.out.println("¿Tiene congelador? " + (miRefrigeradora.isTieneCongelador() ? "Sí" : "No"));

        // 4. Demostración de Polimorfismo con una colección
        System.out.println("\n--- 4. Polimorfismo en una Colección ---");
        // Una lista de Electrodomesticos que puede contener Lavadoras y Refrigeradoras
        Electrodomestico[] misElectrodomesticos = new Electrodomestico[3];
        misElectrodomesticos[0] = miElectro; // El televisor (Electrodomestico)
        misElectrodomesticos[1] = miLavadora; // La lavadora (tratada como Electrodomestico)
        misElectrodomesticos[2] = miRefrigeradora; // La refrigeradora (tratada como Electrodomestico)

        for (Electrodomestico elec : misElectrodomesticos) {
            System.out.println("--------------------");
            System.out.println(elec.mostrarInformacion());
            System.out.println(elec.encender()); // polimorfismo 
        }
        System.out.println("--------------------");

        System.out.println("\n--- Fin de la Demostración ---");
    }
}