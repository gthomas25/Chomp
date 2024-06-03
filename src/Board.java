public class Board {
    public int moveRow;
    public int moveCollum;
    public int lifeordeath;
  //  public int number;
int collum1;
int collum2;
int collum3;
    public Board(int prow,int pcollum, int plifeordeath, int pnumber,int pcollum1,int pcollum2, int pcollum3){
        moveCollum=pcollum;
        lifeordeath=plifeordeath;
       // number=pnumber;
        moveRow=prow;
        collum1=pcollum1;
        collum2=pcollum2;
        collum3=pcollum3;


    }
    public void printinfo(){System.out.println("This board results in this board");

}

}