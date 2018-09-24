import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';

import { Photo } from "./photo";
import { PhotoComment } from './photo-comment';
import { map, catchError, observeOn } from 'rxjs/operators';
import { of, throwError } from 'rxjs';
import { environment } from '../../../environments/environment';

const API = environment.ApiUrl;

@Injectable({ providedIn: 'root' })
export class PhotoService {

    constructor(private http: HttpClient) {}

    listFromUser(userName: string) {
        return this.http
            .get<Photo[]>(API + '/' + userName + '/photos');       
    }

    listFromUserPaginated(userName: string, page: number) {
        const params = new HttpParams()
            .append('page', page.toString());

        return this.http
            .get<Photo[]>(API + '/' + userName + '/photos', { params });       
    } 
    

    upload(description: string, AllowComments: boolean, file: File){ //como jogar as info na api
        //também existe um método upload em photo-form.component

        const formData = new FormData();
        formData.append("description", description); //pegando o description
        formData.append("allowComments", AllowComments ? 'true' : 'false'); //pra quando é boolean
        formData.append("imageFile", file); //pegando a foto
        return this.http.post(API + "/photos/upload", formData, 
        {
            observe: 'events',
            reportProgress: true // isso é pra barra de progresso
        });
    }

    findById(id: string){
        return this.http.get<Photo>(API + '/photos/' + id);
    }

    getComments(photoId: number) {
        return this.http.get<PhotoComment[]>(
                API + '/photos/' + photoId + '/comments'
        );
    }

    comment(id: number, commentText: string)
    {
        return this.http.post(
            API + "/photos/" + id + "/comments",
            { commentText } );
    }

    removePhoto(id: number)
    {
        return this.http.delete(API + "/photos/" + id);
    }

    like(photoId: number) {

        return this.http.post(
            API + '/photos/' + photoId + '/like', {}, { observe: 'response'}
        )
        .pipe(map(res => true))
        .pipe(catchError(err => {
            return err.status == '304' ? of(false) : throwError(err);
        }));
    }
}
