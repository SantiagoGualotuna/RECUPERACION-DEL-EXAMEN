package com.example.ejerciciorobot;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;
public class Robot {
    // Método para calcular las coordenadas finales del robot
    public static int[] calcularCoordenadas(int[] pasos) {
        // Coordenadas iniciales
        int x = 0;
        int y = 0;
        // Dirección inicial: mirando hacia arriba en el eje y
        // Direcciones: 0 = y positivo, 1 = x negativo, 2 = y negativo, 3 = x positivo
        int direccion = 0;
        // Recorremos todos los pasos
        for (int paso : pasos) {
            // Actualizamos las coordenadas según la dirección actual
            switch (direccion) {
                case 0: // y positivo
                    y += paso;
                    break;
                case 1: // x negativo
                    x -= paso;
                    break;
                case 2: // y negativo
                    y -= paso;
                    break;
                case 3: // x positivo
                    x += paso;
                    break;
            }
            // Giramos 90 grados en el sentido contrario a las agujas del reloj
            direccion = (direccion + 1) % 4;
        }
        // Devolvemos las coordenadas finales en un arreglo
        return new int[]{x, y};
    }
    public static void main(String[] args) {
        // Caso de prueba 1
        int[] pasos1 = {10, 5, -2};
        int[] coordenadas1 = calcularCoordenadas(pasos1);
        System.out.println("Coordenadas finales: (x: " + coordenadas1[0] + ", y: " + coordenadas1[1] + ")"); // Debería imprimir (x: -5, y: 12)
    }
}
