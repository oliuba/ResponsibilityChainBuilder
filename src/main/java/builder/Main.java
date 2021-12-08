package builder;

public class Main {
    public static void main(String[] args) {
        User user = User.builder().firstName("Olha").age(18).lastName("Liuba").occupation("UCU").occupation("Singing").build();
        System.out.println(user);
    }
}
