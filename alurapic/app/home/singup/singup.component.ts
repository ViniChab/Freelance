import { Component, OnInit, ViewChild, ElementRef } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { UserNotTakenValidatorService } from './user-not-taken.validator.service';
import { NewUser } from './new-user';
import { SignUpService } from './signup.service';
import { Router } from '@angular/router';
import { USValidator } from './UP.validator';

@Component({
    templateUrl: './signup.component.html',
    styleUrls: ['./signup.component.css']
})
export class SignUpComponent implements OnInit {
    
    signupForm: FormGroup;
    
    @ViewChild('emailInput') email_input: ElementRef;
    
    constructor(
        private formBuilder: FormBuilder,
        private userNotTakenValidatorService: UserNotTakenValidatorService,
        private signUpService: SignUpService,
        private router: Router) {}

    ngOnInit(): void {
        this.signupForm = this.formBuilder.group({
            email: ['', 
                [
                    Validators.required,
                    Validators.email
                ]
            ],
            fullName: ['', 
                [
                    Validators.required,
                    Validators.minLength(2),
                    Validators.maxLength(40)
                ]
            ],
            userName: ['', 
                [
                    Validators.required,
                    Validators.minLength(2),
                    Validators.maxLength(30)
                ],
                this.userNotTakenValidatorService.checkUserNameTaken()
            ],
            password: ['', 
                [
                    Validators.required,
                    Validators.minLength(8),
                    Validators.maxLength(14)
                ]
            ]
        }, {
           validator: USValidator 
        });
        
        this.email_input.nativeElement.focus();
    } 

    signup() {

       // if( !this.signupForm.invalid && !this.signupForm.pending ){ 
           //um exemplo de como seria se eu quisesse validar na submissão

        const newUser = this.signupForm.getRawValue() as NewUser;
        this.signUpService
            .signup(newUser)
            .subscribe(
                () => this.router.navigate(['']),
                err => console.log(err)
            );
    }
}