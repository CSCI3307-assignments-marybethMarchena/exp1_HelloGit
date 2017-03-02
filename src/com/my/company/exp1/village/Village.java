/**
 * 
 */
package com.my.company.exp1.village;

import com.my.company.exp1.village.HasVillagers;

/**
 * @author MaryBeth
 *
 */
public class Village implements HasVillagers, GrowingVillage
{
	private int numOfVillagers;
	
	//constructor
	public Village(int numOfVillagers)
	{
		this.numOfVillagers = numOfVillagers;
	}

	//HasVillagers
	@Override
	public int countOfVillagers() 
	{
		// TODO Auto-generated method stub
		return numOfVillagers;
	}

	//GrowingVillage
	@Override
	public int addVillagers(int addedVillagers) 
	{
		numOfVillagers += addedVillagers;
		return numOfVillagers;
	}

}
