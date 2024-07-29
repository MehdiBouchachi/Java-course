package array;

public class Main {   
    public static void main(String[] args){

    int[] T = new int[] {1,2,3,4};
    int x = 5;
    int y = 6;

    Mehdi mehdi = new Mehdi();

    System.out.println("Before change :"+ T[0]+" , "+x+", "+y);

    mehdi.changeValues(T, x, y);
    System.out.println("After change :"+ T[0]+" , "+x+", "+y);

    }
}