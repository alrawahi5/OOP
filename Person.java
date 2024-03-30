public class Person {

    private String name;
    private Integer age;

    public Person(){
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public static void main(String [] args){
       Person person = new Person();
       person.age = 24;
       person.name = "Asad";
        System.out.println(person.getAge());
        System.out.println(person.getName());

    }

}
