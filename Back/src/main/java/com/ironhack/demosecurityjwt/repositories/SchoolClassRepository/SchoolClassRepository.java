package com.ironhack.demosecurityjwt.repositories.SchoolClassRepository;


import com.ironhack.demosecurityjwt.models.SchoolClassModel.SchoolClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SchoolClassRepository extends JpaRepository<SchoolClass,Integer> {






}
