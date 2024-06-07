package com.example.ejerciciopiedrapapeltijera;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;
public class PiedraPapelTijera {
    // Método para calcular quién es el ganador
    public static String calcularGanador(String[][] partidas) {
        int player1Wins = 0;
        int player2Wins = 0;
        // Recorremos todas las partidas
        for (String[] partida : partidas) {
            String player1Move = partida[0]; // Movimiento del Jugador 1
            String player2Move = partida[1]; // Movimiento del Jugador 2

            // Comparamos los movimientos para determinar el ganador
            if (!player1Move.equals(player2Move)) {
                switch (player1Move) {
                    case "R":
                        if (player2Move.equals("S")) player1Wins++; // Piedra vence a Tijera
                        else player2Wins++; // Piedra pierde contra Papel
                        break;
                    case "P":
                        if (player2Move.equals("R")) player1Wins++; // Papel vence a Piedra
                        else player2Wins++; // Papel pierde contra Tijera
                        break;
                    case "S":
                        if (player2Move.equals("P")) player1Wins++; // Tijera vence a Papel
                        else player2Wins++; // Tijera pierde contra Piedra
                        break;
                }
            }
        }
        // Determinamos quién ganó más partidas
        if (player1Wins > player2Wins) {
            return "Player 1";
        } else if (player2Wins > player1Wins) {
            return "Player 2";
        } else {
            return "Tie";
        }
    }
    public static void main(String[] args) {
        // Definimos las partidas
        String[][] partidas1 = {
                {"R", "S"}, // Player 1 gana
                {"S", "R"}, // Player 2 gana
                {"P", "S"}  // Player 2 gana
        };
        System.out.println("Resultado: " + calcularGanador(partidas1)); // Debería imprimir "Player 2"
    }
}

