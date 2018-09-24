import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { PhotoService } from '../photo/photo.service';
import { Router } from '@angular/router';
import { AlertsService } from '../../shared/components/alerts/alerts/alerts.service';
import { Title } from '@angular/platform-browser';
import { HttpEvent, HttpEventType } from '@angular/common/http';
import { finalize } from 'rxjs/operators';

@Component({
  selector: 'ap-photo-form',
  templateUrl: './photo-form.component.html',
  styleUrls: ['./photo-form.component.css']
})
export class PhotoFormComponent implements OnInit {

  photoForm: FormGroup;
  file: File;
  preview: string;
  percent: number;

  constructor(
    private formBuilder: FormBuilder,
    private photoService: PhotoService,
    private router: Router,
    private alertService: AlertsService,
    private titleService: Title
  ) { }

  ngOnInit() {
    this.titleService.setTitle('Alurapic - Upload');
    this.photoForm = this.formBuilder.group({
      file: ['', 
      Validators.required],

      description: ['', 
      [Validators.maxLength(400),
      Validators.required]
    ],

      allowComments: [true]
    });
  }

  upload(){
    const description = this.photoForm.get('description').value;
    const AllowComments = this.photoForm.get('allowComments').value;
    this.photoService.upload(description, AllowComments, this.file)
    .pipe(finalize(() => {this.router.navigateByUrl('');}))
    .subscribe( (event: HttpEvent<any>) => 
    {
      if (event.type == HttpEventType.UploadProgress){
        this.percent = Math.round(100 * event.loaded  / event.total )
      }else if(event.type == HttpEventType.Response){
      this.alertService.success("WHOO, photo uploaded!");
      }
    },
    err =>
    {
      console.log(err);
      this.alertService.warning('Upload failed');
    });
  }

  handleFile(file: File){

    this.file = file;
    const reader = new FileReader();
    reader.onload = (event: any) => this.preview = event.target.result; 
    reader.readAsDataURL(file); //isso joga a imagem em base 64
  }

  redirect()
  {
      this.router.navigateByUrl('home');
  }
}
