class Solution {
    public String intToRoman(int num) {
        int length = (num + "").length();
        int remainder = 0;
        String roman = "";
        if (length == 2 && num < 50) {
            roman = roman + "X";
            num = num/10;
            findDigit(num);
        }
        if (length == 2) {
            roman = roman + "L";
            num = num/10;
            findDigit(num);
        }

        if (length == 3 && num < 500) {
            roman = roman + "C";
            num = num/100;
            findDigit(num);
        }

        if (length == 3 && num > 500) {
            roman = roman + "X";
            num =  num/100;
            findDigit(num);
        }

        return roman;

    }
    public static String findDigit(int num,int remainder, String roman) {
        while (num != 0) {
            remainder = num % 10;
            if (remainder == 1) roman = roman + "I";
            else    if (remainder == 2) roman = roman + "II";
            else    if (remainder == 3) roman = roman + "III";
            else    if (remainder == 4) roman = roman + "IV";
            else     if (remainder == 5) roman = roman + "V";
            else      if (remainder == 6) roman = roman + "VI";
            else    if (remainder == 7) roman = roman + "VII";
            else    if (remainder == 8) roman = roman + "VIII";
            else   if (remainder == 9) roman = roman + "IX";
            else  if (remainder == 0) roman = roman + "X";
            num = num / 10;
        }
        return roman;
    }
}