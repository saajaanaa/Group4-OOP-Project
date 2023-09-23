package JavaOopsProject;
/**Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimeter. Create 2 classes
        Circle & Square that implements functionality defined in the Shape Interface. Test your code.*/
public interface Shape {

    double calculateArea();
    double calculatePerimeter();

}

class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double area=3.14 *radius*radius;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter=2*3.14*radius;
        return perimeter;
    }
}

class Square implements Shape {
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        double area = side * side;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 4 * side;
        return perimeter;
    }


    public static void main(String[] args) {
        Circle circle= new Circle(10.0);
        System.out.println("Circle area is "+ circle.calculateArea());
        System.out.println("Circle perimeter is "+circle.calculatePerimeter());

        Square square= new Square(20.0);
        System.out.println("Square area: "+ square.calculateArea());
        System.out.println("Square perimeter: "+square.calculatePerimeter());

    }

}

