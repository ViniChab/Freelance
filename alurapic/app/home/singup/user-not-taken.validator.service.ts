import { Injectable } from '@angular/core';
import { AbstractControl } from '@angular/forms';
import { SignUpService } from './signup.service';

import { debounceTime, switchMap, map, first, tap } from 'rxjs/operators';

@Injectable({ providedIn: 'root'})
export class UserNotTakenValidatorService { //criando aqui o validador

    constructor(private signUpService: SignUpService) {}
    //chamando o construtor e criando uma variável do tipo signupservice

    checkUserNameTaken() { //função pra checar

        return (control: AbstractControl) => {
            return control
                .valueChanges
                .pipe(debounceTime(300)) //espera terminar de digitar
                .pipe(switchMap(userName => 
                        this.signUpService.checkUserNameTaken(userName) //joga lá na função
                ))
                .pipe(map(isTaken => isTaken ? { userNameTaken: true } : null))
                .pipe(tap(r => console.log(r)))
                .pipe(first());
        }
    }
}