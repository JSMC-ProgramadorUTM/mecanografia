/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Pangramas {

    private final ArrayList<String> pangramas;

    public Pangramas() {
        this.pangramas = new ArrayList<>();
        cargarPangramas();
    }

    private void cargarPangramas() {
        try (BufferedReader reader = new BufferedReader(new FileReader("pangramas.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                pangramas.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public void listar() {
        // Imprimir los pangramas leídos
        for (String pangrama : pangramas) {
            System.out.println(pangrama);
        }
    }

    public ArrayList<String> getPangramas() {
        return pangramas;
    }

}
