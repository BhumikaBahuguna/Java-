abstract class Shape {
    abstract void rectangleArea(double length, double breadth);
    abstract void squareArea(double side);
    abstract void circleArea(double radius);
}
class Area extends Shape {
    @Override
    void rectangleArea(double length, double breadth) {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
    @Override
    void squareArea(double side) {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }
    @Override
    void circleArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
    public static void main(String[] args) {
        Shape shape = new Area(); 
        shape.rectangleArea(5, 4);
        shape.squareArea(4);
        shape.circleArea(3);
    }
}
