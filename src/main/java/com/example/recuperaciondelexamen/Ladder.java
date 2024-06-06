package com.example.recuperaciondelexamen;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

public class Ladder {
    public static void dibujarLadder(int n) {
        if (n == 0) {
            System.out.println("__");
        } else if (n > 0) {
            // ascending ladder
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print("  ");
                }
                System.out.println(" _");
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print("  ");
                }
                System.out.println("|");
            }
        } else {
            // descending ladder
            for (int i = 0; i < -n; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("  ");
                }
                System.out.println("|");
                for (int j = 0; j < i; j++) {
                    System.out.print("  ");
                }
                System.out.println(" _");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of steps: ");
        int n = scanner.nextInt();
        dibujarLadder(n);
    }
}
