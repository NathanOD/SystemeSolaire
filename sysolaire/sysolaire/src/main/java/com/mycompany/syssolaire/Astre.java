/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.syssolaire;

import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;

/**
 *
 * @author Thoma
 */
public class Astre {
    /**
     * Diametre de l'astre ramené à l'échelle de la scene (en pixels)
     */
    private double rayon;
    /**
     * Couleur de l'astre
     */
    private Color couleur;
    /**
     * Periode de revolution
     */
    private double prevolution;

    /**
     * Constructeur
     * @param diametre
     * @param couleur
     * @param prevolution 
     */
    public Astre(double rayon, Color couleur, double prevolution) {
        this.rayon = rayon;
        this.couleur = couleur;
        this.prevolution = prevolution;
    }

    /**
     * Getter diametre
     * @return 
     */
    public double getRayon() {
        return rayon;
    }

    /**
     * Getter couleur
     * @return 
     */
    public Color getCouleur() {
        return couleur;
    }

    /**
     * Getter periode revolution
     * @return 
     */
    public double getPrevolution() {
        return prevolution;
    }
    
    public void representation (){
        Circle r = new Circle();
        r.setCenterX(740);
        r.setCenterY(390);
        r.setRadius(this.getRayon());
        r.setFill(this.getCouleur());
        //Creation de son label
        Label t = new Label("Soleil");
        t.setLayoutX(5);
        t.setLayoutY(5);
        t.setFont(Font.font("Calibri", 15.));
        t.setTextFill(this.getCouleur());
    }
    
}