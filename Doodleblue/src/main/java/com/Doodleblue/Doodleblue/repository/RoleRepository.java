package com.Doodleblue.Doodleblue.repository;

import com.Doodleblue.Doodleblue.models.ERole;
import com.Doodleblue.Doodleblue.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByName(ERole name);
}
