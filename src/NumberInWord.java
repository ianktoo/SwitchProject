public class NumberInWord {

    public static void main(String[] args) {

    }

    public static void printNumberInWord(int number) {

        String numberInWords = switch (number){
          case 0 -> "ZERO";
          case 1 -> "ONE";
          case 2 -> "TWO";
          case 3 -> "THREE";
          case 4 -> "FOUR";
          case 5 -> "FIVE";
          case 6 -> "SIX";
          case 7 -> "SEVEN";
          case 8 -> "EIGHT";
          case 9 -> "NINE";
          default -> "OTHER";
        };

        System.out.println(numberInWords);
    }


    public static boolean isLeapYear(int year) {
        // Check if within range
        if(year >= 1 && year <= 9999) {
            // Calculate the leap year
            if(year % 4 == 0){
                //check again
                if(year % 100 == 0){
                    //check again
                    return year % 400 == 0;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year){

        if(month < 1 || month > 12){
            return -1;
        }
        if(year < 1 || year > 9999){
            return -1;
        }
        return switch(month){
            case 1, 3, 5, 7,8, 10, 12 -> 31;
            case 2 -> {
                if(isLeapYear(year)){
                    yield 29;
                } else {
                    yield 28;
                }
            }
            case 4,6,9,11 -> 30;
            default -> -1;
        };
    }
}
