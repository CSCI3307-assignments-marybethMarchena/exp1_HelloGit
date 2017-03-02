/**
 * 
 */
package com.my.company.exp1.dragon;

import com.my.company.exp1.village.Village;

/**
 * @author MaryBeth
 *
 */
public class Spyro extends Mushu
{
	private Village village2eat;
	public Spyro(Village village2eat)
	{
		this.village2eat = village2eat;
	}
	
	/* (non-Javadoc)
	 * @see com.my.company.exp1.dragon.Dragon#eatVillage(com.my.company.exp1.village.Village)
	 */
	@Override
	public boolean eatVillage(Village village) 
	{
		return false;
	}

}
