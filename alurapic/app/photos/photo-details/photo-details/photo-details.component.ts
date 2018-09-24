import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { PhotoService } from '../../photo/photo.service';
import { Photo } from '../../photo/photo';
import { Observable } from 'rxjs';
import { PhotoComment } from '../../photo/photo-comment';
import { AlertsService } from '../../../shared/components/alerts/alerts/alerts.service';
import { Title } from '@angular/platform-browser';
import * as $ from 'jquery';

@Component({
  selector: 'app-photo-details',
  templateUrl: './photo-details.component.html',
  styleUrls: ['./photo-details.component.css']
})
export class PhotoDetailsComponent implements OnInit {

  photo$: Observable<Photo>;
  comment$: Observable<PhotoComment[]>;
  id: any;

  constructor( 
    private route: ActivatedRoute,
    private photoService : PhotoService,
    private router: Router,
    private alertService: AlertsService,
    private titleService: Title ) { }

    ngOnInit(): void {
      this.titleService.setTitle('Alurapic - View');
      this.id = this.route.snapshot.params.id;
      this.photo$ = this.photoService.findById(this.id);
      this.photo$.subscribe(()=> {}, err => {
        this.router.navigateByUrl('not-found');
      } )
  }

  areYouSure()
  {
    $('div#sure').show([2000]);
  }

  reload()
  {
    $('div#sure').hide();
  }

  remove()
  {
    this.photoService.removePhoto(this.id)
    .subscribe(()=> 
    {
      this.alertService.success("Photo removed!");
      this.router.navigateByUrl(""), { replaceUrl: true }
    },
    err => {
      this.alertService.warning("You can't remove this picture!");
      console.log(err);
    })
  }

  idPhoto: String;

  like(photo: Photo) 
  {
    this.photoService
        .like(photo.id)
        .subscribe(liked => {
          if(liked) {
              this.photo$ = this.photoService.findById(photo.id);
          }
      });
    }
}