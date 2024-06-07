package com.example.ejercicio_2_ppt;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;
public class HelloApplication  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int Player1 = 0;
        int Player2 = 0;
        System.out.println("Welcome to the game");
        System.out.println("Enter 'r' for rock, 'p' for paper or 's' for scissors.");
        System.out.println("Enter 'end' to finish the game");

        while (true) {
            System.out.print("Player 1: ");
            String jugada1 = scanner.nextLine();

            if (jugada1.equals("end")) {
                break;
            }

            System.out.print("Player 2: ");
            String jugada2 = scanner.nextLine();

            if (jugada2.equals("end")) {
                break;
            }

            if (jugada1.equals(jugada2)) {
                System.out.println("tie!");
            } else if ((jugada1.equals("r") && jugada2.equals("s")) ||
                    (jugada1.equals("p") && jugada2.equals("r")) ||
                    (jugada1.equals("s") && jugada2.equals("p"))) {
                System.out.println("Player 1 won!");
                Player1++;
            } else {
                System.out.println("Player 2 won!");
                Player2++;
            }
        }

        System.out.println("Player 1 won " + Player1 + " partidas.");
        System.out.println("Player 2 won " + Player2 + " partidas.");

        if (Player1 > Player2) {
            System.out.println("¡Player 1 won the game!");
        } else if (Player1 < Player2) {
            System.out.println("¡Player 2 won the game!");
        } else {
            System.out.println("¡player 1 and player 2 tied!");
        }

        scanner.close();
    }
}
