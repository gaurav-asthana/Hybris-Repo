/**
 * 
 */
package de.hybris.kickerecommerce.jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;


public interface JaxbContextFactory
{
	public JAXBContext createJaxbContext(Class... classes) throws JAXBException;
}
