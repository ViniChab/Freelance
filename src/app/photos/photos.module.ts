import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { PhotoComponent } from './photo/photo.component';

@NgModule({
  imports: [
    CommonModule
  ],
  declarations: [ PhotoComponent ],
  exports: [ PhotoComponent ]
})
export class PhotosModule { }

//esse modulo importa tudo relacionado a fotos, depois o app importa só esse módulo