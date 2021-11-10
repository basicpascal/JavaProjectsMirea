public class Circle extends Shape {
    protected double radius;

    public Circle(){
        radius = 1.0;
        color = "Black";
        filled = true;
    }

    public Circle(double radius) {
        this.radius = radius;
        color = "Black";
        filled = true;
    }

    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }

    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius: " + radius +
                ", color: '" + color + '\'' +
                ", filled: " + filled +
                '}';
    }
}
