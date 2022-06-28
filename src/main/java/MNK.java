public class MNK {
    public double[] method(double[][] arrayValue) {
        double[] result = new double[2];
        result[0]=(arrayValue.length*findMultiplicationXY(arrayValue)-findSumXValue(arrayValue)*findSumYValue(arrayValue))/(arrayValue.length*findSquareXValue(arrayValue)-findSumXValue(arrayValue)*findSumXValue(arrayValue));
        result[1]=(findSumYValue(arrayValue)-result[0]*findSumXValue(arrayValue))/arrayValue.length;
        return result;
    }
    public double findMultiplicationXY(double[][] arrayValue){
        double sum = 0;
            for(int i=0; i<arrayValue.length; i++){
                sum+=arrayValue[i][0]*arrayValue[i][1];
            }
            return sum;
    }
    public double findSumXValue(double[][] arrayValue){
        double sum=0;
        for (int i=0; i<arrayValue.length;i++){
            sum+=arrayValue[i][0];
        }
        return sum;
    }
    public double findSumYValue(double[][] arrayValue){
        double sum=0;
        for (int i=0; i<arrayValue.length;i++){
            sum+=arrayValue[i][1];
        }
        return sum;
    }
    public double findSquareXValue(double[][] arrayValue){
        double sum=0;
        for(int i=0; i<arrayValue.length;i++){
            sum+=arrayValue[i][0]*arrayValue[i][0];
        }
        return sum;
    }
    public double checkError(double[][] arrayValue, double[] coefficientMNK){
        double result=0.0;
        for (int i=0;i<arrayValue.length;i++){
                result+=Math.pow(arrayValue[i][1]-coefficientMNK[0]*arrayValue[i][0]-coefficientMNK[1],2);
            }
        return result;
    }
}
