import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent {

  isShown = false; //pra tipar como boolean

  toggle(){
    this.isShown = !this.isShown; //isso é pra inverter true/falso
  }

}
