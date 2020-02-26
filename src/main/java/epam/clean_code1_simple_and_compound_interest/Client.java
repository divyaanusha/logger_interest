package epam.clean_code1_simple_and_compound_interest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
class Client
{
	public static final Logger LOGGER=LogManager.getLogger(Client.class);
	public static void main(String args[])
	{
		
		Interest reference;
		LOGGER.info("reference created");
		reference=new Simple_Interest();
		LOGGER.info("referencing simple_interest objct");
		LOGGER.info("calling calculate of Simple_Interest object using reference");
		double simple_interest_calculated=reference.calculate(100000, 2, 10);
		System.out.println("simple interest calculated : "+Math.round(simple_interest_calculated));
		LOGGER.info("value returned from business logic and printed in console");
		reference=new Compound_Interest();
		LOGGER.info("referencing Compound_interest objct");
		LOGGER.info("calling calculate of Compound_Interest object using reference");
		double compound_interest_calculated=reference.calculate(100000, 2, 10);
		System.out.println("compound interest calculated : "+Math.round(compound_interest_calculated));
		LOGGER.info("value returned from business logic and printed in console");
	}
}