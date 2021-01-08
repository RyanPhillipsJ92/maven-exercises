import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class mavenPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an input");
        String test = sc.nextLine();
        System.out.println(StringUtils.isNumeric(test));
        System.out.println(StringUtils.swapCase(test));
        System.out.println(StringUtils.reverse(test));

    }
}
