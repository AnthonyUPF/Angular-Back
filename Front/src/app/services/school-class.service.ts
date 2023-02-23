import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import {SchoolClass} from '../models/school-class';



@Injectable({
  providedIn: 'root'
})


export class SchoolClassService {
  private apiBaseUrl = 'http://localhost:8080/api/schoolClasses';

  constructor(private http: HttpClient) {}

  getSchoolClasses(): Observable<SchoolClass[]> {
    return this.http.get<SchoolClass[]>(this.apiBaseUrl+'/getAllSchoolClasses');
  }

  addSchoolClass(schoolClass: SchoolClass): Observable<SchoolClass> {
    return this.http.post<SchoolClass>(this.apiBaseUrl+'/addSchoolClass', schoolClass);
  }
}