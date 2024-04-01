package random;

import java.util.Random;

public class RandomExamples {

	public static int [] RandomExample1(int nelms) { 
		int[] data = new int[nelms]; 
		for (int i = 0; i < data.length; ++i) { 
			data[i] = (int)(10 * Math.random()); 
		} 
		return data;
	}

	public static int [] ExampleRandom2(int nelms) {
		Random rnd = new Random();
		int []data = new int[nelms];
		for (int i = 0; i < data.length; ++i) {
			data[i] = (int)(10 * rnd.nextDouble());
		}
		return data;
	}

	public static int[] RandomExample3(int nelms) {
		Random rnd = new Random();
		int [] data = new int[nelms]; 
		for (int i = 0; i < data.length; ++i) { 
			data[i] = rnd.nextInt(10); 
		}
		return data;
	}
	
	public static double[] RandomExample4(int nelms) {
		Random rnd = new Random();
		double[] data = new double[nelms];
		for (int i = 0; i < data.length; ++i) {
			data[i] = rnd.nextGaussian()*5.0/3.0+5.0;
			if (data[i] < 0.0) { data[i] = 0.0; }
			if (data[i] > 10.0) { data[i] = 10.0; }
		}
		return data;
	}

		public static void main(String args[]) {
			int [] firstRandom = RandomExamples.ExampleRandom2(10);
			for (int i: firstRandom) {
				System.out.print(i + ", ");
			}
			System.out.println("");
			int [] secondRandom = RandomExamples.RandomExample3(10);
			for (int i: secondRandom) {
				System.out.print(i + ", ");
			}
		}

}