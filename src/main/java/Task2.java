public class Task2 {

    public String convertToRomanNumber(int year) {

        if (year <= 0 || year > 3999){
            return "Wrong year provided.";
        }

        int[] decimalNumbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanNumbers = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder romanBuilder = new StringBuilder();

        for (int i = 0; i < decimalNumbers.length; i++) {
            while (year >= decimalNumbers[i]) {
                year = year - decimalNumbers[i];
                romanBuilder.append(romanNumbers[i]);
            }
        }

        return romanBuilder.toString();
    }
}