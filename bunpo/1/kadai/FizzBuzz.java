
public class FizzBuzz {
    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }
        for (int i = 1; i <= Integer.parseInt(args[0]); i++) {
            String result = "";
            if (i % 3 == 0) {
                result = result + "Fizz";
            }
            if (i % 5 == 0) {
                result = result + "Buzz";
            }
            if (result.length() == 0) {
                result = result + i;
            }
            System.out.println(result + " ");
        }
    }
}
