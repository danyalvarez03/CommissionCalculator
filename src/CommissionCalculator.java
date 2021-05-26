/*
 * File: CommissionCalculator.java
 * 
 * Programmer: Daniel A. Alvarez
 */

/**
 * Computes the sales commission for each salesperson
 */
public class CommissionCalculator 
{
    private String workerName;
    private double monthlySales;
    private int serviceYears;
    private String rank;
    
    public CommissionCalculator(String workerName, double monthlySales, int serviceYears, String rank)
    {
        this.workerName = workerName;
        this.monthlySales = monthlySales;
        this.serviceYears = serviceYears;
        this.rank = rank;
    }
    
    public String getVarValues()
    {
        String values = "Name of Worker: " + workerName + 
                        String.format("%nMonthly Sales: $%.2f", monthlySales) +
                        "%nService years: " + serviceYears +
                        "%nRank: " + rank + "%n";
        return values;
    }
    
    public double getSalesCommission()
    {
        if(monthlySales >= 100000 && monthlySales <= 200000)
        {
            return monthlySales * 0.02;
        }
        else if(monthlySales <= 300000)
        {
            return monthlySales * 0.025;
        }
        else if(monthlySales <= 400000)
        {
            return monthlySales * 0.0275;
        }
        else if(monthlySales > 400000)
        {
            return monthlySales * 0.03;
        }
        else
        {
            return 0;
        }
    }
    
    public double getYearsCommission()
    {
        if(serviceYears <= 10)
        {
            return monthlySales * 0.001 * serviceYears;
        }
        else
        {
            return monthlySales * 0.01;
        }
    }
    
    public double getRankCommission()
    {
        if(rank.equals("1"))
        {
            return 0;
        }
        else if(rank.equals("2"))
        {
            return monthlySales * 0.03;
        }
        else
        {
            return monthlySales * 0.04;
        }
    }
    
    public double getTotalCommission()
    {
        return getSalesCommission() + getYearsCommission() + getRankCommission();
    }
}
