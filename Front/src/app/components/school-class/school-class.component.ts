import { Component, OnInit } from '@angular/core';
import { SchoolClassService } from 'src/app/services/school-class.service';


@Component({
  selector: 'app-school-class',
  templateUrl: './school-class.component.html',
  styleUrls: ['./school-class.component.css']
})
export class SchoolClassComponent implements OnInit {

  constructor(private schoolClassService:SchoolClassService) { }

  ngOnInit(): void {
    this.getSchoolClasses()
  }

  getSchoolClasses(){
    this.schoolClassService.getSchoolClasses().subscribe(data=>{
      console.log(data);
    });
  }

}


