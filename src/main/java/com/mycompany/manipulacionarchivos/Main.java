/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.manipulacionarchivos;

import java.io.IOException;

/**
 * @author USER
 * Clase main para probar el funcionamiento de manipulación de archivos y manejo de excepciones
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestorDeArchivo gestor = new GestorDeArchivo();
        ValidadorArchivo validador = new ValidadorArchivo();
        String nombreArchivo = "mi_documento.txt";
        String nombreArchivoVacio = "archivo_vacio.txt";
        String contenido = "Este es el contenido de prueba para el archivo. \nAquí hay otra línea.";

        // Primero se escribe el contenido en un archivo usando el método guardar()
        gestor.guardar(nombreArchivo, contenido);
        gestor.guardar(nombreArchivoVacio, ""); // Aquí crea un archivo vacío para la prueba

        // Segundo va a leer el contenido usando el método leer() y manejar la excepción
        try {
            String contenidoLeido = gestor.leer(nombreArchivo);
            System.out.println("\n--- Contenido leído del archivo ---");
            System.out.println(contenidoLeido);
        } catch (IOException e) {
            System.err.println("Hubo un error al leer el archivo: " + e.getMessage());
        }

        // Tercero va a verificar si el archivo no está vacío usando el método verificarNoVacio()
        System.out.println("\n--- Verificando los archivos ---");
        try {
            // Verificar el archivo que tiene contenido
            validador.verificarNoVacio(nombreArchivo);
            System.out.println("El archivo '" + nombreArchivo + "' no está vacío.");

            // Verificar el archivo vacío para probar la excepción personalizada
            validador.verificarNoVacio(nombreArchivoVacio);
            System.out.println("Este mensaje no debería aparecer."); // Esto no se ejecutará si la excepción se lanza
        } catch (ArchivoVacioException e) {
            //Excepción específica de archivo vacío
            System.err.println("Error de validación: " + e.getMessage());
        } catch (IOException e) {
            //Otras posibles excepciones de I/O
            System.err.println("Error de I/O: " + e.getMessage());
        }
    }
}