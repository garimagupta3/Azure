/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.digitaltwins.v2020_10_31;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.digitaltwins.v2020_10_31.implementation.DigitalTwinsEndpointsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing DigitalTwinsEndpoints.
 */
public interface DigitalTwinsEndpoints extends SupportsCreating<DigitalTwinsEndpointResource.DefinitionStages.Blank>, HasInner<DigitalTwinsEndpointsInner> {
    /**
     * Get DigitalTwinsInstances Endpoint.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param resourceName The name of the DigitalTwinsInstance.
     * @param endpointName Name of Endpoint Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DigitalTwinsEndpointResource> getAsync(String resourceGroupName, String resourceName, String endpointName);

    /**
     * Get DigitalTwinsInstance Endpoints.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param resourceName The name of the DigitalTwinsInstance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DigitalTwinsEndpointResource> listAsync(final String resourceGroupName, final String resourceName);

    /**
     * Delete a DigitalTwinsInstance endpoint.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param resourceName The name of the DigitalTwinsInstance.
     * @param endpointName Name of Endpoint Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String resourceName, String endpointName);

}
