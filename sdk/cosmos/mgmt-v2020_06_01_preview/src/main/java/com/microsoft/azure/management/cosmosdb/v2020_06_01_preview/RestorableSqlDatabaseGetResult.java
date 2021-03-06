/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_06_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.implementation.RestorableSqlDatabaseGetResultInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.implementation.CosmosDBManager;
import java.util.Map;

/**
 * Type representing RestorableSqlDatabaseGetResult.
 */
public interface RestorableSqlDatabaseGetResult extends HasInner<RestorableSqlDatabaseGetResultInner>, HasManager<CosmosDBManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the identity value.
     */
    ManagedServiceIdentity identity();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the resource value.
     */
    RestorableSqlDatabasePropertiesResource resource();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

}
