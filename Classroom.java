package challengeJava06;
public class Classroom {
    public static void main(String[] args) {
        Wilder jeanClaude = new Wilder("Jean-Claude", true);
        Wilder denis = new Wilder("Denis");

        System.out.println(jeanClaude.whoAmI());
        System.out.println(denis.whoAmI());
        System.out.println(Wilder.wilderMotto());

    }
}
