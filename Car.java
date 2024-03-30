public class Car {

    private String make;
    private String modle;
    private String year;

    public Car(){

    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModle(String modle) {
        this.modle = modle;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModle() {
        return modle;
    }

    public String getYear() {
        return year;
    }


    public static void main(String[] args) {
        Car car = new Car();
        car.make = "OmaniCars";
        car.modle = "2024";
        car.year = "1998";

        System.out.println("Make is: " + car.getMake() + "  " + " Mpdle is: " + car.getModle() + "  " + " Year is: "+ car.getYear());
    }


}



