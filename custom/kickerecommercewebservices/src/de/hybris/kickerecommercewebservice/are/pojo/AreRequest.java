/**
 *
 */
package de.hybris.kickerecommercewebservice.are.pojo;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonTypeName;


/**
 * @author gaurav.asthana
 *
 */
@JsonTypeName
public class AreRequest implements Serializable
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty
	private String accountName;

	@JsonProperty
	private String customerKey;

	@JsonProperty
	private List<Items> items;

	@JsonProperty
	private Context context;

	@JsonIgnore
	public String getAccountName()
	{
		return accountName;
	}

	public void setAccountName(final String accountName)
	{
		this.accountName = accountName;
	}

	@JsonIgnore
	public String getCustomerKey()
	{
		return customerKey;
	}

	public void setCustomerKey(final String customerKey)
	{
		this.customerKey = customerKey;
	}

	@JsonIgnore
	public List<Items> getItems()
	{
		return items;
	}

	public void setItems(final List<Items> items)
	{
		this.items = items;
	}

	@JsonIgnore
	public Context getContext()
	{
		return context;
	}

	public void setContext(final Context context)
	{
		this.context = context;
	}

}
