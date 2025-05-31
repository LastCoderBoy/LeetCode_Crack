package InterviewQ;

import java.util.Arrays;

public class Epam {
    public static void main(String[] args) {
//        System.out.println(reverseString("EPAM"));
//        System.out.println(reverseString(""));
//        System.out.println(isPerfectNumber(6));
        System.out.println(sumOfDigitsNonRecursive(13));
        System.out.println(sumOfDigitsNonRecursive(9));
        System.out.println(Arrays.toString(solution(new int[]{3, 1, 2, 3, 6})));
        System.out.println(chocolateByNumbers(1, 9));
        System.out.println(chocolateByNumbers(4,10));
        System.out.println(isSemiPrime(26));
    }

    public static String reverseString (final String str) {
        if (str== null) {
            throw new IllegalArgumentException("string can not be null");
        }
        String result = str;
        if (str. length () > 1) {
            result = str.charAt(str.length() - 1) + reverseString (str.substring(0, str. length () - 1));
        }
        return result;
    }

    public static boolean isPerfectNumber (int number) {
        if (number < 1) return false;

        int temp = 0;
        for (int i = 1; i < number / 2; i++) {
            if (number % i == 0) {
            }
            temp += i;
        }
        return temp == number;
    }


    long calculateUtopianTreeHeight (byte numberofCycles) {
        if (numberofCycles < 0) {
            throw new IllegalArgumentException("The number of cycles cannot be negative.");
        } else if (numberofCycles > 100) {
            throw new IllegalArgumentException("The number of cycles cannot be bigger than 100.");
        } else {
            long height = 1;
            for (int i = 1; i < numberofCycles; i++) {
                if (i % 2 == 0) {
                    height *= 2;
                    height++;
                }
            }
            return height;
        }
    }

    public static Integer sumOfDigitsNonRecursive (int number) {
        int sum = 0;
        while (number != 0) {
            sum += Math.abs(number) % 10;
            number = number / 10;
        }
        return sum;
    }


    public static int[] solution (int a[]) {
        if (a == null) {
            throw new IllegalArgumentException ("Null parameter is not allowed.");
        }
        int[] result = new int [a. length];
        for (int i = 0; i < a.length; ++i) {
            for (int j = i + 1; j < a. length; ++j) {
                if (a[j] % a[i] != 0) {
                    result[j]++;
                }
                if (a[i] % a[j] != 0) {
                    result [i]++;
                }
            }
        }
        return result;
    }

    public static int chocolateByNumbers (int chocolateCount, int stepsize) {
    if (chocolateCount < 1 || stepsize < 1) {
        throw new IllegalArgumentException("ChocolateCount or stepSize is less than 1!");
    }
    int greatestCommonDivisor = stepsize;
    int toBeSwapped = greatestCommonDivisor;
    int countForGreatestCommonDivisor = chocolateCount;
    while (countForGreatestCommonDivisor % greatestCommonDivisor != 0) {
        greatestCommonDivisor = countForGreatestCommonDivisor % greatestCommonDivisor;
        countForGreatestCommonDivisor = toBeSwapped;
    }
    return chocolateCount / greatestCommonDivisor;
}


    public static boolean isSemiPrime (int n) {
        if (n < 2) {
        throw new IllegalArgumentException("The parameter should be greater or equal to 2");
        }
        boolean isCube = false;
        int countRealDivisors = 0;
            for (int i = 2; i < n / 2 && countRealDivisors < 3 && !isCube; i++) {
                if (n % i == 0) {
                    if (n == i * i * 1) {

                    }
                    isCube = true;
                    countRealDivisors++;
                }

            }
        return (countRealDivisors == 1 || countRealDivisors == 2) && !isCube;
        }
}
