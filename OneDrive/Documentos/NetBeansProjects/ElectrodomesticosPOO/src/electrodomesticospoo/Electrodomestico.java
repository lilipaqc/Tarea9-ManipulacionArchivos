/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electrodomesticospoo; 

/**
 * Clase Base: Electrodomestico
 * Encapsulación para mantener los atributos privados y proporcionar métodos públicos para modificarlos.
 * @author Lilian Paulina Quijije Coral
 */
public class Electrodomestico {
    // Atributos encapsulados (privados) para proteger los datos
    private String nombre;
    private double precio;
    private String marca;
    private String modelo;

    /**
     * Constructor de la clase Electrodomestico.
     * Atributos del electrodoméstico
     * @param nombre El nombre del electrodoméstico
     * @param precio El precio del electrodoméstico.
     * @param marca La marca del electrodoméstico.
     * @param modelo El modelo específico del electrodoméstico
     */
    public Electrodomestico(String nombre, double precio, String marca, String modelo) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.modelo = modelo;
    }

    // Métodos de acceso (Getters) para los atributos encapsulados
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    // Métodos de modificación o Setters para los atributos 
    public void setPrecio(double precio) {
        if (precio > 0) { // Para asegurar un precio válido
            this.precio = precio;
        } else {
            System.out.println("El precio no puede ser negativo o cero.");
        }
    }

    /**
     * Método que muestra la información general del electrodoméstico.
     * @return Una cadena con los detalles básicos del electrodoméstico.
     */
    public String mostrarInformacion() {
        return "Tipo: " + nombre + ", Marca: " + marca + ", Modelo: " + modelo + ", Precio: $" + precio;
    }

    /**
     * Método para encender el electrodoméstico.
     * Comportamiento común que puede ser sobrescrito por clases hijas
     */
    public String encender() {
        return "El " + nombre + " " + modelo + " se está encendiendo."; 
    }
}