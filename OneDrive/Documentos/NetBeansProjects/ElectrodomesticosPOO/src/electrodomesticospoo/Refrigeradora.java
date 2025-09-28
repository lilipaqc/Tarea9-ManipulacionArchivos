/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electrodomesticospoo; 

/**
 * Clase Refrigeradora
 * Hereda de Electrodomestico y añade propiedades
 * Polimorfismo por sobreescritura al modificar el comportamiento de 'encender()'.
 * @author  
 */
public class Refrigeradora extends Electrodomestico {
    private int capacidadLitros; // Atributo para Refrigeradora
    private boolean tieneCongelador; // true si tiene, false si no

    /**
     * Constructor de la clase Refrigeradora.
     * @param nombre El nombre 
     * @param precio El precio
     * @param marca La marca
     * @param modelo El modelo
     * @param capacidadLitros La capacidad en litros
     * @param tieneCongelador Indica si tiene congelador
     */
    public Refrigeradora(String nombre, double precio, String marca, String modelo, int capacidadLitros, boolean tieneCongelador) {
        super(nombre, precio, marca, modelo);
        this.capacidadLitros = capacidadLitros;
        this.tieneCongelador = tieneCongelador;
    }

    // Getters para los atributos específicos de Refrigeradora
    public int getCapacidadLitros() {
        return capacidadLitros;
    }

    public boolean isTieneCongelador() {
        return tieneCongelador;
    }

    /**
     * Sobreescribe el método mostrarInformacion() de Electrodomestico.
     */
    @Override
    public String mostrarInformacion() {
        String congeladorInfo = tieneCongelador ? "Sí" : "No"; 
        return super.mostrarInformacion() + ", Capacidad: " + capacidadLitros + "L, Congelador: " + congeladorInfo;
    }

    /**
     * Sobreescribe el método encender() de Electrodomestico.
     * Proporciona un comportamiento específico para la refrigeradora.
     * @return mensaje indicando que la refrigeradora está enfriando.
     */
    @Override //
    public String encender() {
        return "La refrigeradora " + getMarca() + " " + getModelo() + " está comenzando a enfriar."; // Comportamiento 
    }
}
