/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electrodomesticospoo; 

/**
 * Clase Derivada: Lavadora
 * Hereda atributos y métodos de Electrodomestico y añade propiedades 
 * Demuestra el polimorfismo por sobreescritura al modificar el comportamiento de 'encender()'.
 * @author Lilian Paulina Quijije Coral
 */
public class Lavadora extends Electrodomestico { // Hereda de Electrodomestico
    private int capacidadKg; // Atributo de Lavadora
    private String tipoCarga; // frontal o superior

    /**
     * Constructor de la clase Lavadora.
     * Llama al constructor de la clase padre Electrodomestico y añade los atributos propios.
     * @param nombre El nombre 
     * @param precio El precio.
     * @param marca La marca.
     * @param modelo El modelo.
     * @param capacidadKg La capacidad en kilogramos.
     * @param tipoCarga El tipo de carga frontal o superior
     */
    public Lavadora(String nombre, double precio, String marca, String modelo, int capacidadKg, String tipoCarga) {
        super(nombre, precio, marca, modelo); // Llama al constructor de la clase padre
        this.capacidadKg = capacidadKg;
        this.tipoCarga = tipoCarga;
    }

    // Getters para los atributos de Lavadora
    public int getCapacidadKg() {
        return capacidadKg;
    }

    public String getTipoCarga() {
        return tipoCarga;
    }

    /**
     * Sobreescribe el método mostrarInformacion() de Electrodomestico.
     * Demuestra polimorfismo por sobreescritura.
     * @return Una cadena con la información detallada de la lavadora.
     */
    @Override // Anotación opcional pero recomendada para indicar que se sobreescribe un método
    public String mostrarInformacion() {
        // Se puede usar getNombre(), getMarca(), getModelo(), getPrecio() debido a la encapsulación y herencia
        return super.mostrarInformacion() + ", Capacidad: " + capacidadKg + "kg, Carga: " + tipoCarga; // Utiliza el método de la superclase
    }

    /**
     * Sobreescribe el método encender() de Electrodomestico.
     * Proporciona un comportamiento específico para la lavadora.
     * @return mensaje indicando que la lavadora está iniciando su ciclo.
     */
    @Override //
    public String encender() {
        return "La lavadora " + getMarca() + " " + getModelo() + " está iniciando el ciclo de lavado."; // Comportamiento específico
    }

    /**
     * Ejemplo de Polimorfismo por Sobrecarga.
     * Permite iniciar la lavadora de diferentes maneras.
     * @param programa El tipo de programa de lavado como "rápido", "algodón", "lana", etc.
     * @return mensaje indicando el programa de lavado iniciado.
     */
    public String encender(String programa) { // m ismo nombre pero diferente parámetro
        return "La lavadora " + getMarca() + " " + getModelo() + " está iniciando el programa de lavado '" + programa + "'.";
    }
}
