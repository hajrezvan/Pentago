public class Action {

    private static boolean resumeGame;

    public static int steps;

    public Action(){
        steps = 0;
        resumeGame = true;
    }

    public static void setNutsInMap(int x, int y){
        GamePlay.setNutsInMap(x,y);
    }

    public static String getCharacter(){
        Players player = new Players();
        if (player.hasWhite()){
            return "W";
        }else {
            return "B";
        }
    }

    public static boolean endOfGame(){
        return resumeGame;
    }
}