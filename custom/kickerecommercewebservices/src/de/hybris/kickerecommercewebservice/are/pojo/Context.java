package de.hybris.kickerecommercewebservice.are.pojo;

import java.io.Serializable;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonTypeName;


@JsonTypeName("context")
public class Context implements Serializable
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty
	private Map<String, String> details;

	@JsonProperty
	private String name;

	@JsonIgnore
	public Map<String, String> getDetails()
	{
		return details;
	}

	public void setDetails(final Map<String, String> details)
	{
		this.details = details;
	}

	public String getName()
	{
		return name;
	}

	public void setName(final String name)
	{
		this.name = name;
	}

}
