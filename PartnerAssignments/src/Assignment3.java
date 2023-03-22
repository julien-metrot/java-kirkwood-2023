import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        /*
        Zodiac Sign	Dates of Birth
        Aries	March 21-April 19
        Taurus	April 20-May 20
        Gemini	May 21-June 20
        Cancer	June 21-July 22
        Leo	July 23-August 22
        Virgo	August 23-September 22
        Libra	September 23-October 22
        Scorpio	October 23-November 21
        Sagittarius	November 22-December 21
        Capricorn	December 22-January 19
        Aquarius	January 20-February 18
        Pisces	February 19-March 20
        */
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("M/d/yyyy");
        System.out.print("Please enter your date of birth (M/D/YYYY): ");
        String userInput = scanner.nextLine();
        LocalDate userBirthday = LocalDate.parse(userInput, format);
        int day = userBirthday.getDayOfMonth();
        int month = userBirthday.getMonthValue();
        String zodiac = "";
        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            zodiac = "Aries";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            zodiac = "Taurus";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            zodiac = "Gemini";
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            zodiac = "Cancer";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            zodiac = "Leo";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            zodiac = "Virgo";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            zodiac = "Libra";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            zodiac = "Scorpio";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            zodiac = "Sagittarius";
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            zodiac = "Capricorn";
        } else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            zodiac = "Aquarius";
        } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            zodiac = "Pisces";
        }

        char result = zodiac.charAt(0);

        if (result == 'A' || result == 'E' || result == 'I' || result == 'O' || result == 'U') {
            System.out.println("You are an " + zodiac);
        } else {
            System.out.println("You are a " + zodiac);
        }
    }
}
