import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;


public class Main {
    public static void main(String[] args) {
	// writing my Assignment

        // Using Java For Question 5

        String studentName = "I am a student";
        String Department = " of Computer Science,";
        String school = " Enugu state university of science and technology";

        System.out.print(studentName);
        System.out.println(Department);
        System.out.println(school);

        // Using Java for Question 5(b)
        Date now = new Date();
        System.out.println(now);
        TimeZone zone = new TimeZone() {
            @Override
            public int getOffset(int era, int year, int month, int day, int dayOfWeek, int milliseconds) {
                return 0;
            }

            @Override
            public void setRawOffset(int offsetMillis) {

            }

            @Override
            public int getRawOffset() {
                return 0;
            }

            @Override
            public boolean useDaylightTime() {
                return false;
            }

            @Override
            public boolean inDaylightTime(Date date) {
                return false;
            }
        };
        
     // USing Java in Question 3(a)
        int n = 100;
        System.out.print("Even Number from 1 to  " + n + "are :");
        for (int i = 1; i <= n; i++){
            //if number%2 == 0 it means its an even number
            if (i % 2 ==0){
                System.out.println(i + "");
            }
        };

        // Using Java in Question 3(b)
        /*****************************/
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = in.nextInt();
        double sqrtValue = Math.sqrt(num);
        double cbrtValue = Math.cbrt(num);
        long roundSqrt = Math.round(sqrtValue);
        long roundCbrt = Math.round(cbrtValue);

        System.out.println("Square root of " + num + "=" + sqrtValue);
        System.out.println("Rounded Form = " + num + "=" + roundSqrt);
        System.out.println("Cube root of " + num + "=" + cbrtValue);
        System.out.println("Rounded form " +roundCbrt);



    }
}
