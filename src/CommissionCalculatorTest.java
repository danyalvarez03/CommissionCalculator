
/*
 * File: CommissionCalculatorTest.java
 * 
 * Programmer: Daniel A. Alvarez
 */

/**
 * Computes the sales commission for each salesperson
 */
import javax.swing.JOptionPane;

public class CommissionCalculatorTest 
{

    
    public static void main(String[] args) 
    {
        String salespersonName = JOptionPane.showInputDialog("Enter salesperson's name:");
        String sales = JOptionPane.showInputDialog("Enter monthly sales:");
        String years = JOptionPane.showInputDialog("Enter years of service:");
        String rank = JOptionPane.showInputDialog("Enter rank of the salesperson: 1 for Apprentice, 2 for Junior, and 3 for Senior");
        
        double monthlySales = Double.parseDouble(sales);
        int serviceYears = Integer.parseInt(years);
        
        CommissionCalculator CommissionCalculator = new CommissionCalculator (salespersonName, monthlySales, serviceYears, rank);
        
        System.out.printf(CommissionCalculator.getVarValues());
        System.out.printf("The sales commission is: $%.2f%n", CommissionCalculator.getSalesCommission());
        System.out.printf("The years of service commission is: $%.2f%n", CommissionCalculator.getYearsCommission());
        System.out.printf("The rank commission is: $%.2f%n", CommissionCalculator.getRankCommission());
        System.out.printf("The total commission is: $%.2f%n", CommissionCalculator.getTotalCommission());
    }
    
}
