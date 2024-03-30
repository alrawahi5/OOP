public class Rectangle {

    private Integer lenght;
    private Integer width;

    public Rectangle(){
    }

    public Integer getLenght() {
        return lenght;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public void setLenght(Integer lenght) {
        this.lenght = lenght;
    }

    public static Integer calculateTheArea(Integer lenght, Integer width){
        Integer Area = lenght*width;
        return Area;
    }
    public static void main(String [] args){
        Rectangle rectangle = new Rectangle();
        System.out.println("The area of the rec is: " + calculateTheArea(3, 4));
        System.out.println();
        rectangle.lenght = 9;
        rectangle.width = 7;
        System.out.println("With the constructor: " + '\n' + "The area of the rec is: " +  calculateTheArea(rectangle.lenght, rectangle.width));

    }
}
