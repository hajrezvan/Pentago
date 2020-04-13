public class Players extends Action {

    private boolean color; //If is true; color is white.

    public Players() {
        int colorKey; //If is 0; color is black.

        if (steps % 2 == 0){
            colorKey = 1;
        }else {
            colorKey = 0;
        }
        color = colorKey != 0;
    }

    public boolean hasWhite(){
        return color;
    }
}