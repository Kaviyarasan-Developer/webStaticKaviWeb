package ui;

public class Circle extends Shap {
    
    // public abstract double area();
   

    @Override
    public double area() {
        
    return 0  ;  
    }

    public double length(){

        return 0;
    }
    

    public void displayShap(){
        System.out.println("Shape is circle");
    }

}


class Main {
    

    public static void main(String[] args) {
        

        Circle cir = new Circle();

        cir.area();

        cir.displayShap();
    }
}