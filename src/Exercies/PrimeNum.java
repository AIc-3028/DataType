package Exercies;

public class PrimeNum {

    public static boolean isPrime(int num){

        if (num <= 2){
            return num < 3;
        } else if ( num % 3 == 0 ){
            return false;
        } else if ( num % 2 == 0){
            return false;
        } else if ( num % 5 == 0){
            return false;
        } else if ( num % 7 == 0){
            return false;}
        else {
            return true;
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++){
            if (isPrime(i)){
                System.out.printf("%d is a Prime Number %n", i);
            }
        }

    }
}
