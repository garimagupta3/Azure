/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.authorization.v2015_07_01.implementation;

import com.microsoft.azure.management.authorization.v2015_07_01.ClassicAdministratorProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Classic Administrators.
 */
public class ClassicAdministratorInner {
    /**
     * The ID of the administrator.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The name of the administrator.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The type of the administrator.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Properties for the classic administrator.
     */
    @JsonProperty(value = "properties")
    private ClassicAdministratorProperties properties;

    /**
     * Get the ID of the administrator.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the ID of the administrator.
     *
     * @param id the id value to set
     * @return the ClassicAdministratorInner object itself.
     */
    public ClassicAdministratorInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name of the administrator.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the administrator.
     *
     * @param name the name value to set
     * @return the ClassicAdministratorInner object itself.
     */
    public ClassicAdministratorInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type of the administrator.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type of the administrator.
     *
     * @param type the type value to set
     * @return the ClassicAdministratorInner object itself.
     */
    public ClassicAdministratorInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get properties for the classic administrator.
     *
     * @return the properties value
     */
    public ClassicAdministratorProperties properties() {
        return this.properties;
    }

    /**
     * Set properties for the classic administrator.
     *
     * @param properties the properties value to set
     * @return the ClassicAdministratorInner object itself.
     */
    public ClassicAdministratorInner withProperties(ClassicAdministratorProperties properties) {
        this.properties = properties;
        return this;
    }

}
