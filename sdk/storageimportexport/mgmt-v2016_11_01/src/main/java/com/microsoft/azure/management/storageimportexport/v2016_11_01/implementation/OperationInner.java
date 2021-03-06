/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storageimportexport.v2016_11_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Describes a supported operation by the Storage Import/Export job API.
 */
@JsonFlatten
public class OperationInner {
    /**
     * Name of the operation.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The resource provider name to which the operation belongs.
     */
    @JsonProperty(value = "display.provider")
    private String provider;

    /**
     * The name of the resource to which the operation belongs.
     */
    @JsonProperty(value = "display.resource")
    private String resource;

    /**
     * The display name of the operation.
     */
    @JsonProperty(value = "display.operation")
    private String operation;

    /**
     * Short description of the operation.
     */
    @JsonProperty(value = "display.description")
    private String description;

    /**
     * Get name of the operation.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the operation.
     *
     * @param name the name value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the resource provider name to which the operation belongs.
     *
     * @return the provider value
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set the resource provider name to which the operation belongs.
     *
     * @param provider the provider value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get the name of the resource to which the operation belongs.
     *
     * @return the resource value
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set the name of the resource to which the operation belongs.
     *
     * @param resource the resource value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the display name of the operation.
     *
     * @return the operation value
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set the display name of the operation.
     *
     * @param operation the operation value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get short description of the operation.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set short description of the operation.
     *
     * @param description the description value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withDescription(String description) {
        this.description = description;
        return this;
    }

}
