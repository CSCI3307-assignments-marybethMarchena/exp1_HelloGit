/**
 * 
 */
package com.mycompany.exp1;

import com.my.company.exp1.dragon.Dragon;
import com.my.company.exp1.dragon.Mushu;
import com.my.company.exp1.dragon.Spyro;
import com.my.company.exp1.village.Village;

/**
 * @author MaryBeth
 *
 */
public class MainEntry {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Village village2eat = new Village(2);
		
		Dragon dragonMushu = new Mushu();
		Dragon dragonSpyro = new Spyro(village2eat);

	}

}
