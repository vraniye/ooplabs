package lab01;

//класс для поиска простых чисел в диапазоне от 2 до 100
public class Primes {
    public static void main(String[] args){
        for (int i = 2; i <= 100; i++){
            if (isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    //метод для проверки является ли число простым
    public static boolean isPrime(int n){
        for (int i = 2; i < n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
