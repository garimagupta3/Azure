// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.costmanagement.models.QueryColumn;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Result of query. It contains all columns listed under groupings and aggregation. */
@JsonFlatten
@Fluent
public class QueryResultInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(QueryResultInner.class);

    /*
     * The link (url) to the next page of results.
     */
    @JsonProperty(value = "properties.nextLink")
    private String nextLink;

    /*
     * Array of columns
     */
    @JsonProperty(value = "properties.columns")
    private List<QueryColumn> columns;

    /*
     * Array of rows
     */
    @JsonProperty(value = "properties.rows")
    private List<List<Object>> rows;

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> tags;

    /**
     * Get the nextLink property: The link (url) to the next page of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link (url) to the next page of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the QueryResultInner object itself.
     */
    public QueryResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the columns property: Array of columns.
     *
     * @return the columns value.
     */
    public List<QueryColumn> columns() {
        return this.columns;
    }

    /**
     * Set the columns property: Array of columns.
     *
     * @param columns the columns value to set.
     * @return the QueryResultInner object itself.
     */
    public QueryResultInner withColumns(List<QueryColumn> columns) {
        this.columns = columns;
        return this;
    }

    /**
     * Get the rows property: Array of rows.
     *
     * @return the rows value.
     */
    public List<List<Object>> rows() {
        return this.rows;
    }

    /**
     * Set the rows property: Array of rows.
     *
     * @param rows the rows value to set.
     * @return the QueryResultInner object itself.
     */
    public QueryResultInner withRows(List<List<Object>> rows) {
        this.rows = rows;
        return this;
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (columns() != null) {
            columns().forEach(e -> e.validate());
        }
    }
}
