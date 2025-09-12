// Binary to Decimal\
public class Conversion {
    public static void Binarytodecimal(int number) {
        int power = 0;
        int decimal = 0;

        while (number > 0) {  
            int lastdigit = number % 10;
            decimal +=(lastdigit * (int)Math.pow(2, power));
            power++;
            number /= 10;
        }

        System.out.println("Binary to decimal: " + decimal);
    }

    public static void main(String args[]) {
        Binarytodecimal(101);  
    }
}
