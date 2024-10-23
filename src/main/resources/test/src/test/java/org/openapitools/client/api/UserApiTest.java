/*
 * Lendismart API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v2.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.Error;
import java.time.OffsetDateTime;
import org.openapitools.client.model.User;
import org.openapitools.client.model.UserApiSearchResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserApi
 */
@Disabled
public class UserApiTest {

    private final UserApi api = new UserApi();

    /**
     * Creates a new user
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createUserTest() throws ApiException {
        User user = null;
        User response = api.createUser(user);
        // TODO: test validations
    }

    /**
     * Retrieves user information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserTest() throws ApiException {
        String id = null;
        User response = api.getUser(id);
        // TODO: test validations
    }

    /**
     * Patches a user
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void patchUserTest() throws ApiException {
        String id = null;
        User user = null;
        User response = api.patchUser(id, user);
        // TODO: test validations
    }

    /**
     * Search users information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchUserTest() throws ApiException {
        Integer page = null;
        Integer pageSize = null;
        String pageToken = null;
        String usernameStartsWith = null;
        OffsetDateTime createdBefore = null;
        OffsetDateTime createdAfter = null;
        List<String> stateIn = null;
        UserApiSearchResponse response = api.searchUser(page, pageSize, pageToken, usernameStartsWith, createdBefore, createdAfter, stateIn);
        // TODO: test validations
    }

    /**
     * Updates a user
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateUserTest() throws ApiException {
        String id = null;
        User user = null;
        User response = api.updateUser(id, user);
        // TODO: test validations
    }

}