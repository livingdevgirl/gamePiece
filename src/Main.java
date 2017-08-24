public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Game!");

        GamePiece player1 = new GamePiece();
        GamePiece player2 = new GamePiece();

        System.out.println(player2.getName());

        System.out.println(player1.move(5, 7));
    }
}
