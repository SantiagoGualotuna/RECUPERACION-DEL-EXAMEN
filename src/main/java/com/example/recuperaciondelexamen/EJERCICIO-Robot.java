package org.example.robot;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class HelloApplication {
    public static void main(String[] args) {
        int[]Robot = {10,5,-2};
        int locationx=0;
        int locationy=0;
        boolean X=false;
        boolean Y=true;

        for( int i = 0 ; i <= Robot.length-1 ; i++){
            if(i % 2 == 0){
                if(Y){
                    locationy =(locationy - Robot[i]) ;
                    Y=false;
                }else{
                    locationy =(locationy + Robot[i]) ;
                    Y=true;
                }
            }else{
                if(X){
                    locationx =(locationx - Robot[i]) ;
                    X=false;
                }else{
                    locationx =(locationx + Robot[i]) ;
                    X=true;
                }
            }
        }
        System.out.println("x:" + locationx + " y: "+ locationy +"");
    }
}
