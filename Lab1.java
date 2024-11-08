import java.util.Random;

public class Main{
	public static void main(String[] args){
		short[] z1 = new short[15];
		int k = 0;
        //заполняем массив z1
		for(short i = 19; i >= 5; i--){
			z1[k] = i;
			k ++;
		}
        Random random = new Random();
        double[] x  = new double[19];
        //заполняем массив x
		for(int i = 0; i < x.length; i ++){
			x[i] = random.nextDouble(-3.0,6.0);
		}
        //заполняем массив z
        double[][] z = new double[15][19];
        for(int i = 0; i < 15; i ++){
            for(int j = 0; j < 19; j++){
                z[i][j] = countElement(z1[i], x[j]);
            }
        }
        printArr(z);
	}

    //метод для вычисления элементов массива z
    public static double countElement(int z1, double x){
        if(z1 == 15)
            return Math.cos(Math.asin((x + 1.5)/9) / (Math.pow(0.75 * (0.5 - x), 2)-1));
        else if(z1 == 5 || z1 == 9 || z1 == 10 || z1 == 12 || z1 == 13 || z1 == 17 || z1 == 19)
            return Math.sin(Math.asin(Math.pow((x + 1.5)/9, 2)));
        
        return Math.log(Math.pow(Math.cos(Math.tan(Math.cbrt(Math.pow(x,Math.PI * x)))), 2));
    }

    //метод для вывода массива z
    public static void printArr(double z[][]){
        for(int i = 0; i < 15; i++){
            for(int j = 0; j < 19; j++){
                System.out.printf("%8.5f ",z[i][j]);
            }
            System.out.println();
        }
    }

}
		
