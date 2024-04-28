package org.example.codePractice;

public class PrimeChecker {

    public static void main(String[] args) {
        PrimeChecker  pm = new PrimeChecker();
        System.out.println(pm.isPrime(4) );

    }

    public boolean isPrime(int n){
        if(n <=1){
            return false;
        }
        for(int i=2 ; i < n ; i ++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
