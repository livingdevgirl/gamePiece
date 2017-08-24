
import java.util.Random;

public class GamePiece {

    //set the grid min and max
    private int minX = 0;
    private int maxX = 100;
    private int minY = 0;
    private int maxY = 500;

    //set getters

    public int getMaxX() {
        return maxX;
    }

    public int getMinX() {
        return minX;
    }


    public int getMaxY() {
        return maxY;
    }

    public int getMinY() {
        return minY;
    }


    // WANTED TO DO THIS: places the character at the (50,250) location to start on the grid (center) as default
    private int initialX;
    private int initialY;


    //frozen boolean
    public boolean frozen;


    //a few strings to pass through
    private String name;
    private String position;

    //add an empty constructor

    public GamePiece(){
        this.initialX = 0;
        this.initialY = 0;
        this.frozen = true;
    }

    //get the name and color strings
    public String getName() {
        return name;
    }


    //make public move that accepts values

    public void move(int newX, int newY){
        this.newX = this.initialX + 2;
        this.newY = this.initialY + 2;

    }
    private int newX;
    private int newY;

    public void move(){

    }

}
