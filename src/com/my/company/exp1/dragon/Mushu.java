/**
 * 
 */
package com.my.company.exp1.dragon;

import com.my.company.exp1.village.Village;

/**
 * @author MaryBeth
 *
 */
public class Mushu implements Dragon {

	/* (non-Javadoc)
	 * @see com.my.company.exp1.dragon.Dragon#breathsFire()
	 */
	@Override
	public boolean breathsFire() 
	{
		return true;
	}

	/* (non-Javadoc)
	 * @see com.my.company.exp1.dragon.Dragon#canFly()
	 */
	@Override
	public Boolean canFly() 
	{
		return new Boolean(false);
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
