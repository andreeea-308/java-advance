package Exercise8;
/**
Create a class called User with following fields: uniqueId, email, password, CNP, street, phone. Street data will be wrapped in a class.
* A task come to our team and says that we need to sent some data of an User object to a third party application.
This class contains sensitive data that should not be send (ex. password, uniqueId) and also street should
be sent as a String, and not as a object.
* Our duty is to map this class to another class, ex. UserDto - that will act as a Data Transfer Object.
* Create class UserDto with necessary fields. Next, create in User class a method called toUserDto()
that maps a User to UserDto and return the result (UserDto).
 */
public class User {
    private int uniqueID;
    private String email;
    private String password;
    private long CNP;
    private Street street;
    private int phone;

    public User(int uniqueID, String email, String password, long CNP, Street street, int phone) {
        this.uniqueID = uniqueID;
        this.email = email;
        this.password = password;
        this.CNP = CNP;
        this.street = street;
        this.phone = phone;
    }
    public UserDto toUserDto(){
        return new UserDto(this.email, this.street.streetAsString(), this.CNP, this.phone);
    }

}
