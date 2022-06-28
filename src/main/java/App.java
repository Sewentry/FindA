public class App {
    public static void main(String[] args) throws InterruptedException {
        MNK mnk = new MNK();
        CheckError chk = new CheckError();
        CreateLineByTCore clbt = new CreateLineByTCore();

        double[][] arr = {{0.5,49.232},{1,43.983},{2,40.1},{3,38.159},{4,36.836},{5,35.886},{6,35.11},{9,33.499},{15,31.457},{30,29.113},{45,27.804},{60,26.884},{90,25.604},{120,25.086},{180,23.806}};
        double[] resBK=clbt.findT1Core(arr);
        //System.out.println("y="+res[0]+"x +"+res[1]);
        System.out.println(resBK[0]+" "+resBK[1]+" "+resBK[2]+" "+resBK[3]);


    }
}
