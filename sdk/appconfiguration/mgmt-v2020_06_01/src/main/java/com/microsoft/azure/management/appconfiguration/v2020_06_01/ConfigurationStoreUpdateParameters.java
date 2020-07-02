/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appconfiguration.v2020_06_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The parameters for updating a configuration store.
 */
@JsonFlatten
public class ConfigurationStoreUpdateParameters {
    /**
     * The encryption settings of the configuration store.
     */
    @JsonProperty(value = "properties.encryption")
    private EncryptionProperties encryption;

    /**
     * The managed identity information for the configuration store.
     */
    @JsonProperty(value = "identity")
    private ResourceIdentity identity;

    /**
     * The SKU of the configuration store.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /**
     * The ARM resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get the encryption settings of the configuration store.
     *
     * @return the encryption value
     */
    public EncryptionProperties encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption settings of the configuration store.
     *
     * @param encryption the encryption value to set
     * @return the ConfigurationStoreUpdateParameters object itself.
     */
    public ConfigurationStoreUpdateParameters withEncryption(EncryptionProperties encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Get the managed identity information for the configuration store.
     *
     * @return the identity value
     */
    public ResourceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the managed identity information for the configuration store.
     *
     * @param identity the identity value to set
     * @return the ConfigurationStoreUpdateParameters object itself.
     */
    public ConfigurationStoreUpdateParameters withIdentity(ResourceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the SKU of the configuration store.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the SKU of the configuration store.
     *
     * @param sku the sku value to set
     * @return the ConfigurationStoreUpdateParameters object itself.
     */
    public ConfigurationStoreUpdateParameters withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the ARM resource tags.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the ARM resource tags.
     *
     * @param tags the tags value to set
     * @return the ConfigurationStoreUpdateParameters object itself.
     */
    public ConfigurationStoreUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

}