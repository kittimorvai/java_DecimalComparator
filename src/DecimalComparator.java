public class DecimalComparator {
    public static void main(String[] args) {

        boolean areTheyEqual = areEqualByThreeDecimalPlaces(3.1756, 3.175);
        System.out.println(areTheyEqual);
    }

    public static boolean areEqualByThreeDecimalPlaces (double firstNumber, double secondNumber) {

        firstNumber = (int) (firstNumber * 1000d);
        secondNumber= (int) (secondNumber * 1000d);


        if (firstNumber == secondNumber) {
            return true;
        }
        return false;
    }
}
