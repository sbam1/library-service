package com.softtech.library_service.repository;

import com.softtech.library_service.model.BorrowResource;
import org.springframework.data.repository.CrudRepository;

public interface BorrowRepository extends CrudRepository<BorrowResource, Long> {
}
