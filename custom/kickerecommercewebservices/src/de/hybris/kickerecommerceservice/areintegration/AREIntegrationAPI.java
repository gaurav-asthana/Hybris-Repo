/**
 *
 */
package de.hybris.kickerecommerceservice.areintegration;

import de.hybris.kickerecommercewebservice.are.pojo.AreRequest;
import de.hybris.kickerecommercewebservice.are.pojo.AreResponse;
import de.hybris.kickerecommercewebservice.are.pojo.Context;
import de.hybris.kickerecommercewebservice.are.pojo.Items;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.web.client.RestTemplate;


/**
 * @author kumar.shubham.misra
 *
 */
public class AREIntegrationAPI
{
	private static final Logger LOG = Logger.getLogger(AREIntegrationAPI.class);

	public static final String ARE_HOST_URL = de.hybris.platform.util.Config
			.getParameter("kickercommercewebservice.thirdparty.url");

	public static AreResponse getUserRecomendationProdcuts(String customerKey, final String productId)
	{
		customerKey = de.hybris.platform.util.Config.getParameter("kickercommercewebservice.thirdparty.customerKey");
		final AreRequest areRequest = createRequest(customerKey, productId);
		final RestTemplate restTemplate = new RestTemplate();
		final AreResponse response = restTemplate.postForObject(ARE_HOST_URL, areRequest, AreResponse.class);
		return response;
	}


	private static AreRequest createRequest(final String customerKey, final String productId) // method to create request pojo
	{
		final AreRequest areRequest = new AreRequest();
		areRequest.setAccountName(de.hybris.platform.util.Config.getParameter("kickercommercewebservice.thirdparty.accountName"));
		areRequest.setCustomerKey(customerKey);
		final List<Items> itemsList = new ArrayList<Items>();
		final Items items = new Items();
		items.setId(productId);
		itemsList.add(items);
		areRequest.setItems(itemsList);
		final Context context = new Context();
		context.setName(de.hybris.platform.util.Config.getParameter("kickercommercewebservice.thirdparty.name"));
		final Map<String, String> details = new HashMap<String, String>();
		details.put("maxOffers", de.hybris.platform.util.Config.getParameter("kickercommercewebservice.thirdparty.maxOffers"));
		context.setDetails(details);
		areRequest.setContext(context);
		return areRequest;

	}


}
