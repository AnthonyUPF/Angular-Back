package com.ironhack.demosecurityjwt.controllers.SchoolClassController;

import com.ironhack.demosecurityjwt.models.SchoolClassModel.SchoolClass;
import com.ironhack.demosecurityjwt.services.SchoolClassService.SchoolClassService;
import com.ironhack.demosecurityjwt.services.SchoolClassService.SchoolClassServiceInterface.SchoolClassServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/schoolClasses")
public class SchoolClassController implements SchoolClassServiceInterface {

    @Autowired
    SchoolClassService schoolClassService;
    @Override
    @GetMapping("/getAllSchoolClasses")
    @CrossOrigin
    @ResponseStatus(HttpStatus.OK)
    public List<SchoolClass> getAllSchoolClasses() {
        return schoolClassService.getAllSchoolClasses();
    }

    @Override
    @PostMapping("/addSchoolClass")
    @CrossOrigin
    public SchoolClass addSchoolClass(@RequestBody SchoolClass schoolClass) {
        return schoolClassService.addSchoolClass(schoolClass);
    }

    @Override
    @DeleteMapping("/deleteSchoolClass")
    @CrossOrigin
    @ResponseStatus(HttpStatus.OK)
    public void deleteSchoolClass(@RequestParam Integer classId) {
        schoolClassService.deleteSchoolClass(classId);
    }
}
