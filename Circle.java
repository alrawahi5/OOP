import java.lang.*;
public class Circle {

    private Double radius;
    private String color;

    public Circle(){}

    public Double circleAreaa(Double radius){
        return 3.14 * Math.sqrt(radius);
    }

    public Double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public static void main(String [] args ){
        Circle circle = new Circle();
        circle.radius = 3.14;
        circle.color = "Black";

        System.out.println("the provided radius is: " + circle.radius +  ", and that gives us the area: " + circle.circleAreaa(circle.radius));
    }



}
