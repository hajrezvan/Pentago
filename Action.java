/**
 * This class represent status of nuts and set them in map and
 *  check that game over or not.
 * @version 0.0
 * @author Rezvanian 9831029
 * */
public class Action {

    //This field for check end of game.
    private static boolean resumeGame;

    /**
     * This constructor initialize "resumeGame" field by true value.
     * */
    public Action(){
        resumeGame = true;
    }

    /**
     * This method set nuts in map by get two variable and set them in static method in GamePlay
     * class.
     * @param x is x position in map.
     * @param y is y position in map.
     * */
    public static void setNutsInMap(int x, int y){
        GamePlay.setNutsInMap(x,y);
    }

    /**
     * This class check color of nut that user want set its in map.
     * This class by construct a object from "Players" class and
     *  call one of method that this object has.
     * */
    public static String getCharacter(){
        Players player = new Players();
        if (player.hasWhite()){
            return "W";
        }else {
            return "B";
        }
    }

    /**
     * This method checks game over or not.
     * */
    public static boolean endOfGame(){
        return resumeGame;
    }
}