package Assignment2;

import java.util.Arrays;

public class DisjointSets_Tester {

	public static void main(String[] args) {
		double score = 0;
		double prev = 0;
		double expectedScore = 5;
		
		double eScore1 = 1.0;
		double eScore2 = 0.5;
		double eScore3 = 1.0;
		double eScore4 = 0.5;
		double eScore5 = 1.0;
		double eScore6 = 1.0;
		
		String expRes = "9 set(s):\n" + 
				"7 : 0,1,2,3,4,5,6,7,80,81,82,83,84,85,86,87\n" + 
				"31 : 24,25,26,27,28,29,30,31\n" + 
				"39 : 32,33,34,35,36,37,38,39,96,97,98,99\n" + 
				"47 : 40,41,42,43,44,45,46,47\n" + 
				"55 : 48,49,50,51,52,53,54,55\n" + 
				"63 : 8,9,10,11,12,13,14,15,56,57,58,59,60,61,62,63\n" + 
				"71 : 64,65,66,67,68,69,70,71\n" + 
				"79 : 72,73,74,75,76,77,78,79\n" + 
				"95 : 16,17,18,19,20,21,22,23,88,89,90,91,92,93,94,95\n";
		
		String expRes2 = "3 set(s):\n" + 
				"7 : 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,80,81,82,83,84,85,86,87\n" + 
				"47 : 24,25,26,27,28,29,30,31,40,41,42,43,44,45,46,47,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79\n" + 
				"95 : 16,17,18,19,20,21,22,23,32,33,34,35,36,37,38,39,88,89,90,91,92,93,94,95,96,97,98,99\n";
		
	
		// create 100 singleton sets 0 -> 100
		DisjointSets ds = new DisjointSets(100);
		
		// union 0-1, 2-3, 4-5...
		for (int i = 0 ; i < 100 ; i += 2) {
			ds.union(i, i+1);
		}	
		
		// should merge i into j
		for (int i = 0 ; i < 100 ; i += 2) {
			if (ds.find(i) == ds.find(i+1) && ds.find(i) == i+1) {
				score += 0.02;
			}
		}
		
		System.out.printf("Achieved score : %.2f / %.2f (Union of singletons)\n", score, eScore1);
		
		// union 0-3, 16-19, 32,35,...
		for (int i = 0 ; i < 100 ; i += 16) {
			ds.union(i, i+3);
		}

		
		String res = ds.toString();
		
		for (int i = 0 ; i < 100 ; i += 2) {
			ds.union(i, i+1);
		}
			
		prev = score;
		
		// result should not have changed
		if (res.equals(ds.toString())) {
			score += 0.5;
		}
		
		System.out.printf("Achieved score : %.2f / %.2f (Union of same set elements)\n", score - prev, eScore2);

		prev = score;
		
		// check representative
		for (int i = 0 ; i < 100 ; i += 16) {
			if (ds.find(i) == i+3) {
				score += (1.0 / 7);
			}
		}
		
		System.out.printf("Achieved score : %.2f / %.2f (Check representative)\n", score-prev, eScore3);
		
		prev = score;
		
		for (int i = 0 ; i < 100 ; i += 4) {
			ds.union(i, i+3);
		}
		
		
		res = ds.toString();
		
		for (int i = 0 ; i < 100 ; i+=4) {
			ds.union(i, i+1);
			ds.union(i, i+2);
			ds.union(i, i+3);
		}
		
		if (res.equals(ds.toString())) {
			score += 0.5;
		}

		System.out.printf("Achieved score : %.2f / %.2f (Union of same set elements - 2)\n", score-prev, eScore4);
		
		for (int i = 0 ; i < 96 ; i+=8) {
			ds.union(i, i+4);
		}
		
		
		ds.union(8, 63);
		ds.union(83, 4);
		ds.union(33, 98);
		ds.union(18, 95);
	
		ds.union(95, 18);
	
		prev = score;
		
		if (expRes.equals(ds.toString())) {
			score += 1;
		}
		
		System.out.printf("Achieved score : %.2f / %.2f (Multiple unions)\n", score-prev, eScore5);
		
		prev = score;
		
		ds.union(65, 74);
		ds.union(23, 97);
		ds.union(87, 55);
		ds.union(25, 44);
		ds.union(61, 55);
		ds.union(67, 46);
		
		if (expRes2.equals(ds.toString())) {
			score += 1;
		}
		
		System.out.printf("Achieved score : %.2f / %.2f (Multiple unions - 2)\n", score-prev, eScore6);
			
		System.out.printf("Total Score : %.2f / %.2f", score, expectedScore);
	}
}
