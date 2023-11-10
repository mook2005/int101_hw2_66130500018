package work01;

public class Utilitor {
    public static String testString(String value){
        if (value == null){
            throw new NullPointerException();
        }
        if (value.isBlank()){
            throw new IllegalArgumentException();
        }
        return value;
    }

    public static double testPositive(double value){
        if (value > 0){
            return value;
        }
        throw new IllegalArgumentException();
    }

    public static long computeIsbn10(long isbn10){
        int sum = 0;
        for (int i = 2; i < 11; i++) {
            int digit = (int)isbn10 % 10;
            isbn10 /= 10;
            sum += (int) (digit*i);
        }
        return (11 - sum%11) % 11;
    }

}
