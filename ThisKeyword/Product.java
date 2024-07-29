package ThisKeyword;

public class Product {
    public void products(){
        System.out.println("Products : PC \n Iphone");
    }

    public void allProducts(){
        this.products();
    }

    public void AllProducts(){
        products();
    }
}
