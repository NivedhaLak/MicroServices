import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template :`<div style="text-align:center">
  <h1>
    {{title}}
  </h1>
  <app-home-page></app-home-page>
 
</div>`,
  styleUrls: ['./app.component.css'],
  
})
export class AppComponent {
  title : string = 'Welcome to home page from ts hello select';
}
