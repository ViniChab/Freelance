import { NgModule } from '@angular/core';
import { PhotoFormComponent } from './photo-form.component';
import { CommonModule } from '@angular/common';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { VMessageModule } from '../../shared/components/vmessage/vmessage.module';
import { RouterModule } from '@angular/router';
import { PhotoModule } from '../photo/photo.module';
import { PhotoListModule } from '../photo-list/photo-list.module';
import { AlertsModule } from '../../shared/components/alerts/alerts/alerts.module';

@NgModule({
    declarations: [PhotoFormComponent],
    imports: [ 
    CommonModule,
    ReactiveFormsModule,
    VMessageModule,
    FormsModule,
    RouterModule,
    PhotoModule,
    PhotoListModule,
    FormsModule,
    ReactiveFormsModule,
    VMessageModule,
    AlertsModule  ]
})
export class PhotoFormModule { }