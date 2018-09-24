import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { tap, observeOn } from 'rxjs/operators';
import { UserService } from '../user/user.service';

const API_URL = 'http://localhost:3000';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(
    private http: HttpClient,
    private UserService: UserService) { }

  authenticate(userName: string, password: string) {

    return this.http
      .post(
        API_URL + '/user/login', 
        { userName, password },
        { observe: 'response'} ) //esse observe vai pegar as entradas como respostas e jogar no pipe
        .pipe(tap(res =>{

          const authToken = res.headers.get('x-access-token'); 
          //a ideia do pipe é encriptar um token pra saber se ele ta logado
          //a partir daqui o token é gerado quando o caboclo loga

          this.UserService.setToken(authToken);

          window.localStorage.setItem("authToken", authToken);
          //assim, ele guarda o token no cache

        }))
  }
}