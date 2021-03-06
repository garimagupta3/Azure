/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.network.v2020_08_01.implementation.VirtualHubRouteTableV2sInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing VirtualHubRouteTableV2s.
 */
public interface VirtualHubRouteTableV2s extends SupportsCreating<VirtualHubRouteTableV2.DefinitionStages.Blank>, HasInner<VirtualHubRouteTableV2sInner> {
    /**
     * Retrieves the details of a VirtualHubRouteTableV2.
     *
     * @param resourceGroupName The resource group name of the VirtualHubRouteTableV2.
     * @param virtualHubName The name of the VirtualHub.
     * @param routeTableName The name of the VirtualHubRouteTableV2.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualHubRouteTableV2> getAsync(String resourceGroupName, String virtualHubName, String routeTableName);

    /**
     * Retrieves the details of all VirtualHubRouteTableV2s.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualHubRouteTableV2> listAsync(final String resourceGroupName, final String virtualHubName);

    /**
     * Deletes a VirtualHubRouteTableV2.
     *
     * @param resourceGroupName The resource group name of the VirtualHubRouteTableV2.
     * @param virtualHubName The name of the VirtualHub.
     * @param routeTableName The name of the VirtualHubRouteTableV2.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String virtualHubName, String routeTableName);

}
