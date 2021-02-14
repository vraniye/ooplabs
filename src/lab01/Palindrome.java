package lab01;

import java.util.Scanner;
    
public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input_str = in.nextLine();
        System.out.println(isPalindrome(input_str));
    }

    //метод, который преобразует входную строку, в строку с обратным порядком символов
    public static String reverseString(String str){
        String s = "";
        for (int i = str.length()-1; i >= 0; i--) {
            s+=str.charAt(i);
        }return s;
    }

    //метод для проверки является ли строка палиндромом
    public static boolean isPalindrome(String s){
        String str1 = reverseString(s);
        if (str1.equals(s)){
            return true;
        }
        return false;
    }
}
