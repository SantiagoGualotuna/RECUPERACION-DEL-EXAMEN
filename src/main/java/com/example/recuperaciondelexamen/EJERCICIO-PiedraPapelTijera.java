package com.example.ejerciciopiedrapapeltijera;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;
public class PiedraPapelTijera {
    public static String calcularGanador(String[][] partidas) {
        int player1Wins = 0;
        int player2Wins = 0;
    
        for (String[] partida : partidas) {
            String player1Move = partida[0]; 
            String player2Move = partida[1];

            if (!player1Move.equals(player2Move)) {
                switch (player1Move) {
                    case "R":
                        if (player2Move.equals("S")) player1Wins++;
                        else player2Wins++; 
                        break;
                    case "P":
                        if (player2Move.equals("R")) player1Wins++; 
                        else player2Wins++;
                        break;
                    case "S":
                        if (player2Move.equals("P")) player1Wins++; 
                        else player2Wins++;
                        break;
                }
            }
        }
     
        if (player1Wins > player2Wins) {
            return "Player 1";
        } else if (player2Wins > player1Wins) {
            return "Player 2";
        } else {
            return "Tie";
        }
    }
    public static void main(String[] args) {
        
        String[][] partidas1 = {
                {"R", "S"}, 
                {"S", "R"}, 
                {"P", "S"}  
        };
        System.out.println("Resultado: " + calcularGanador(partidas1)); 
    }
}

