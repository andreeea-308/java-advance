package Exercise8;

public class Street {
    private int number;
    private String name;
    private String city;
    private String country;

    public Street(int number, String name, String city, String country) {
        this.number = number;
        this.name = name;
        this.city = city;
        this.country = country;
    }

    public String streetAsString(){
        return this.number + " " +  this.name + " " + this.city + " " + this.country;
    }

}
