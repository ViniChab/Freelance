import { Component, OnInit, ElementRef, ViewChild } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { AuthService } from '../../core/auth/auth.service';
import { Router } from '@angular/router';
import { Title } from '../../../../node_modules/@angular/platform-browser';

@Component({
    templateUrl: './signin.component.html',
    styleUrls: ['./signin.component.css']
})
export class SignInComponent implements OnInit {
    
    loginForm: FormGroup;  //esse tipo vem do angular mesmo
    @ViewChild('userNameInput') username_input: ElementRef;
    /*esse viewchild vai receber informações do pai, esse elementeref é uma forma de evolver a fariavel
    no caso, ele ta recebendo a variável userNameInput, que tá no html*/

    constructor(
        private formBuilder: FormBuilder,
        private authService: AuthService,
        private Router: Router,
        private titleService: Title) { }
    //esse construtor é pra montar o formulário
    

    ngOnInit(): void {
        this.titleService.setTitle('Alurapic - Login');
        this.loginForm = this.formBuilder.group({
            userName: ['', Validators.required],  //validadores são bem auto explicativos
            password: ['', Validators.required]
        });
        this.username_input.nativeElement.focus();
    } 

    login() {
        var counter: number = 0;

        const userName = this.loginForm.get('userName').value; 
        //criando uma constante chamada username e pegando do loginform a entrada para username
        const password = this.loginForm.get('password').value;
        //mesma ideia

        this.authService //aqui vamos ter a autenticação
            .authenticate(userName, password) //dois parâmetros
            .subscribe( 
                () => this.Router.navigateByUrl('user/' + userName),
                err => {
                    console.log(err);  //para caso de erro
                    this.loginForm.reset();  //isso é pra limpar o formulário
                    this.username_input.nativeElement.focus();
                    //esse focus vai focar no child, que no caso é o input de username
                    alert('Invalid user name or password');
                }
            );
    }

    redirect()
    {
        this.Router.navigateByUrl('home/register');
    }

}