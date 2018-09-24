import { NgModule } from "@angular/core";
import { PhotoDetailsComponent } from "./photo-details.component";
import { CommonModule } from "@angular/common";
import { RouterModule } from "@angular/router";
import { ReactiveFormsModule } from "@angular/forms";
import { PhotoCommentsComponent } from '../photo-comments/photo-comments/photo-comments.component';
import { PhotoModule } from '../../photo/photo.module';
import { ShowIfLoggedModule } from '../../../shared/directives/show-if-logged/show-if-logged.module';
import { VMessageModule } from '../../../shared/components/vmessage/vmessage.module';

@NgModule({
    declarations: [
        PhotoDetailsComponent,
        PhotoCommentsComponent
    ],
    exports: [
        PhotoDetailsComponent, 
        PhotoCommentsComponent
    ],
    imports: [
        CommonModule,
        PhotoModule,
        RouterModule,
        ReactiveFormsModule,
        VMessageModule,
        ShowIfLoggedModule
    ]
})
export class PhotoDetailsModule { }