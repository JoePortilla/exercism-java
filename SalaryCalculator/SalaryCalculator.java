package SalaryCalculator;

public class SalaryCalculator {
    public double multiplierPerDaysSkipped(int daysSkipped) {
        double multiplier = 1;
        multiplier = daysSkipped <= 5 ? 1 : 0.85;
        return multiplier;
    }

    public int multiplierPerProductsSold(int productsSold) {
        int multiplier = 1;
        multiplier = productsSold <= 20 ? 10 : 13;
        return multiplier;
    }

    public double bonusForProductSold(int productsSold) {
        double bonus = 0;
        bonus = productsSold * multiplierPerProductsSold(productsSold);
        return bonus;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = 0.0;
        salary = (1000.0 * multiplierPerDaysSkipped(daysSkipped)) + bonusForProductSold(productsSold);
        salary = salary <= 2000.0 ? salary : 2000.0;
        return salary;
    }

    public static void main(String[] args) {
        SalaryCalculator salary = new SalaryCalculator();
        System.out.println(salary.multiplierPerDaysSkipped(0));
        System.out.println(salary.multiplierPerProductsSold(25));
        System.out.println(salary.bonusForProductSold(3));
        System.out.println(salary.finalSalary(7, 50));
    }

}
