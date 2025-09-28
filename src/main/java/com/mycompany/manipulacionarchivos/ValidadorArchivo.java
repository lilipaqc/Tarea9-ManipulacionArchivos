/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.manipulacionarchivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author USER
 * Clase para validar archivos y con un método para verificar si un archivo no está vacío.
 */
public class ValidadorArchivo {

    /**
     * Verifica si un archivo contiene contenido.
     * Lanza ArchivoVacioException si el archivo está vacío.
     *
     * @param nombreArchivo Nombre del archivo a verificar
     * @throws ArchivoVacioException Si está vacío.
     * @throws IOException           Si ocurre un error de entrada/salida.
     */
    public void verificarNoVacio(String nombreArchivo) throws ArchivoVacioException, IOException {
        try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo))) {
            if (lector.readLine() == null) {
                throw new ArchivoVacioException("El archivo '" + nombreArchivo + "' está vacío.");
            }
        }
    }
}