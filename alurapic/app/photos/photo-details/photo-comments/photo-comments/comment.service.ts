import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { NewComment } from './NewComment';

const API_URL = "http://localhost:3000";

@Injectable({ providedIn: 'root'})
export class CommentService {

    constructor(private http: HttpClient) {}

    signup(id: number, newComment: NewComment) {
        return this.http.post(API_URL + '/p/' + id , newComment);
    }
}