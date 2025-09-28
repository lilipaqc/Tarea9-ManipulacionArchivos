/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.manipulacionarchivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author USER
 * Clase para la manipulación de archivos con métodos para guardar y leer contenido de archivos de texto
 */
public class GestorDeArchivo {

    /**
     * Escribe un contenido en un archivo de texto.
     *
     * @param nombreArchivo Nombre del archivo donde se escribirá
     * @param contenido     Contenido a guardar en el archivo.
     */
    public void guardar(String nombreArchivo, String contenido) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivo))) {
            escritor.write(contenido);
            System.out.println("El contenido se ha guardado exitosamente en " + nombreArchivo);
        } catch (IOException e) {
            System.err.println("Hubo un error al guardar el archivo: " + e.getMessage());
        }
    }

    /**
     * Aquí se lee el contenido de un archivo de texto línea por línea y lo devuelve.
     *
     * @param nombreArchivo El nombre del archivo a leer.
     * @return El contenido del archivo como un String.
     * @throws IOException Si ocurre un error al leer el archivo
     */
    public String leer(String nombreArchivo) throws IOException {
        StringBuilder contenido = new StringBuilder();
        try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                contenido.append(linea).append("\n");
            }
        }
        return contenido.toString();
    }
}