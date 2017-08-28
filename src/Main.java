import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Game!");

        GamePiece one = new GamePiece();

        one.setColor("green");

        one.setName("one");

        System.out.println(one.getName());
        System.out.println(one.getColor());

        GamePiece two = new GamePiece();

        two.freeze();

        two.unfreeze();

        two.move(5,6);

    }
}
