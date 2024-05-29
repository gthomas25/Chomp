import java.awt.*;

public class MyPlayer {
    public Chip[][] gameBoard;
    public int[] columns;

    public MyPlayer() {
        columns = new int[10];
        System.out.println("hi");


        /***
         * This code will run just once, when the game opens.
         * Add your code here.
         */

for (int a=1;a<=3;a++){
            for (int b=0;b<=3;b++){
                for (int c=0;c<=3;c++){
                    if (c<=b && b <= a){
                        System.out.println(a+","+b+","+c);
                        System.out.println("resulting boards: ");
                        for (int z=c-1;z>=0;z--){
                            System.out.println("("+a+", "+b+", "+z+")");
                        }
                        for (int y=b-1;y>=b;y--){

                            //System.out.println(+a+", "+y+", "+c +")");

                        }
                        for (int q=1;q<a;q++){

                            System.out.println("("+q+", "+b+", "+c+")");

                        }


                    }
                }
            }
        }
    }

    public Point move(Chip[][] pBoard) {

        System.out.println("MyPlayer Move");

        gameBoard = pBoard;
        int column = 0;
        int row = 0;

        row = 1;
        column = 1;

        /***
         * This code will run each time the "MyPlayer" button is pressed.
         * Add your code to return the row and the column of the chip you want to take.
         * You'll be returning a data type called Point which consists of two integers.
         */

        Point myMove = new Point(row, column);
        return myMove;
    }

}
