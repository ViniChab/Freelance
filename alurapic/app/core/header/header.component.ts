import { Component } from '@angular/core';
import { UserService } from '../user/user.service';
import { Observable } from 'rxjs';
import { User } from '../user/user';
import { Router } from '@angular/router';

@Component({
    selector: 'app-header',
    templateUrl: './header.component.html',
    styleUrls: ['./header.component.css'] 
})

export class HeaderComponent{

    //dólar indica que ele vai guardar observable
    user$: Observable<User>;

    constructor(private userService: UserService,
    private router: Router){
        this.user$ = userService.getUser();
    }

    logout(){
        this.userService.logout();
        this.router.navigateByUrl('');
    }
}