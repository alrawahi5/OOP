public class PersonDetails {

    private String firstName;
    private String lastName;

    public PersonDetails(){}

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String comcatinateNames(String firstName, String lastName){
        return "The concatinated names are: " + firstName + "  " +lastName;
    }

    public static void main(String [] args ){
        PersonDetails personDetails = new PersonDetails();
        personDetails.firstName = "Abdullah";
        personDetails.lastName = "Al-rawahi";

        System.out.println(personDetails.comcatinateNames(personDetails.getFirstName(), personDetails.getLastName()));
    }
}
