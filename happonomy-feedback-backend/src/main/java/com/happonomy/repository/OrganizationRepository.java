package com.happonomy.repository;

import com.happonomy.model.Organization;
import org.springframework.data.repository.CrudRepository;

/**
 * Data persistence Level
 * Created by Kithmal on 9/4/17.
 */
public interface OrganizationRepository extends CrudRepository<Organization, Long> {
}
