import { Component, OnInit, Input } from '@angular/core';
import { AlertsService } from './alerts.service';
import { Alert, AlertType } from './alert';

@Component({
  selector: 'app-alerts',
  templateUrl: './alerts.component.html',
  styleUrls: ['./alerts.component.css']
})
export class AlertsComponent implements OnInit {
  
  ngOnInit() {
  }


  @Input() timeout = 3000;
  alerts: Alert[] = [];

  constructor( private alertsService: AlertsService ) {
    this.alertsService.getAlert()
    .subscribe( alert => {
      if (!alert){
        this.alerts = [];
        return;
      }
      this.alerts.push(alert);
      setTimeout(() => this.removeAlert(alert), this.timeout);
    })
  }

  removeAlert(alertToRemove: Alert) {
    this.alerts = this.alerts.filter( alert => alert != alertToRemove);
  }

  getAlertClass( alert:Alert ) {
    if (!alert) return '';

    switch( alert.alertType ){
      case AlertType.DANGER:
        return 'alert alert-danger';
      case AlertType.INFO:
        return 'alert alert-info';
      case AlertType.SUCCESS:
        return 'alert alert-success';
      case AlertType.WARNING:
        return 'alert alert-warning';
    }
  }

}
