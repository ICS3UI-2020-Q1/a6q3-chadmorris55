import java.util.Scanner;
/**
 * have user input 10 numbers, finds the largest one
 * @Chad 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates Scanner for user input
    Scanner input = new Scanner(System.in);
    //creates the 10 element array 
    int [] numbers = new int [10];
    //asks user to input 10 numbers and records them
    System.out.println("Please enter in 10 integers to put into the array");
    for (int i = 0; i < numbers.length; i++){
      numbers[i] = input.nextInt();
    }
    int largest = numbers[0];
    for (int j = 1; j < numbers.length; j++){
      if (largest < numbers[j]){
        largest = numbers [j];
      }
    }
    System.out.println("The largest number is " + largest);
  }
}
