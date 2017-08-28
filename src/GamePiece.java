
import java.util.Random;

public class GamePiece {

//    //set the grid min and max
//    private int minX = 0;
//    private int maxX = 100;
//    private int minY = 0;
//    private int maxY = 500;



    //set the following required instance variables
    private int positionX;
    private int positionY;
    public boolean frozen;


    //a few strings to pass through
    private String name;
    private String color;

    //add an empty constructor

    public GamePiece(){
        this.positionX = 0;
        this.positionY = 0;
        this.frozen = false;
    }

    //get the name and color strings


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //add behavior

    public void move(int newX, int newY){
         if (this.frozen == false){
             this.positionX = newX;
             this.positionY = newY;
        }
        System.out.println("moved to " + newX + "," + newY);
    }


    public void freeze(){

        if (this.frozen == false){
            this.frozen = true;
        }
        System.out.println("is this piece frozen? " + this.frozen);
    }

    public void unfreeze(){
        if (this.frozen == true) {
            this.frozen = false;
        }
        System.out.println("is this piece frozen? " + this.frozen);
    }
}
