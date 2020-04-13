import java.util.Scanner;

/**
 * This is main class and game from hear.
 * This class have "main" method that start any thing in program from hear.
 * this class control the game map and represent status of map.
 */
public class GamePlay {

    //constant variable, size of map
    private static final int SIZE = 7;

    //for developer
    private static String[][] map;

    //for user
    private static String[][] visualMap;

    //for counter step of game
    private static int steps;

    /**
     * This method initialise the map.
     */
    public static void initialisingMap(){
        steps = 0;
        //for programmer
        map = new String[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                if (i == 3){
                    map[i][j] = "-";
                }
                if (j == 3){
                    map[i][j] = "|";
                }
                else{
                    map[i][j] = "0";
                }
            }
        }
    }

    /**
     * This method initialise the visualMap.
     */
    public static void initialisingVisualMap(){
        visualMap = new String[4 * SIZE][8 * SIZE];
        for (int i = 0; i < 4 * SIZE; i++){
            for (int j = 0; j < 8 * SIZE ; j++){
                if (i == 0){
                    visualMap[i][j] = " ";
                }else if (j == 0){
                    visualMap[i][j] = " ";
                }else if (i == 14){
                    visualMap[i][j] = "-";
                }else if (j == 28){
                    visualMap[i][j] = "|";
                } else if (i % 4 == 0 && j % 8 == 0) {
                    visualMap[i][j] = "0";
                } else {
                    visualMap[i][j] = " ";
                }
            }
        }
    }

    /**
     * This method print map for players.
     */
    public static void printVisualMap(){
        for (int i = 0; i < 4 * 7; i++){
            for (int j = 0; j < 8 * 7; j++){
                System.out.printf("%S",visualMap[i][j]);
            }
            System.out.print("\n");
        }
    }

    public static int getSteps() {
        return steps;
    }

    public static void setSteps() {
        GamePlay.steps++;
    }

    public static void setNutsInMap(int x, int y){
        map[y][x] = Action.getCharacter();
        visualMap[(y + 1) * 4][(x + 1) * 8] = map[y][x];
        setSteps();
    }

    /*--------------------------------------------------------------------------------------------------*/
    /**
     * This is main method and game start from hear.
     */
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome players!");
        Thread.sleep(500);
        System.out.println("The game is starting now!!");
        Thread.sleep(500);

        initialisingMap();
        initialisingVisualMap();
        printVisualMap();

        //Start game
        Scanner reader = new Scanner(System.in);
        do {
        System.out.println("Insert your nuts in map");
        String input = reader.nextLine().trim();
        String[] arrayInput = input.split(" ");
        int xPosition = Integer.parseInt(arrayInput[1]);
        int yPosition = Integer.parseInt(arrayInput[0]);
            Action.setNutsInMap(xPosition, yPosition);
            printVisualMap();
            Thread.sleep(100);
        }while (Action.endOfGame());
    }
    /*--------------------------------------------------------------------------------------------------*/
}