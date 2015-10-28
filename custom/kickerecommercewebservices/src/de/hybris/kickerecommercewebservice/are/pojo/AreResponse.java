/**
 *
 */
package de.hybris.kickerecommercewebservice.are.pojo;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;


/**
 * @author gaurav.asthana
 *
 */
public class AreResponse implements Serializable
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	@JsonProperty
	List<Result> result;

	@JsonIgnore
	public List<Result> getResult()
	{
		return result;
	}

	public void setResult(final List<Result> result)
	{
		this.result = result;
	}

}
