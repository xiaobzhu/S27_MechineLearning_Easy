import java.util.Scanner;

/**
 * this class is used to do the calcualtion for the hamming distance, In this class, it has a constructor that can be called
 * in the main fucntion, I created two scannner in this file, used to get the user input, and I use many for loop to do
 * the check to make sure that user input two same length string, and make sure that user only input the 1 or 0
 */
public class Distance {
    /**
     * this is the constructor used to do the hamming distance calculate, in this part, the scanner to get the user input
     * and do the output,and in the main function, build a constructor of this one can get the output
     */
    private int distance;
    public Distance(String a, String b) {

        for (int j = 0; j < a.length(); j++) {//to do the check on does the input is digit or not
            if (!Character.isDigit(a.charAt(j))) {
                throw new IllegalArgumentException("please input binary number1");
            }
        }
        for (int l = 0; l < a.length(); l++) {
            if (a.charAt(l) != '0' && a.charAt(l) != '1') {
                throw new IllegalArgumentException("Please input binary number2");
            }


        }
        for (int m = 0; m < b.length(); m++) {//use this to do the check does the user input a 0 or 1
            if (b.charAt(m) != '0' && b.charAt(m) != '1') {
                throw new IllegalArgumentException("Please input binary number3");
            }
        }
        for (int k = 0; k < b.length(); k++) {
            if (!Character.isDigit(b.charAt(k))) {
                throw new IllegalArgumentException("please input binary number");
            }
        }
        if (a.length() != b.length()) {//check the two string is same length or not
            distance = -1;
            System.out.println("Please input two same length strings");
        } else {
            distance = 0;
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    distance++;
                }
            }
        }
        System.out.println("The Hamming distance between " +a +" and "+ b +" is " + distance);
    }

    /**
     * this method is uesd to return the value of the private variable directly
     * @return the value of the Distance
     */
    public int getDistance() {
        return distance;
    }

    /**
     * this method is used to set the value of the private variable
     * @param distance this distance is the local variable
     */
    public void setDistance(int distance) {
        this.distance = distance;
    }
}
