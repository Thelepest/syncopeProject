package org.apache.syncope.common.rest.api.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.util.JSONPObject;
import netscape.javascript.JSObject;
import org.apache.syncope.core.persistence.api.entity.user.User;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

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
