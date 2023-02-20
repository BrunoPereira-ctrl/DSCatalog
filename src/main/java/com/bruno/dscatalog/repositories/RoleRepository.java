package com.bruno.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bruno.dscatalog.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
