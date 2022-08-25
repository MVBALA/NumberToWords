public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0)
            System.out.println("Invalid Value");
        else {
            int c = getDigitCount(number);
            number = reverse(number);
            while (c!= 0) {

                switch (number%10) {
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    case 0:
                        System.out.println("Zero");
                        break;
                }
                number /= 10;
                c--;
            }
        }
    }

    public static int reverse(int number) {
        int n = number;
        int sum = 0;
        while (n != 0) {
            int x = n % 10;
            sum = (sum * 10) + x;
            n /= 10;
        }
        return sum;
    }

    public static int getDigitCount(int number) {
        int c = 1;
        if (number < 0) {
            return -1;
        } else {
            while (number >9) {
                number /= 10;
                ++c;
            }
            return c;
        }
    }
}
