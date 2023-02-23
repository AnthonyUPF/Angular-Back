package com.ironhack.demosecurityjwt.services.SchoolClassService.SchoolClassServiceInterface;

import com.ironhack.demosecurityjwt.models.SchoolClassModel.SchoolClass;

import java.util.List;

public interface SchoolClassServiceInterface {

    List<SchoolClass> getAllSchoolClasses();

    SchoolClass addSchoolClass(SchoolClass schoolClass);

    void deleteSchoolClass(Integer classId);

}
