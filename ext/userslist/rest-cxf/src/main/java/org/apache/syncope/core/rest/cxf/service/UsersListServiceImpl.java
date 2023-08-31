package org.apache.syncope.core.rest.cxf.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.apache.syncope.common.rest.api.service.UsersListService;
import org.apache.syncope.core.logic.UsersListLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersListServiceImpl extends AbstractServiceImpl implements UsersListService {

    @Autowired
    private UsersListLogic logic;

    @Override
    public String getAllUsers() throws JsonProcessingException {
        return logic.getAllUsers();
    }
}
