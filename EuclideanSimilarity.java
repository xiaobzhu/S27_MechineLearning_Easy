import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * this class is used to to the calculation of the EuclideanSimilarity, in this class, I build up a constructor to
 * I set up two scanner to get the user input from the keyboard
 */
public class EuclideanSimilarity {
    /**
     * this constructor is used to do the calculation, and get the user input, in the main class has a constructor to
     * run this file
     */
    private double Euclidean;
    public EuclideanSimilarity(String[] vectorA, String[] vectorB) {

        double sumsqr = 0.0;

        if (vectorA.length != vectorB.length) {
            System.out.println("The length of two array doesnt have same length");
            throw new IllegalArgumentException("The length of two array doesnt have same length");
        }

        for (int i = 0; i < vectorA.length; i++) {
            sumsqr = sumsqr + Math.pow(Double.parseDouble(vectorB[i]) - Double.parseDouble(vectorA[i]), 2);
        }
        DecimalFormat numberFormat = new DecimalFormat("#.0000");//this is set the format of the double
        String result = numberFormat.format(Math.sqrt(sumsqr));
        double total = Double.parseDouble(result);
        setEuclidean(total);

        StringBuffer result3 = new StringBuffer();
        StringBuffer result1 = new StringBuffer();
        for (int i = 0; i < vectorA.length; i++) {
            result3.append(vectorA[i]);
            result3.append(" ");
        }
        String mynewString = result3.toString();
        for (int i = 0; i < vectorB.length; i++) {
            result1.append(vectorB[i]);
            result1.append(" ");
        }
        String mynewString1 = result1.toString();

        System.out.println("Euclidean similarity of [" + mynewString + "] and [" + mynewString1 + "] = " + Euclidean);
    }

    /**
     * this method is used to get the Euclidean value
     * @return the value of the Eclidean
     */
    public double getEuclidean() {
        return Euclidean;
    }

    /**
     * this method is used to set the value of the Euclidean
     * @param Euclidean is the local varible
     */
    public void setEuclidean(double Euclidean) {
        this.Euclidean = Euclidean;
    }
}
