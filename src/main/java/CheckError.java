import java.io.*;
import java.util.ArrayList;

public class CheckError {
    private double[][] t1ValueK01 ={{17.57,17.52,17.49,17.47,17.46,17.45,17.45},{19.06,18.93,18.86,18.82,18.8,18.78,18.76},{20.62,20.34,20.20,20.11,20.05,20.01,19.98},{21.56,21.14,20.92,20.78,20.69,20.63,20.57},{22.22,21.66,21.37,21.19,21.06,20.98,20.91},{22.73,22.03,21.67,21.45,21.30,21.19,21.10},{23.13,22.31,21.88,21.62,21.44,21.31,21.22},{23.98,22.82,22.22,21.86,21.62,21.45,21.33},{24.88,23,21,22.39,21.94,21.66,21.47,21.34},{25.70,23.31,22.39,21.94,21.66,21.47,21.34},{25.87,23.31,22.39,21.94,21.66,21.47,21.34},{25.88,23.31,22.39,21.94,21.66,21.47,21.34},{25.9,23.31,22.39,21.94,21.66,21.47,21.34},{25.90,23.31,22.39,21.94,21.66,21.47,21.34},{25.90,23.31,22.39,21.94,21.66,21.47,21.34}};
    private double[][] t1ValueK001 ={{133.5,133.4,133.4,133.4,133.4,133.4,133.4},{144.6,144.5,144.5,144.4,144.4,144.4,144.4},{156.8,156.6,156.5,156.4,156.4,156.3,156.3},{164.5,164.2,164,163.9,163.8,163.8,163.7},{170.2,169.7,169.5,169.3,169.3,169.3,169.2,169.1},{174.8,174.1,173.8,173.6,173.5,173.4,173.3},{178.6,177.8,177.4,177.1,177,176.9,176.8},{187.3,186,185.4,185,184.8,184.6,184.4},{187.3,186,185.4,185,184.8,184.6,184.4},{198.6,196.5,195.4,194.7,194.3,193.9,193.7},{214.7,210.3,208.1,206.7,205.8,205.1,204.6},{223.1,217.5,214.2,212.1,210.7,209.7,208.9},{230.3,222,217.6,215,213.2,211.9,210.9},{238.9,227.2,221.2,217.6,215.2,213.5,212.2},{244.3,229.7,222.4,218.2,215.4,213.5,212.2},{250.7,231.6,222.8,218.2,215.4,213.5,212.2}};
    private double[][] t1ValueK0001 ={{}};
    private double[][] t1ValueK00001 ={{}};
    private double error = 10000000;
    private double corrNormal=1.01;
    private double[] result = new double[3];
    private ArrayList<Double> xi = new ArrayList<>();

    public  double[] errorEstimate(double[] optimizeLine, double[][] arrayValue)  {

            for (int i = 0; i < t1ValueK01[0].length; i++) {
//                sigmaT=kx+sigma0 - уравнение прямой через угловой к-ф
                double sumOptimalLine = 0.0;
                double sum = 0.0;
                double corrPr =0.0;
                double k = (arrayValue[0][1] - arrayValue[arrayValue.length - 1][1]) / (t1ValueK01[0][i] - t1ValueK01[t1ValueK01.length - 1][i]);
                double sigma0 = (arrayValue[0][1]-k*t1ValueK01[0][i]);
                for (int j = 0; j < arrayValue.length; j++) {
                    sum+=Math.pow(arrayValue[j][1] - (sigma0 - k * t1ValueK01[j][i]), 2);
                    //sumOptimalLine += Math.pow(arrayValue[j][1] - (optimizeLine[1] + optimizeLine[0] * arrayValue[j][i]), 2);
                }

                if (sum < error) {
                    error=sum;
                    result[0] = i;
                    result[1] = 1;
                    result[2]=sum;
                }
            }
        for (int i = 0; i < t1ValueK001[0].length; i++) {
//                sigmaT=kx+sigma0 - уравнение прямой через угловой к-ф
            double sumOptimalLine = 0.0;
            double sum=0.0;
            double k = (arrayValue[0][1] - arrayValue[arrayValue.length - 1][1]) / (t1ValueK001[0][i] - t1ValueK001[t1ValueK001.length - 1][i]);
            double sigma0=(arrayValue[0][1]-k*t1ValueK001[0][i]);
            for (int j = 0; j < arrayValue.length; j++) {
                sum+=Math.pow(arrayValue[j][1] - sigma0 - k * t1ValueK001[j][i], 2);
                //sumOptimalLine += Math.pow(arrayValue[j][1] - (optimizeLine[1] + optimizeLine[0] * arrayValue[j][i]), 2);
            }
            if (sum < error) {
                sum = error;
                result[0] = i;
                result[1] = 2;
                result[2]=sum;
            }
        }
        return result;
    }
}
