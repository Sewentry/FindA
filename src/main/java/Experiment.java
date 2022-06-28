public class Experiment {
    double[][] experimentValue = {{0.5,49.232},{1,43.983},{2,40.1},{3,38.159},{4,36.836},{5,35.886},{6,35.11},{9,33.499},{15,31.457},{30,29.113},{45,27.804},{60,26.884},{90,25.604},{120,25.086},{180,23.806}};

    MNK mnk = new MNK();
    double[] experimentLine = mnk.method(experimentValue);
    double errorExperimentValue = mnk.checkError(experimentValue,experimentLine);

    public double[][] getExperimentValue() {
        return experimentValue;
    }

    public double[] getExperimentLine() {
        return experimentLine;
    }

    public double getErrorExperimentValue() {
        return errorExperimentValue;
    }
}
