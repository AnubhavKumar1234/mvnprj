package Generic_Utitlity;

import java.util.Random;

public class Java_Utility 
{
	/**
	 * this method is used to generate random number and used with the data to make it unique
	 * and we can use that data for running our scripts multiple times
	 * @author anubhav
	 * @return
	 */
	public int getRandonNum()
	{
		Random ran=new Random();
		int ranNum = ran.nextInt(1000);
		return ranNum;
	}

}
