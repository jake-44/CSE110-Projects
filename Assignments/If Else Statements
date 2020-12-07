/*------------------------------------------------------------
// AUTHOR: JACOB BELL <ID #1218096321>
// FILENAME: Assignment03.java
// SPECIFICATION: Automatic Stock Trader
// FOR: CSE 110 - <Class #83311> Assignment #3
// TIME SPENT: 4 Hours //-----------------------------------------------------------*/

import java.util.Scanner;

public class Assignment03 {
	public static void main(String[] args) 
	{
			
		// Declaring Input Variables and Scanner Declaration
		Scanner scanner = new Scanner( System.in );
		int current_shares;
		int purchase_price;
		int market_price;
		int available_funds;
		
		// Asking User for Four Inputs
		System.out.println( "Current Shares : " );
		current_shares = scanner.nextInt();
		
		System.out.println( "Purchase Price : " );
		purchase_price = scanner.nextInt();
		
		System.out.println( "Market Price   : " );
		market_price = scanner.nextInt();
		
		System.out.println( "Available Funds: " );
		available_funds = scanner.nextInt();
		
		scanner.close();
		
		// Declaring Output Variables
		int num_shares_buy;
		int value_per_sell;
		int value_per_buy;
		int total_buy_value;
		int total_sell_value;
		
		// Initializing Variables 
		num_shares_buy = (int)Math.floor((available_funds - 10) / market_price);
		value_per_buy = (purchase_price - market_price);
		total_buy_value = (value_per_buy * num_shares_buy); 
		value_per_sell = (market_price - purchase_price);
		total_sell_value = (value_per_sell * current_shares);
		
		// Buying Computations 
		if ( market_price < purchase_price ) 
		{
			
			// Enough Funds to Cover Fee
			if ( available_funds > 10 ) 
			{
				if ( num_shares_buy >= 1 ) 
				{
				System.out.println();
				System.out.println("Buy " + num_shares_buy + " shares");
				System.out.println("Rationale: After paying the $10 transaction fee, there are enough funds remaining to buy " + num_shares_buy + " shares. At a purchase price vs. market price difference of $" + value_per_buy + " per share, our " + num_shares_buy + " shares represent a value gain of $" + total_buy_value + " dollars, which is $" + (total_buy_value - 10) + " more than the $10 transaction fee - so we come out $" + (total_buy_value - 10) + " ahead.");
				}
			}
			
			// No Funds to Cover Transaction Fee
			else 
			{
			System.out.println();
			System.out.println("Hold shares");
			System.out.println("Rationale: Even though the current market price is very low (compared to the purchase price), after paying the $10 transaction fee, we would not have any funds left to buy shares; so we can only hold.");
			}	
		}
		
		// Selling Computations 
		if ( market_price > purchase_price ) 
		{
			
			// Outputs For 1 Share
			if ( current_shares == 1 )
			{
				
				// No Profit
				if ((current_shares * purchase_price) == (market_price - 10)) 
				{
				System.out.println();
				System.out.println("Hold shares");
				System.out.println("Rationale: Selling our " + current_shares + " share for $" + ( current_shares * market_price ) + " will leave us with just $" + (( current_shares * market_price ) - 10 ) + " after we pay the $10 transaction fee. That is the same as what we paid for it, and we won't make any profit - so we should hold.");
				}
				
				// Selling 1 Share
				else if ((current_shares * purchase_price) < (market_price - 10))
				{
				System.out.println();
				System.out.println("Sell " + current_shares + " share");
				System.out.println("Rationale: Our " + current_shares + " share is worth $" + total_sell_value + " more than we paid for it at the current market price. The $" + total_sell_value + " dollars obtained by selling that share now will still leave us with a profit of $" + ( total_sell_value - 10 ) + " after paying the $10 transaction fee. Profit is profit, so we should sell.");
				}
			}
			
			// All Profitable Sales With More Than 1 Share
			else if ((current_shares * market_price) - 10 > (current_shares * purchase_price)) 
				{
				System.out.println();
				System.out.println("Sell " + current_shares + " shares");
				System.out.println("Rationale: With a market price vs. purchase price difference of $" + value_per_sell + " per share, we stand to make $" + total_sell_value + " from the sale of our " + current_shares + " shares. This is $" + ( total_sell_value - 10 ) + " more than the price of the transaction fee, so we will come out $" + ( total_sell_value - 10 ) + " ahead - therefore we should sell all " + current_shares + " shares.");	
				}
		}
	}
}

			
		

