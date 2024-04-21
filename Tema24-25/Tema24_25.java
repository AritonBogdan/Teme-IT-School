public class Tema24_25 {

/**Tema-24-25👏 :
 -Create a method that takes a Day enum as a parameter and uses a switch case statement to print
 a message depending on the day input.*/

public static void main(String[] args) {
    Day day = Day.THURSDAY;
    printDayMessage(day);
}
    public static void printDayMessage(Day day) {
        switch (day) {
            case MONDAY:
                System.out.println("It's Monday. Let's start the week!");
                break;
            case TUESDAY:
                System.out.println("It's Tuesday. Keep going!");
                break;
            case WEDNESDAY:
                System.out.println("It's Wednesday. Halfway through!");
                break;
            case THURSDAY:
                System.out.println("It's Thursday. Almost there!");
                break;
            case FRIDAY:
                System.out.println("It's Friday. Weekend is coming!");
                break;
            case SATURDAY:
                System.out.println("It's Saturday. Enjoy the weekend!");
                break;
            case SUNDAY:
                System.out.println("It's Sunday. Relax and recharge!");
                break;
            default:
                System.out.println("Invalid day!");
        }
    }
}

