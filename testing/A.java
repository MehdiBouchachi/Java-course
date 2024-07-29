class A {
    public void f(){
        System.out.println("'A.f'");
        k();
    }
    public void g(){
        System.out.println("'A.g'");
        
    }
    public void h(){
        System.out.println("'A.h'");
    
    }
    public void k(){
        System.out.println("'A.k'");
        h();
    }

}