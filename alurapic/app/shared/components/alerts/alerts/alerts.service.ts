import { Injectable } from '@angular/core';
import { Subject } from 'rxjs';
import { Alert } from './alert';
import { AlertType } from './alert';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class AlertsService {

  constructor( private router: Router ){}

  alertSubject: Subject<Alert> = new Subject<Alert>();

  success( message:string ){
    this.alert(AlertType.SUCCESS, message);
    this.router.navigateByUrl('/home');
  }

  warning( message:string ){
    this.alert(AlertType.WARNING, message);
  }
  danger( message:string ){
    this.alert(AlertType.DANGER, message);
  }
  info( message:string ){
    this.alert(AlertType.INFO, message);
  }

  alert(alertType: AlertType, message: string){
    this.alertSubject.next(new Alert(alertType, message));
  }

  getAlert(){
    return this.alertSubject.asObservable();
  }
}