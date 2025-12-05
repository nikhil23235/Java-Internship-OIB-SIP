import java.util.Random;
import java.util.Scanner;

class Game{
  public int number;
  public int inputNumber;
  public int noOfguesses;

  public int getNoofguesses(){
    return noOfguesses;
  }

  public void setNoofguesses(int noOfguesses){
    this.noOfguesses = noOfguesses;
  }

  Game(){
    Random rand = new Random();
    this.number= rand.nextInt(100);
  }

  void takeuserinput(){
    System.out.println("Guess The Number:");
    Scanner sc = new Scanner(System.in);
    inputNumber = sc.nextInt();
  }

  boolean isCorrectNumber(){
    if (inputNumber==number) {
        System.out.println("Yes you guessed the right Number!! ");
        return true;
    }
    else if(inputNumber<number){
        System.out.println("Too Low...");
    }
    else if (inputNumber>number) {
        System.out.println("Too High...");
    }
     return false;
  }

}


public class NGG {

    public static void main(String[] args) {
        
    Game g = new Game();
    boolean b = false;
    while (!b) {
        g.takeuserinput();
        b=g.isCorrectNumber();
    }
 }
}