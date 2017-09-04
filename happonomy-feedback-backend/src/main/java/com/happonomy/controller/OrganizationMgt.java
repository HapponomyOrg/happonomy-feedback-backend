package com.happonomy.controller;

import com.happonomy.common.WSPath;
import com.happonomy.common.enums.Status;
import com.happonomy.dto.OrganizationRequest;
import com.happonomy.model.Organization;
import com.happonomy.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Rest API for managing organizations
 * Created by Kithmal on 9/4/17.
 */
@RequestMapping(WSPath.ORGANIZATION)
@RestController
public class OrganizationMgt {

    @Autowired
    OrganizationRepository organizationRepository;

    @RequestMapping(path = WSPath.ORGANIZATION_SAVE, method = RequestMethod.POST)
    @ResponseBody
    public void save(@RequestBody OrganizationRequest request) {

        Organization org = new Organization();
        org.setOrgId(Long.valueOf(request.getId()));
        org.setAddress(request.getAddress());
        org.setName(request.getName());
        org.setStatus(Status.ACTIVE);
        org.setCreatedDate(new Date());
        organizationRepository.save(org);
    }


}
