package Exam;
import java.util.ArrayList;


public class Carré extends Rectangle {

    public Carré (double cote) {
        super(cote, cote);
    }
 
    public void affiche () {
        System.out.println(" Carré la longueur du cote: "+ getLargeur () ); 
    } 

    public static ArrayList <Rectangle> getInstances(){

        ArrayList <Rectangle> instancesCarre =new ArrayList <Rectangle>();
        
        ArrayList <Rectangle> instances = Rectangle.getInstances(); 

        for (int i=0;i<instances.size();i++){

            if(instances.get(i) instanceof Carré){

                instancesCarre.add(instances.get(i));

            } 
        }
        return instancesCarre;
    }

}
