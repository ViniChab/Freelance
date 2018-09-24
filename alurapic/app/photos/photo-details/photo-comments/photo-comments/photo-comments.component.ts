import { Component, OnInit, Input, ViewChild, ElementRef } from '@angular/core';
import { Observable } from 'rxjs';
import { PhotoComment } from '../../../photo/photo-comment';
import { PhotoService } from '../../../photo/photo.service';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import {  Router } from '@angular/router';
import { switchMap, tap } from 'rxjs/operators';

@Component({
  selector: 'app-photo-comments',
  templateUrl: './photo-comments.component.html',
  styleUrls: ['./photo-comments.component.css']
})
export class PhotoCommentsComponent implements OnInit {

  @Input()  id: number;
  comment$: Observable<PhotoComment[]>;
 
  commentForm: FormGroup;
    
  constructor
  (
    private photoService: PhotoService,
    private formBuilder: FormBuilder,
    private router: Router
  ) {} 

  ngOnInit() 
  {
    this.comment$ = this.photoService.getComments(this.id);

    this.commentForm = this.formBuilder.group
    ({
        comment: ['', 
            [
                Validators.required,
                Validators.maxLength(100)
            ]
        ],
    });
  } 
  save(){
    const comment = this.commentForm.get("comment").value as string;
    this.comment$ = this.photoService.comment(this.id, comment)
    .pipe(switchMap(()=> this.photoService.getComments(this.id)))
    .pipe(tap(()=>{
      this.commentForm.reset();
    }))}
}
