package epam.clean_code1_simple_and_compound_interest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

interface Interest
{
	public double calculate(double amount,double time,double rate_of_interest);
}
class Simple_Interest implements Interest
{
	public static final Logger LOGGER=LogManager.getLogger(Simple_Interest.class);
	public double calculate(double amount,double time,double rate_of_interest)
	{
		LOGGER.info("in Simple_Interest calculate method");
		return (amount*time*rate_of_interest)/100;
		
	}
}
class Compound_Interest implements Interest
{
	public static final Logger LOGGER=LogManager.getLogger(Compound_Interest.class);
	public double calculate(double amount,double time,double rate_of_interest)
	{
		LOGGER.info("in Compound_Interest calculate method");
		double total_amount=amount * (Math.pow((1 + rate_of_interest / 100), time));
		return total_amount-amount;
		
		
	}
}
