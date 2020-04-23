package com.softtech.library_service.repository;

import com.softtech.library_service.model.Resource;
import org.springframework.data.repository.CrudRepository;

public interface ResourceRepository extends CrudRepository<Resource, Long> {
}
