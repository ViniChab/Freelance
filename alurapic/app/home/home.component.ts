import { Component } from '@angular/core';
import { Title } from '../../../node_modules/@angular/platform-browser';

@Component({
    templateUrl: '/home.component.html',
    styleUrls: ['./home.component.css']
})
 
export class HomeComponent{
     
    constructor( private titleService: Title ) { }

    ngOnInit(): void {}
}