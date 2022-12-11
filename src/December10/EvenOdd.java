package December10;

public class EvenOdd {
    public static void main(String[] args) {
        int num = 11;
        String result =  checkEvenOrOdd(num);
        System.out.println("Number "+num+" is "+result);
    }

    public static String checkEvenOrOdd(int num){
        int rem = num % 2;
        String result = rem == 0 ? "Even" : "Odd";
        return result;
    }
}
