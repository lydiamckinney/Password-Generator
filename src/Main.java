import java.util.Scanner;
import java.security.SecureRandom;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Password Generator!");

        while (true) {
        System.out.println("How long would you like your password to be?");
        int length = scanner.nextInt();

        System.out.println("Your new password is: " + Generator(length));
        System.out.println("Would you like to generate another password? (y/n)");
        String genPass = scanner.next().toLowerCase();

        if (genPass.equals("n")) {
            break;
        }
    }
    scanner.close();
    }

    public static String Generator(int len){
        SecureRandom random = new SecureRandom();
        StringBuilder build = new StringBuilder();

        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String nums = "0123456789";
        String specialChar = "!@#$%^&*";
        String pass = upper + lower + nums + specialChar;

        for (int i = 0; i < len; i++){
            int randomIndex = random.nextInt(pass.length());
            build.append(pass.charAt(randomIndex));
        }
        return build.toString();
    }
}
