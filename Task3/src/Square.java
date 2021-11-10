public class Square extends Rectangle{

    public Square(){
        width = 1;
        length = 1;
        color = "Black";
        filled = true;
    }

    public Square(double side){
        this.width = side;
        this.length = side;
        color = "Black";
        filled = true;
    }

    public Square(double side, String color, boolean filled){
        this.width = side;
        this.length = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide(){
        return width;
    }

    public void setSide(double side){
        this.width = side;
        this.length = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }

    public void setLength(double side){
        this.width = side;
        this.length = side;
    }

    public String toString() {
        return "Square{" +
                "side: " + width +
                ", color: '" + color + '\'' +
                ", filled: " + filled +
                '}';
    }
}
