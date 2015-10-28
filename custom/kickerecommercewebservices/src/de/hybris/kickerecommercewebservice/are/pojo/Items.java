/**
 *
 */
package de.hybris.kickerecommercewebservice.are.pojo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;


/**
 * @author gaurav.asthana
 *
 */
@JsonPropertyOrder("items")
public class Items implements Serializable
{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	@JsonProperty("id")
	private String id;

	/**
	 * @return the id
	 */
	@JsonIgnore
	public String getId()
	{
		return id;
	}

	/**
	 * @param id
	 *           the id to set
	 */
	public void setId(final String id)
	{
		this.id = id;
	}


}
