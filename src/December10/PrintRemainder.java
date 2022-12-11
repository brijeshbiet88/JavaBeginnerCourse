package December10;

public class PrintRemainder {
    public static void main(String[] args) {
        printRemainder(111);
    }

    public static void printRemainder(int num){
        int rem =  num % 10;

        switch (rem){
            case 0 : System.out.println("Ending With 0");
                    break;
            case 1 : System.out.println("Ending With 1");
                    break;
            case 2 : System.out.println("Ending With 2");
                    break;
            default: System.out.println("Not Ending with 0 or 1 or 2");
        }


    }
}
