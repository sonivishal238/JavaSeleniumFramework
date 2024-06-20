package sdetInterviewQuestions;

public class AllPrimeNumbersInRange {

	public static void main(String[] args) {
		System.out.println(countPrimes(40));

	}

	// Sieve algo
    public static int countPrimes(int n) {
        int count = 0;
        boolean[] primes = new boolean[n+1];
        for (int i = 2; i < primes.length; i++) {
            primes[i] = true;
        }
        primes[0] = primes[1] = false;
        
        for(int i = 2; i < n; i++){
        	if(primes[i]) {
        		count++;
        		
        		for(int j = 2*i; j < n; j = j+i) {
        			primes[j] = false;
        		}
        	}
        }
        
        return count;
    }
}
