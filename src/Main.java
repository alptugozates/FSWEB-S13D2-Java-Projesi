public class Main {
    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println((isPerfectNumber(5)));
        System.out.println(isPerfectNumber(-1));

        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = Math.abs(number); // Sayının mutlak değerini alma

        int reversedNumber = 0;
        int tempNumber = originalNumber;

        // Sayının tersini bulma işlemi
        while (tempNumber > 0) {
            int digit = tempNumber % 10;
            reversedNumber = reversedNumber * 10 + digit;
            tempNumber = tempNumber / 10;
        }

        // Mutlak değeri alınmış orijinal sayıyı ters çevrilmiş sayıyla karşılaştırma
        return originalNumber == reversedNumber;
    }

    public static boolean isPerfectNumber(int number) {
        if (number <= 0) {
            return false;
        }

        int sumOfDivisors = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
            }
        }

        return sumOfDivisors == number;
    }

    public static String numberToWords(int num) {
        if (num < 0) {
            return "Invalid Value";
        }

        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String result = "";
        String numStr = String.valueOf(num);

        for (int i = 0; i < numStr.length(); i++) {
            char digit = numStr.charAt(i);

            switch (digit) {
                case '0':
                    result += words[0] + " ";
                    break;
                case '1':
                    result += words[1] + " ";
                    break;
                case '2':
                    result += words[2] + " ";
                    break;
                case '3':
                    result += words[3] + " ";
                    break;
                case '4':
                    result += words[4] + " ";
                    break;
                case '5':
                    result += words[5] + " ";
                    break;
                case '6':
                    result += words[6] + " ";
                    break;
                case '7':
                    result += words[7] + " ";
                    break;
                case '8':
                    result += words[8] + " ";
                    break;
                case '9':
                    result += words[9] + " ";
                    break;
                default:

                    return "Invalid Value";
            }
        }

        return result.trim();
    }
}







