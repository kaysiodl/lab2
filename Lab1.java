public class Main{
	public static void main(String[] args){
		short[] z = new short[15];
		int k = 0;
		for(short i = 19; i >= 5; i--){
			z[k] = i;
			k ++;
		}
		for(int i = 0; i < 16; i ++){
			System.out.println(z[i]);
		}
	}
}
		