public class Main {

    public static void main(String[] args) {
        // System.out.println(getQuarters("Dec"));
        System.out.println(getNatoAphabet('G'));
        System.out.println(getTraditionalNatoAphabet('K'));
        printDayOfWeek(9);
        printDayOfWeek(1);
    }

    public static String getQuarters(String month){
        return switch (month) {
            case "Jan", "Feb", "Mar" -> "1st quarter";
            case "Apr", "May", "Jun" -> "2nd quarter";
            case "Jul", "Aug", "Sep" -> "3rd quarter";
            case "Oct", "Nov", "Dec" -> "4th quarter";
            default -> "Invalid month";
        };
    }

    public static String getNatoAphabet(char letter){
        return switch (letter){
            case 'A' -> "Able";
            case 'B' -> "Baker";
            case 'C' -> "Charlie";
            case 'D' -> "Dog";
            case 'E' -> "Easy";
            default -> "Not found";
        };
    }

    public static String getTraditionalNatoAphabet(char letter){
        switch (letter){
            case 'A': return "Able";
            case 'B': return "Baker";
            case 'C': return "Charlie";
            case 'D': return "Dog";
            case 'E': return "Easy";
            default: return "Not found";
        }
    }

    public static void printDayOfWeek(int day){

        String dayOfWeek =  switch(day){
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Invalid Day";
        };

        System.out.println("Day " + day + " is " + dayOfWeek);

    }

    public static void printWeekDay(int day){

        String dayOfWeek;

        if(day == 0){
            dayOfWeek = "Sunday";
        } else if (day == 1) {
            dayOfWeek = "Monday";
        } else if (day == 2) {
            dayOfWeek = "Tuesday";
        } else if (day == 3) {
            dayOfWeek = "Wednesday";
        } else if (day == 4) {
            dayOfWeek = "Thursday";
        } else if (day == 5) {
            dayOfWeek = "Friday";
        } else if (day == 6) {
            dayOfWeek = "Saturday";
        } else{
            dayOfWeek = "Invalid Day";
        }

        System.out.println("Day " + day + " is " + dayOfWeek);

    }
}
