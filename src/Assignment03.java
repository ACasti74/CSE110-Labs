import java.util.Scanner;

/**
 * Author: Alejandro Castillo
 * FileName: Assignment03.java
 * Specification: Automatic Stock Trader.
 * For: CSE 110 - Assignment03
 * Time Spent: 120 Minutes
 */

public class Assignment03 {
    public static void main(String[] args)
    {
        Scanner keyboard =new Scanner(System.in);

        int currentShares;
        int purchasePrice;
        int marketPrice;
        int availablefunds;
        int transactionFee = 10;

        System.out.println("Current Shares: ");
        currentShares = keyboard.nextInt();

        System.out.println("Purchase Price: ");
        purchasePrice = keyboard.nextInt();

        System.out.println("Market Price: ");
        marketPrice = keyboard.nextInt();

        System.out.println("Available Funds: ");
        availablefunds = keyboard.nextInt();

        if((purchasePrice- marketPrice) > 0)
        {
            int numberOfSharesToBuy = (int)Math.floor((availablefunds- transactionFee) / marketPrice);
            int totalBuyCost = 10+(marketPrice * numberOfSharesToBuy);
            if(totalBuyCost == 10)
                System.out.println("Hold Shares");
            else if(totalBuyCost == availablefunds|| totalBuyCost != 10)
            {
                System.out.println("Buy "+ numberOfSharesToBuy + " shares");
            }
        }
        else if( (purchasePrice - marketPrice) < 0)
        {
            int perShareSellValue = marketPrice - purchasePrice;
            int totalSellValue = perShareSellValue * currentShares;
            int numberOfSharesToSell = totalSellValue - transactionFee;
            if(numberOfSharesToSell ==0)
            {
                System.out.println("Hold Shares");
            }
            else
            {
                System.out.println("Sell "+ numberOfSharesToSell +" Shares");
            }
        }
    }
}
