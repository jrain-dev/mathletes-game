public class tree {

    private int height;
    private char myChar;

    public tree(int newHeight){
        myChar = 'V';
        if (height < 0){
            height = 0;
        }
        else{
            height = newHeight;
        }
    }

    public void setMyChar(char myChar) {
        this.myChar = myChar;
    }

    public double grow(double rainmm){ //works in millimeters
        if (rainmm >= 12){
            System.out.println("We are growing!");
            return height++;
        }
        else{
            return height;
        }
    }
    public void drawMe(){
        for(int i = 1; i <= height; i++){

            for(int j = 1; j <= (height - i)/2; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print(myChar);
            }
            System.out.println();
        }
    }
}
