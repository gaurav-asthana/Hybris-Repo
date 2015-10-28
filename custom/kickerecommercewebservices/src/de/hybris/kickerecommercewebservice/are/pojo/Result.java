package de.hybris.kickerecommercewebservice.are.pojo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonTypeName;


@JsonTypeName("result")
public class Result implements Serializable
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty
	private String id;

	@JsonProperty
	private String score;


	@JsonIgnore
	public String getId()
	{
		return id;
	}

	public void setId(final String id)
	{
		this.id = id;
	}

	@JsonIgnore
	public String getScore()
	{
		return score;
	}

	public void setScore(final String score)
	{
		this.score = score;
	}


}
