import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { SchoolClassComponent } from './components/school-class/school-class.component';


@NgModule({
  declarations: [
    AppComponent,
    SchoolClassComponent,
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
