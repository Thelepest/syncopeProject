package org.apache.syncope.common.rest.api.service;

import com.fasterxml.jackson.core.JsonProcessingException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * REST operations for get the whole users list.
 */
@Path("users/all")
public interface UsersListService extends JAXRSService {

    /**
     * Retrieve a list with all the users
     *
     *
     */
    @GET
    String getAllUsers() throws JsonProcessingException;
}
