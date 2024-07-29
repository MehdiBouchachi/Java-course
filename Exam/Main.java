package Exam;

public class Main {
    public static void main(String[] args) {

        Rectangle myInstances[]=new Rectangle [4];

        for (int i=0; i < myInstances.length ; i++){ 

            if(i % 2 == 0){

                myInstances[i]= new Rectangle (Math.random() ,Math.random());

            }else {

                myInstances[i]= new Carré (Math.random()); 

            }
        }
        System.out.println("Les Carrés: "+Carré.getInstances().size());
        System.out.println("Les Rectangles: "+Rectangle.getInstances().size());

    }
}

