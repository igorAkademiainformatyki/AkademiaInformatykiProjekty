package course;

import java.util.Scanner;

public class Lesson {
	
	public static void allYears(int [] pkb) {
		for (int i = 9; i >= 0; i--) {
		      System.out.println("200" + i + ": " + pkb[i]);
		      }
	}
	
	public static void selectedYear(int [] pkb) {
		
		Scanner read = null;
		
		try {
			read = new Scanner(System.in);
			System.out.print("Select year: 200");
			int year = read.nextInt();
			if (year <= 9) {
				System.out.println("PKB in year" + " " + "200" + year + ":" + " " + pkb[year]);
			}
			else {
				System.out.println("Error!");
			}
		}
		finally {
			if(read != null) read.close();
		}
		
	}
	
	public static void pkbMin(int [] pkb) {
		int min = pkb[0];
		for (int i = 1 ; i < pkb.length; i++) {
			if(pkb[i] < min)
			min = pkb[i];
		}
		System.out.println("Lowest PKB:" + min);
	}
	
	public static void pkbMax(int [] pkb) {
		int max = 0;
		for (int i = 0 ; i < pkb.length; i++) {
			max = pkb[i];
		}
		System.out.println("Highest PKB:" + max);
		}
	
	public static void average(int [] pkb) {
	int average = (pkb[0] + pkb[1] + pkb[2] + pkb[3] + pkb[4] + pkb[5] +	pkb[6] 
			+ pkb[7] + pkb[8] + pkb[9])/10;
	System.out.println("Average PKB:" + " " + average);
		      
	}

	public static void main(String[] args) {
		
		int pkb [] = {19527, 20391, 21203, 
		        22148, 24438, 25955, 
		        28056, 31158, 33741, 
		        35966};
		
		allYears(pkb);
		selectedYear(pkb);
		pkbMin(pkb);
		pkbMax(pkb);
		average(pkb);

	}

}
