package com.ironhack.demosecurityjwt.services.SchoolClassService;

import com.ironhack.demosecurityjwt.models.SchoolClassModel.SchoolClass;
import com.ironhack.demosecurityjwt.repositories.SchoolClassRepository.SchoolClassRepository;
import com.ironhack.demosecurityjwt.services.SchoolClassService.SchoolClassServiceInterface.SchoolClassServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolClassService implements SchoolClassServiceInterface {
    @Autowired
    SchoolClassRepository schoolClassRepository;

    @Override
    public List<SchoolClass> getAllSchoolClasses() {
        return schoolClassRepository.findAll();
    }

    @Override
    public SchoolClass addSchoolClass(SchoolClass schoolClass) {
        return schoolClassRepository.save(schoolClass);
    }

    @Override
    public void deleteSchoolClass(Integer classId) {
        SchoolClass schoolClass=schoolClassRepository.findById(classId).get();
        schoolClassRepository.delete(schoolClass);
    }
}
