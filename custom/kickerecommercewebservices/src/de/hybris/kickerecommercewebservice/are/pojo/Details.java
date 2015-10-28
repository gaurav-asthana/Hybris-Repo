/**
 *
 */
package de.hybris.kickerecommercewebservice.are.pojo;

import java.io.Serializable;


/**
 * @author kumar.shubham.misra
 *
 */
public class Details implements Serializable
{


	private static final long serialVersionUID = 3137872094658468439L;

	private String maxOffers;

	public String getMaxOffers()
	{
		return maxOffers;
	}

	public void setMaxOffers(final String maxOffers)
	{
		this.maxOffers = maxOffers;
	}

	@Override
	public String toString()
	{
		return "Details Pojo [maxOffers = " + maxOffers + "]";
	}
}
