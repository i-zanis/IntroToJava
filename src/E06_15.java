public class E06_15 {
    public static void main(String[] args) {
        System.out.printf("%-15s %-12s\n", "Taxable Income", "Single", "Yo");
        System.out.println(String.format("%20s", "").replace(' ', '-'));
        for (int i = 50000; i <= 70000; i += 100) {
            System.out.printf("%-15s %-12s\n",i, (int)computeTax(0,i));
        }
    }
    public static double computeTax(int status, double taxableIncome) {
        double tax = 0.0;
        if (status == 0) {
            if (taxableIncome <=8350)
                tax = taxableIncome * 0.10;
            else if (taxableIncome <=33950)
                tax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
            else if (taxableIncome <= 82250)
                tax = 8350 * 0.10 + (33950-8350) * 0.15 + (taxableIncome - 33950) * 0.25;
            else if (taxableIncome <= 171550)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (taxableIncome - 82250) * 0.28;

        }
        return tax;
    }
}
