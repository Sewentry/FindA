import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateLineByTCore{
    Experiment experiment;
    MNK mnk = new MNK();
    //private ArrayList<double[][]> arrayOfT1Core = List.of(t1ValueK01,t1ValueK001);


    private double[][] t1ValueK01 ={{17.57,17.52,17.49,17.47,17.46,17.45,17.45},{19.06,18.93,18.86,18.82,18.8,18.78,18.76},{20.62,20.34,20.20,20.11,20.05,20.01,19.98},{21.56,21.14,20.92,20.78,20.69,20.63,20.57},{22.22,21.66,21.37,21.19,21.06,20.98,20.91},{22.73,22.03,21.67,21.45,21.30,21.19,21.10},{23.13,22.31,21.88,21.62,21.44,21.31,21.22},{23.98,22.82,22.22,21.86,21.62,21.45,21.33},{24.88,23,21,22.39,21.94,21.66,21.47,21.34},{25.70,23.31,22.39,21.94,21.66,21.47,21.34},{25.87,23.31,22.39,21.94,21.66,21.47,21.34},{25.88,23.31,22.39,21.94,21.66,21.47,21.34},{25.9,23.31,22.39,21.94,21.66,21.47,21.34},{25.90,23.31,22.39,21.94,21.66,21.47,21.34},{25.90,23.31,22.39,21.94,21.66,21.47,21.34},{25.90,23.31,22.39,21.94,21.66,21.47,21.34},{25.90,23.31,22.39,21.94,21.66,21.47,21.34},{25.90,23.31,22.39,21.94,21.66,21.47,21.34},{25.90,23.31,22.39,21.94,21.66,21.47,21.34},{25.90,23.31,22.39,21.94,21.66,21.47,21.34},{25.90,23.31,22.39,21.94,21.66,21.47,21.34},{25.90,23.31,22.39,21.94,21.66,21.47,21.34},{25.90,23.31,22.39,21.94,21.66,21.47,21.34},{25.90,23.31,22.39,21.94,21.66,21.47,21.34}};
    private double[][] t1ValueK001 ={{133.5,133.4,133.4,133.4,133.4,133.4,133.4},{144.6,144.5,144.5,144.4,144.4,144.4,144.4},{156.8,156.6,156.5,156.4,156.4,156.3,156.3},{164.5,164.2,164,163.9,163.8,163.8,163.7},{170.2,169.7,169.5,169.3,169.3,169.3,169.2,169.1},{174.8,174.1,173.8,173.6,173.5,173.4,173.3},{178.6,177.8,177.4,177.1,177,176.9,176.8},{187.3,186,185.4,185,184.8,184.6,184.4},{187.3,186,185.4,185,184.8,184.6,184.4},{198.6,196.5,195.4,194.7,194.3,193.9,193.7},{214.7,210.3,208.1,206.7,205.8,205.1,204.6},{223.1,217.5,214.2,212.1,210.7,209.7,208.9},{230.3,222,217.6,215,213.2,211.9,210.9},{238.9,227.2,221.2,217.6,215.2,213.5,212.2},{244.3,229.7,222.4,218.2,215.4,213.5,212.2},{250.7,231.6,222.8,218.2,215.4,213.5,212.2},{254,231.9,222.8,218.2,215.4,213.5,212.2},{255.9,232,222.8,218.2,215.4,213.5,212.2},{257.1,232,222.8,218.2,215.4,213.5,212.2},{258,232,222.8,218.2,215.4,213.5,212.2},{258.1,232,222.8,218.2,215.4,213.5,212.2},{258.1,232,222.8,218.2,215.4,213.5,212.2},{258.1,232,222.8,218.2,215.4,213.5,212.2},{258.1,232,222.8,218.2,215.4,213.5,212.2},{258.1,232,222.8,218.2,215.4,213.5,212.2}};
    private double[][] t1ValueK0001={{1027,1027,1027,1027,1027,1027,1027},{1110,1110,1110,1110,1110,1110,1110},{1201,1200,1200,1200,1200,1200,1200},{1258,1257,1257,1257,1257,1257,1257},{1300,1299,1299,1299,1299,1299,1299},{1334,1333,1333,1333,1333,1332,1332},{1362,1361,1361,1361,1361,1360,1360},{1427,1426,1426,1425,1425,1425,1425},{1514,1513,1512,1511,1511,1511,1510},{1644,1640,1639,1637,1637,1636,1636},{1724,1719,1716,1714,1713,1712,1711},{1784,1776,1772,1769,1768,1767,1766},{1872,1860,1853,1849,1847,1845,1844},{1936,1919,1910,1905,1901,1899,1897},{2027,2001,1988,1980,1974,1970,1967},{2093,2059,2041,2029,2022,2017,2013},{2145,2101,2079,2065,2055,2049,2043},{2188,2136,2109,2092,2081,2073,2067},{2341,2244,2194,2163,2142,2127,2116},{2472,2308,2227,2182,2154,2135,2121},{2556,2319,2227,2182,2154,2135,2121},{2578,2319,2227,2182,2154,2135,2121},{2579,2319,2227,2182,2154,2135,2121},{2579,2319,2227,2182,2154,2135,2121}};
    private double[][] t1ValueO0001={{7900,7900,7900,7900,7900,7900,7900},{8556,8556,8556,8556,8556,8556,8556},{9256,9256,9256,9256,9256,9256,9256},{9692,9692,9692,9692,9692,9692,9692},{10010,10010,10010,10010,10010,10010,10010},{10270,10270,10270,10270,10270,10270,10270},{10480,10480,10480,10480,10480,10480,10480},{10970,10970,10970,10970,10970,10970,10970},{11620,11620,11620,11620,11620,11620,11620},{12570,12570,12570,12570,12570,12570,12570},{13170,13170,13170,13170,13170,13170,13170},{13610,13610,13610,13610,13610,13610,13610},{13610,13600,13600,13600,13600,13600,13600},{14270,14260,14260,14260,14260,14260,14260},{14750,14750,14750,14750,14750,14750,14750},{15470,15450,15440,15440,15440,15440,15440},{16000,15980,15960,15950,15950,15950,15950},{16430,16390,16380,16360,16360,16350,16350},{16800,16760,16730,16720,16710,16700,16700},{18230,18130,18080,18050,18030,18020,18010},{19760,19560,19460,19390,19350,19320,19300},{21360,20940,20720,20590,20500,20440,20390},{22930,22130,21170,21450,21280,21150,21060},{24090,22820,22170,21780,21520,21340,21210},{24090,22820,22170,21780,21520,21340,21210}};
    private double[][] t1Value000001={{59840,59840,59840,59840,59840,59840,59840},{65230,65230,65230,65230,65230,65230,65230},{70910,70910,70910,70910,70910,70910,70910},{74420,74420,74420,74420,74420,74420,74420},{76970,76970,76970,76970,76970,76970,76970},{78990,78990,78990,78990,78990,78990,78990},{80670,80670,80670,80670,80670,80670,80670},{84500,84500,84500,84500,84500,84500,84500},{89610,89610,89610,89610,89610,89610,89610},{96900,96900,96900,96900,96900,96900,96900},{101400,101400,101400,101400,101400,101400,101400},{104700,104700,104700,104700,104700,104700,104700},{109700,109700,109700,109700,109700,109700,109700},{113300,113300,113300,113300,113300,113300,113300},{118600,118600,118600,118600,118600,118600,118600},{122500,122500,122500,122500,122500,122500,122500},{125700,125700,125700,125700,125700,125700,125700},{125700,125600,125600,125600,125600,125600,125600},{128400,128400,128300,128300,128300,128300,128300},{139000,139000,138900,138900,138900,138900,138900},{150800,150600,150500,150500,150500,150400,150400},{163600,163200,163100,162900,162900,162900,162800,162800},{177500,176800,176400,176200,176000,175900,175800},{189700,188300,187500,187100,186800,186600,186500},{189700,188300,187500,187100,186800,186600,186500}};
    private double[][] t2ValueY01 = new double[6][];
    private double[][] t2ValueY02 = new double[6][];
    private double[][] t2ValueY03 = new double[6][];
    private double[][] t2ValueY04 = new double[6][];
    private double[][] t2ValueY05 = new double[6][];
   // ={{0.144,0.189,0.247,0.323,0.421,0.556},{0.236,0.317,0.425,0.567,0.75,1.003},{0.375,0.523,0.722,0.984,1.326,1.799},{0.494,0.693,0.977,1.353,1.844,2.527},{0.576,0.843,1.205,1.691,2.327,3.213},{0.656,0.977,1.417,2.007,2.784,3.867},{0.727,1.099,1.614,2.307,3.22,4.498},{0.9,1.418,2.144,3.132,4.443,6.283},{1.142,1.915,3.029,4.567,6.628,9.541},{1.464,2.754,4.711,7.492,11.285,16.7},{1.609,3.303,5.991,9.902,15.3,23.07},{1.675,3.693,7.036,12,18.93,28.96},{1.707,4.198,8.684,15.59,25.41,39.78},{,4.488,9.948,18.64,31.18,49.68},{}};


    private double correlationValueT1 =0;
    private double errorT1 = 10000000;
    private double correlationValueT2 =0;
    private double errorT2 = 10000000;

    public double[] findT1Core(double[][] arrayValue) {
        double[] result= new double[4];
        double [][] res = new double[arrayValue.length][t1ValueK01[0].length];
        for (int i = 0; i < t1ValueK01[0].length; i++) {
//                sigmaT=kx+sigma0 - уравнение прямой через угловой к-ф
            double k = (arrayValue[0][1] - arrayValue[arrayValue.length - 1][1]) / (t1ValueK01[t1ValueK01.length-1][i] - t1ValueK01[0][i]);
            double sigma0 = (arrayValue[0][1] + k * t1ValueK01[0][i]);
            for (int j = 0; j < arrayValue.length; j++) {
                res[j][i] = sigma0 - k * t1ValueK01[j][i];
                //sumOptimalLine += Math.pow(arrayValue[j][1] - (optimizeLine[1] + optimizeLine[0] * arrayValue[j][i]), 2);
            }
            double[][] mnkArray = createMNKArray(res, i, t1ValueK01);
            double[][] mnkArrayToCorrelation=createMNKArrayExperiment(res,i,arrayValue);
            double[] coefficientMNKtoTArray = mnk.method(mnkArray);
            double errorTArray = mnk.checkError(mnkArray, coefficientMNKtoTArray);
            double correlationIndex = correlation(mnkArrayToCorrelation);
            if(errorTArray<errorT1 && correlationIndex>correlationValueT1){
                errorT1 = errorTArray;
                correlationValueT1 = correlationIndex;
                result[0] = 1;
                result[1] = i;
                result[2] = correlationIndex;
                result[3]=sigma0;
            }
        }
        for (int i = 0; i < t1ValueK001[0].length; i++) {
//                sigmaT=kx+sigma0 - уравнение прямой через угловой к-ф
                double k = (arrayValue[0][1] - arrayValue[arrayValue.length - 1][1]) / (t1ValueK001[t1ValueK001.length-1][i] - t1ValueK001[0][i]);
                double sigma0 = (arrayValue[0][1] + k * t1ValueK001[0][i]);
                for (int j = 0; j < arrayValue.length; j++) {
                    res[j][i]=sigma0 - k * t1ValueK001[j][i];
                    //sumOptimalLine += Math.pow(arrayValue[j][1] - (optimizeLine[1] + optimizeLine[0] * arrayValue[j][i]), 2);
                }
            double[][] mnkArray = createMNKArray(res, i, t1ValueK001);
            double[][] mnkArrayToCorrelation=createMNKArrayExperiment(res,i,arrayValue);
            double[] coefficientMNKtoTArray = mnk.method(mnkArray);
            double errorTArray = mnk.checkError(mnkArray, coefficientMNKtoTArray);
            double correlationIndex = correlation(mnkArrayToCorrelation);
                if(errorTArray<errorT1 && correlationIndex>correlationValueT1){
                    errorT1=errorTArray;
                    correlationValueT1=correlationIndex;
                    result[0]=2;
                    result[1]=i;
                    result[2]=correlationIndex;
                    result[3]=sigma0;
                }
        }
        for (int i = 0; i < t1ValueK0001[0].length; i++) {
//                sigmaT=kx+sigma0 - уравнение прямой через угловой к-ф
            double k = (arrayValue[0][1] - arrayValue[arrayValue.length - 1][1]) / (t1ValueK0001[t1ValueK0001.length-1][i] - t1ValueK0001[0][i]);
            double sigma0 = (arrayValue[0][1] + k * t1ValueK0001[0][i]);
            for (int j = 0; j < arrayValue.length; j++) {
                res[j][i]=sigma0 - k * t1ValueK0001[j][i];
                //sumOptimalLine += Math.pow(arrayValue[j][1] - (optimizeLine[1] + optimizeLine[0] * arrayValue[j][i]), 2);
            }
            double[][] mnkArray = createMNKArray(res, i, t1ValueK0001);
            double[][] mnkArrayToCorrelation=createMNKArrayExperiment(res,i,arrayValue);
            double[] coefficientMNKtoTArray = mnk.method(mnkArray);
            double errorTArray = mnk.checkError(mnkArray, coefficientMNKtoTArray);
            double correlationIndex = correlation(mnkArrayToCorrelation);
            if(errorTArray<errorT1 && correlationIndex>correlationValueT1){
                errorT1=errorTArray;
                correlationValueT1=correlationIndex;
                result[0]=3;
                result[1]=i;
                result[2]=correlationIndex;
                result[3]=sigma0;
            }
        }
        return result;
    }
    public double[] findT2Core(double[][] arrayValue) {
        double[] result= new double[4];
        t2ValueY01[5]=new double[]{0.556,1.003,1.799,2.527,3.213,3.867,4.498,6.283,9.541,16.7,23.07,28.96,39.78,49.68,67.71,84.09,99.29,113.6,187.1,301.1,470.7,707.9,948.1,1694};
        t2ValueY01[4]=new double[]{0.421,0.75,1.326,1.844,2.327,2.784,3.22,4.443,6.628,11.285,15.3,18.93,25.41,31.18,41.32,50.19,58.16,65.44,100.100,146.4,200.8,252,277};
        t2ValueY01[3]=new double[]{0.323,0.567,0.984,1.353,1.691,2.007,2.307,3.132,4.567,7.492,9.902,12,15.59,18.64,23.67,27.78,31.25,34.24,46.29,56.88,61.7};
        t2ValueY01[2]=new double[]{0.247,0.425,0.722,0.977,1.205,1.417,1.614,2.144,3.029,4.711,5.991,7.036,8.684,9.948,11.78,13.03,13.91,14.54,15.85};
        t2ValueY01[1]=new double[]{0.189,0.317,0.523,0.693,0.843,0.988,1.099,1.418,1.915,2.754,3.303,3.693,4.198,4.488,4.745,4.808};
        t2ValueY01[0]=new double[]{0.144,0.236,0.375,0.494,0.576,0.656,0.727,0.9,1.142,1.464,1.609,1.675,1.707};

        t2ValueY02[5]=new double[]{2.577,4,493,7.811,10.78,13.53,16.13,18.62,25.59,38.09,65,88.58,110.1,149.3,185,249.3,307.4,361,411.2,667.7,1063,2471,3310};
        t2ValueY02[4]=new double[]{1.601,2.757,4.721,6.447,8.031,9.514,10.92,14.8,21.61,35.74,47.66,38.25,76.86,93.16,121.3,145.3,166.8,186,274.3,382.8,493.3,567.1};
        t2ValueY02[3]=new double[]{1.127,1.913,3.221,4.349,5.368,6.31,7.195,9.596,13.68,21.74,28.18,33.65,42.77,50.27,62.2,71.46,78.93,85.09,106.4,117.8};
        t2ValueY02[2]=new double[]{0.86,1.431,2.353,3.13,3.819,4.448,5.029,6.574,9.097,13.74,17.14,19.83,23.91,26.8,30.8,33.16,34.57,35.39};
        t2ValueY02[1]=new double[]{0.66,1.081,1.744,2.285,2.754,3.173,3.555,4.536,6.047,8.53,10.10,11.17,12.47,13.13,13.56};
        t2ValueY02[0]=new double[]{0.521,0.837,1.316,1.694,2.011,2.286,2.531,3.133,3.979,5.124,5.647,5.885,6.003};

        t2ValueY03[5]=new double[]{9.064,15.02,24.87,33.38,41.12,48.33,55.14,73.88,106.6,174.9,233.1,285.4,379,462.8,611.8,744.4,865.6,978.3,1545,2401,3650,5383,7146,12981};
        t2ValueY03[4]=new double[]{4.064,6.68,10.94,14.56,17.81,20.81,23.62,31.24,44.24,70.2,91.38,109.8,141.4,168.3,213.6,251.3,283.8,312.4,436.3,568.7,669};
        t2ValueY03[3]=new double[]{2.621,4.265,6.888,9.08,11.02,12.79,14.43,18.8,26.03,39.72,50.22,58.9,72.86,83.88,100.5,112.6,121.7,128.7,147.5};
        t2ValueY03[2]=new double[]{1.913,3.076,4.894,6.381,7.677,8.841,9.908,12.69,17.11,24.9,50.35,34.5,40.45,44.46,49.18,51.43,52.39,52.69};
        t2ValueY03[1]=new double[]{1.488,2.362,3.697,4.762,5.673,6.478,7.204,9.049,11.83,16.24,30.35,20.65,22.6,23.44,23.78};
        t2ValueY03[0]=new double[]{1.219,1.901,2.914,3.701,4.358,4.926,5.429,6.664,8.396,10.75,11.83,12.32,12.56};

        double [][] res = new double[t2ValueY01.length][t2ValueY01[0].length];
        for (int i = 0; i < t2ValueY01.length; i++) {
//                sigmaT=kx+sigma0 - уравнение прямой через угловой к-ф
            double k = (arrayValue[0][1] - arrayValue[t2ValueY01.length - 1][1]) / (t2ValueY01[i][t2ValueY01[0].length-1] - t2ValueY01[0][t2ValueY01[0].length-1]);
            double sigma0 = (arrayValue[0][1] + k * t2ValueY01[i][0]);
            for (int j = 0; j < t2ValueY01.length; j++) {
                res[j][i] = sigma0 - k * t2ValueY01[i][j];
                //sumOptimalLine += Math.pow(arrayValue[j][1] - (optimizeLine[1] + optimizeLine[0] * arrayValue[j][i]), 2);
            }
            double[][] mnkArray = createMNKArray(res, i, t2ValueY01);
            double[][] mnkArrayToCorrelation=createMNKArrayExperiment(res,i,arrayValue);
            double[] coefficientMNKtoTArray = mnk.method(mnkArray);
            double errorTArray = mnk.checkError(mnkArray, coefficientMNKtoTArray);
            double correlationIndex = correlation(mnkArrayToCorrelation);
            if(errorTArray<errorT2 && correlationIndex>correlationValueT2){
                errorT2 = errorTArray;
                correlationValueT2 = correlationIndex;
                result[0] = 1;
                result[1] = i;
                result[2] = correlationIndex;
                result[3]=sigma0;
            }
        }
        for (int i = 0; i < t2ValueY02.length; i++) {
//                sigmaT=kx+sigma0 - уравнение прямой через угловой к-ф
            double k = (arrayValue[0][1] - arrayValue[t2ValueY02.length - 1][1]) / (t2ValueY02[i][t2ValueY02[0].length-1] - t2ValueY02[0][t2ValueY02[0].length-1]);
            double sigma0 = (arrayValue[0][1] + k * t2ValueY02[i][0]);
            for (int j = 0; j < t2ValueY02.length; j++) {
                res[j][i] = sigma0 - k * t2ValueY02[i][j];
                //sumOptimalLine += Math.pow(arrayValue[j][1] - (optimizeLine[1] + optimizeLine[0] * arrayValue[j][i]), 2);
            }
            double[][] mnkArray = createMNKArray(res, i, t2ValueY02);
            double[][] mnkArrayToCorrelation=createMNKArrayExperiment(res,i,arrayValue);
            double[] coefficientMNKtoTArray = mnk.method(mnkArray);
            double errorTArray = mnk.checkError(mnkArray, coefficientMNKtoTArray);
            double correlationIndex = correlation(mnkArrayToCorrelation);
            if(errorTArray<errorT2 && correlationIndex>correlationValueT2){
                errorT2 = errorTArray;
                correlationValueT2 = correlationIndex;
                result[0] = 2;
                result[1] = i;
                result[2] = correlationIndex;
                result[3] = sigma0;
            }
        }
        for (int i = 0; i < t2ValueY03.length; i++) {
//                sigmaT=kx+sigma0 - уравнение прямой через угловой к-ф
            double k = (arrayValue[0][1] - arrayValue[t2ValueY03.length - 1][1]) / (t2ValueY03[i][t2ValueY03[0].length-1] - t2ValueY03[0][t2ValueY03[0].length-1]);
            double sigma0 = (arrayValue[0][1] + k * t2ValueY03[i][0]);
            for (int j = 0; j < t2ValueY03.length; j++) {
                res[j][i] = sigma0 - k * t2ValueY03[i][j];
                //sumOptimalLine += Math.pow(arrayValue[j][1] - (optimizeLine[1] + optimizeLine[0] * arrayValue[j][i]), 2);
            }
            double[][] mnkArray = createMNKArray(res, i, t2ValueY03);
            double[][] mnkArrayToCorrelation=createMNKArrayExperiment(res,i,arrayValue);
            double[] coefficientMNKtoTArray = mnk.method(mnkArray);
            double errorTArray = mnk.checkError(mnkArray, coefficientMNKtoTArray);
            double correlationIndex = correlation(mnkArrayToCorrelation);
            if(errorTArray<errorT2 && correlationIndex>correlationValueT2){
                errorT2 = errorTArray;
                correlationValueT2 = correlationIndex;
                result[0] = 3;
                result[1] = i;
                result[2] = correlationIndex;
                result[3] = sigma0;
            }
        }
        return result;
    }
    private double correlation(double[][] mnkArrayValue){
        double averageY = average(mnkArrayValue,1);
        double averageX = average(mnkArrayValue,0);
        double xException = 0.0;
        double yException = 0.0;
        double numerator=0.0;
        double denominator;
        for(int i=0;i<mnkArrayValue.length;i++){
            numerator+=(mnkArrayValue[i][1]-averageY)*(mnkArrayValue[i][0]-averageX);
        }
        for(int i=0;i<mnkArrayValue.length;i++) {
            yException+=Math.pow(mnkArrayValue[i][1]-averageY,2);
            xException+=Math.pow(mnkArrayValue[i][0]-averageX,2);
        }
        denominator=Math.sqrt(xException*yException);
        return numerator/denominator;
    }
    private double average(double[][] value, int numberOfColumn){
        double res=0.0;
        for(int i=0;i<value.length;i++){
            res+=value[i][numberOfColumn];
        }
        return res/value.length;
    }
    private double[][] createMNKArrayExperiment (double[][] res, int numberOfColumn, double[][] experimentRes){
        double[][] mnkArray = new double[res.length][2];
        for(int i=0;i<res.length;i++){
            mnkArray[i][1]=res[i][numberOfColumn];
            mnkArray[i][0]=experimentRes[i][1];
        }
        return mnkArray;
    }
    private double[][] createMNKArray (double[][] res, int numberOfColumn, double[][] experimentRes){
        double[][] mnkArray = new double[res.length][2];
        for(int i=0;i<res.length;i++){
            mnkArray[i][1]=res[i][numberOfColumn];
            mnkArray[i][0]=experimentRes[i][numberOfColumn];
        }
        return mnkArray;
    }

}
