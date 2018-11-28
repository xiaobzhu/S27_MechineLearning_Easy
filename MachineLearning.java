import java.util.Scanner;

/**
 * this is the main class of the project, in this class, it has three constructor for the CosineSimilarity, Hamming Distance
 * and EuclideanSimilarity. in the main file to run this constructor to get the user input and give the user out put
 * on the constructor
 */
public class MachineLearning {
    public static void main(String args[]) {
        System.out.println("CosineSimilarity");
        Scanner scan1 = new Scanner(System.in);//the system.in is used to get the user input from controller

        System.out.println("Please input doubles for array A");
        String input = scan1.nextLine();
        String[] vectorA = input.split(" ");

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Please input doubles for array B");
        String input1 = scan2.nextLine();
        String[] vectorB = input1.split(" ");
        new CosineSimilarity(vectorA, vectorB);

        System.out.println("Hanmming Distance");
        System.out.println("Please input String");
        Scanner scan3 = new Scanner(System.in);//use the scanner to get the user input from the keyboard
        String a = scan3.nextLine();
        System.out.println("Please input another String");
        Scanner scan4 = new Scanner(System.in);
        String b = scan4.nextLine();
        new Distance(a, b);
        System.out.println("EuclideanSimilarity");


        Scanner scan5 = new Scanner(System.in);
        System.out.println("Please input doubles for array A");
        String input2 = scan5.nextLine();
        String[] vectorC = input2.split(" ");
        Scanner scan6 = new Scanner(System.in);
        System.out.println("Please input doubles for array B");
        String input3 = scan6.nextLine();
        String[] vectorD = input3.split(" ");
        new EuclideanSimilarity(vectorC, vectorD);
    }
}
