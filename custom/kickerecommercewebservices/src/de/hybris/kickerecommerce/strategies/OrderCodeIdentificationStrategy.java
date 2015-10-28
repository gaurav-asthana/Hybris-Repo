package de.hybris.kickerecommerce.strategies;


/**
 * Strategy for identifying is given string is GUID.
 */
public interface OrderCodeIdentificationStrategy {
    boolean isID(String potentialId);
}
