/**
 * B
 */
public class B extends A{

    public void g(){
        System.out.println("'B.g'");
        
    }
    public void h(){
        System.out.println("'B.h'");
    
    }
    public void k(){
        System.out.println("'B.k'");
        super.k();
        g();
    }
    
}