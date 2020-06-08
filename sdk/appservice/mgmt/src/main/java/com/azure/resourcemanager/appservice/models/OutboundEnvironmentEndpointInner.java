// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.EndpointDependency;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The OutboundEnvironmentEndpoint model. */
@Fluent
public final class OutboundEnvironmentEndpointInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OutboundEnvironmentEndpointInner.class);

    /*
     * The type of service accessed by the App Service Environment, e.g., Azure
     * Storage, Azure SQL Database, and Azure Active Directory.
     */
    @JsonProperty(value = "category")
    private String category;

    /*
     * The endpoints that the App Service Environment reaches the service at.
     */
    @JsonProperty(value = "endpoints")
    private List<EndpointDependency> endpoints;

    /**
     * Get the category property: The type of service accessed by the App Service Environment, e.g., Azure Storage,
     * Azure SQL Database, and Azure Active Directory.
     *
     * @return the category value.
     */
    public String category() {
        return this.category;
    }

    /**
     * Set the category property: The type of service accessed by the App Service Environment, e.g., Azure Storage,
     * Azure SQL Database, and Azure Active Directory.
     *
     * @param category the category value to set.
     * @return the OutboundEnvironmentEndpointInner object itself.
     */
    public OutboundEnvironmentEndpointInner withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Get the endpoints property: The endpoints that the App Service Environment reaches the service at.
     *
     * @return the endpoints value.
     */
    public List<EndpointDependency> endpoints() {
        return this.endpoints;
    }

    /**
     * Set the endpoints property: The endpoints that the App Service Environment reaches the service at.
     *
     * @param endpoints the endpoints value to set.
     * @return the OutboundEnvironmentEndpointInner object itself.
     */
    public OutboundEnvironmentEndpointInner withEndpoints(List<EndpointDependency> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (endpoints() != null) {
            endpoints().forEach(e -> e.validate());
        }
    }
}