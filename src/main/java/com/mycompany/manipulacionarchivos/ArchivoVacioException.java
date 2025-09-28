/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.manipulacionarchivos;

/**
 * @author USER
 * Excepción personalizada que representaría un error cuando un archivo está vacío, aqui se aplica la herencia de la clase base Exception
 */
public class ArchivoVacioException extends Exception {

    /**
     * Constructor que recibe un mensaje de error
     *
     * @param mensaje Mensaje del error.
     */
    public ArchivoVacioException(String mensaje) {
        super(mensaje);
    }
}