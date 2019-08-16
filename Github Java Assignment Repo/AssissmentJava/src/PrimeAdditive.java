import java.util.*;

public class PrimeAdditive {

	boolean checkPrime(int primeToCheck) {

		for (int i = 2; i < primeToCheck; i++) {
			if ((primeToCheck % i) == 0) {
				return false;
			}
		}
		return true;
	}

	int SumOfDigits(int toCheckInteger) {

		int sum = 0;

		while (toCheckInteger != 0) {
			sum = sum + toCheckInteger % 10;
			toCheckInteger = toCheckInteger / 10;
		}

		return sum;
	}

	public static void main(String[] args) {
		PrimeAdditive pa = new PrimeAdditive();

		// int arr[]= {2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};

		// int arr[]= {2,4,6,11,12,18,7};

		int arr[] = { 2, 3, 19, 13, 25, 7 ,11,21,23};

		/*
		 * Scanner sc=new Scanner(System.in); int x=sc.nextInt();
		 * 
		 * System.out.println(pa.checkPrime(x));
		 */

		ArrayList<String> al = new ArrayList<String>();
		// List<Integer> l1 = new ArrayList<Integer>();

		for (int i : arr) {
			if (pa.checkPrime(pa.SumOfDigits(i)) && pa.checkPrime(i)) {
				al.add("" + i);
			}
		}

		Iterator itr = al.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
