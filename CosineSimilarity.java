import java.text.DecimalFormat;

/**
 * This class is used to do the Calculation for the CosineSimilarity, in this class I set up two scanner at here to get
 * the user input,after get the user input to do the calculation
 */
public class CosineSimilarity {

    /**
     * this method is used to get the value of the similarity ,it will be used in the test function
     * @return this return value is the value of the similarity
     */
    public double getSimilarity() {
        return similarity;
    }

    /**
     * this method is uesd to set the value the similarity
     * @param similarity this similarity is the similarity after the calculation in the method
     */
    public void setSimilarity(double similarity) {
        this.similarity = similarity;
    }

    /**
     * this is the constructor of the CosineSimilarity
     */
    private double similarity;
    public CosineSimilarity(String[] vectorA, String[] vectorB) {

        double bottom;
        double normA = 0.0;
        double normB = 0.0;
        double dotProduct = 0.0;
        double sumsqr = 0.0;

        if (vectorA.length != vectorB.length) {
            System.out.println("Please input two same length array");
            throw new IllegalArgumentException("Two array is not same length");
        }
        for (int i = 0; i < vectorA.length; i++) {//this part is used to do the calculation for dotproduct
            dotProduct = dotProduct + Double.parseDouble(vectorA[i]) * Double.parseDouble(vectorB[i]);
        }
        for (int i = 0; i < vectorA.length; i++) {//this part is uesd to do the normal for the vector
            normA = Math.pow(Double.parseDouble(vectorA[i]), 2) + normA;
        }
        for (int i = 0; i < vectorB.length; i++) {//this part is used to do the calculation for the dot product
            normB = Math.pow(Double.parseDouble(vectorB[i]), 2) + normB;
        }
        /**
         * In this part, Math.() is used from the math lib, used for the code can used the math calculation
         */
        bottom = Math.sqrt(normA) * Math.sqrt(normB);

        for (int i = 0; i < vectorA.length; i++) {
            sumsqr = sumsqr + Math.pow(Double.parseDouble(vectorB[i]) - Double.parseDouble(vectorA[i]), 2);
        }
        DecimalFormat numberFormat = new DecimalFormat("#.0000");
        String result = numberFormat.format(dotProduct/bottom);
        double total = Double.parseDouble(result);
        setSimilarity(total);
        /**
         * StringBuffer is used to do the transfer from string array to the string, use the append to add the char to
         * the string
         */
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
        String mynewString1 = result1.toString();//this is used to do the transfer to string format
        System.out.println("Cosine similarity of [" + mynewString + "] and [" + mynewString1 + "] = " + getSimilarity());
    }

}
