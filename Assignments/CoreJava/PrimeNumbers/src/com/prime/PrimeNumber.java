package com.prime;

class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*****Prime  Numbers*******");
		int count = 0;
		int n = 8;
		int m = n / 2;
		for (int i = 2; i <= m; i++) {
			if (n % i == 0) {
				System.out.println("number " + n + " is not prime number");
				count = +1;
				break;
			}
		}
		if (count == 0) {

			System.out.println("number " + n + " is  prime number");
		}
		System.out.println("*****prime number within range*****");
		
		for (int i = 1; i <=20; i++) {
			int prime = 0;
			for (int j = 2; j <i; j++) {
				if (i % j == 0) {
					System.out.println("number " + i + " is not primenumber");
					prime = prime + 1;
					break;

				}

			}
			if (prime == 0) {
				System.out.println("number " + i + " is prime number");
			}

		}

	}

}
