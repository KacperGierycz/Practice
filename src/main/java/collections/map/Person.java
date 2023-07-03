package collections.map;

public class Person {

    private String name;
    private String city;
    private String state;

    Person(String name, String city){
        this.name = name;
        this.city = city;
    }

    Person(String name, String city, String state){
        this.name = name;
        this.city = city;
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }
    public String getState(){
        return state;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
