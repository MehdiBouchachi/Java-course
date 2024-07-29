package Exam;


import java.util.ArrayList;

public class Rectangle{
  
    private double longueur, largeur; 
    private static ArrayList <Rectangle> instances = new ArrayList <Rectangle>();

    public Rectangle (double lo, double la){  
        longueur = lo; 
        largeur = la;     
        instances.add(this);
    }

    public void affiche () {
        System.out.println("Rectangle la longueur : "+ longueur + " et la largueur : "+largeur );
    } 

    public static ArrayList <Rectangle> getInstances(){
        return instances; 
    }

    public double surface (){
        return longueur*largeur; 
    }

    public double getLongueur() { 
        return longueur;
    } 

    public double getLargeur() {
        return largeur; 
    }

    public void setLongueur (double lon) {
        longueur = lon; 
    } 
    public void setLargeur (double larg) {
        largeur = larg; 
    } 
}


 
