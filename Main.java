class Base{
    int n;
    Base(){
    }
    Base(int n){
        this.n =n;
    }
}
class Square extends Base{
    Square(int n){
        super(n);
    }
    public void square(){
        System.out.println("Square: "+n*n);
    }
}
class Cube extends Base{
    Cube(int n){
        super(n);
    }
    public void cube(){
        System.out.println("Cube: "+n*n*n);
    }
}
public class Main {
    public static void main(String[] args) {
        Square s =  new Square(10);
        Cube c = new Cube(20);
        s.square();
        c.cube();
    }
}
