/**
 *
 */
package com.acc.platform.addons.kickerrecomaddon.component.renderer;


import de.hybris.platform.addonsupport.renderer.impl.DefaultAddOnCMSComponentRenderer;
import de.hybris.platform.commercefacades.product.data.ProductData;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.jsp.PageContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.acc.platform.addons.kickerrecomaddon.facade.KickerRecomComponentFacade;
import com.acc.platform.addons.kickerrecomaddon.model.KickerRecomComponentModel;


public class KickerRecomComponentRenderer<C extends KickerRecomComponentModel> extends DefaultAddOnCMSComponentRenderer<C>
{

	@Autowired
	private KickerRecomComponentFacade kickerrecomcomponentFacade;

	private String productID;

	@Override
	protected Map<String, Object> getVariablesToExpose(final PageContext pageContext, final C component)
	{
		final ServletRequest request = pageContext.getRequest();
		final String productID = (String) request.getAttribute("productCode");
		this.setProductID(productID);
		final Map<String, Object> variables = new HashMap<String, Object>();
		List<ProductData> products = null;
		products = collectLinkedProducts();

		if (null != products && products.size() < 0)
		{
			variables.put("norecommendation", de.hybris.platform.util.Config.getParameter("kickerrecomaddon.norecommendation"));
		}
		variables.put("title", de.hybris.platform.util.Config.getParameter("kickerrecomaddon.title"));
		variables.put("recomendedProducts", products);

		return variables;
	}

	private List<ProductData> collectLinkedProducts()
	{

		return kickerrecomcomponentFacade.getBrowsedProductList(this.getProductID());
	}

	//getter
	public String getProductID()
	{
		return productID;
	}

	//setter
	public void setProductID(final String productID)
	{
		this.productID = productID;
	}
}
