package Exercise8;

public class Main {
    public static void main(String[] args) {
        Street street = new Street(23,"Pacurari","Iasi","Romania");
        User user = new User(2,"java@gmail.com","2143ks",672153721,street,07747323);
        UserDto userDto = user.toUserDto();
        System.out.println(userDto);

    }


}
