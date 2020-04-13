/**
 * This class represent color of nuts.
 * @version 0.0
 * @author Rezvanian 9831029
 * */
public class Players{

    private boolean color; //If is true; color is white.

    /**
     * This constructor initialize the color of nuts by steps of game.
     * */
    public Players() {
        int colorKey; //If is 0; color is black.

        if (GamePlay.getSteps() % 2 == 0){
            colorKey = 1;
        }else {
            colorKey = 0;
        }
        color = colorKey != 0;
    }

    /**
     * This method return color of nuts.
     * */
    public boolean hasWhite(){
        return color;
    }
}