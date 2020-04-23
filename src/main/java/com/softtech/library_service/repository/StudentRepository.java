package com.softtech.library_service.repository;

import com.softtech.library_service.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
