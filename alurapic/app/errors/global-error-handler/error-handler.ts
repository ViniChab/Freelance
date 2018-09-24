import { ErrorHandler, Injectable, Injector } from '@angular/core';
import * as StackTrace from 'stacktrace-js';
import { LocationStrategy, PathLocationStrategy } from '@angular/common';
import { ServerLogService } from './server-log.service';
import { UserService } from '../../core/user/user.service';
import { Router } from '../../../../node_modules/@angular/router';

@Injectable()

export class GlobalErrorHandler implements ErrorHandler{

    constructor(private injector: Injector) {}

    handleError(error: any): void {
        
        const location = this.injector.get(LocationStrategy);
        const userService = this.injector.get(UserService);
        const serverLogService = this.injector.get(ServerLogService);
        const router = this.injector.get(Router);

        const url = location instanceof PathLocationStrategy 
        ? location.path() : '';

        console.log('handled')

        const message = error.message ? error.message : error.toString();

        router.navigate(['/error']);
        StackTrace
            .fromError(error)
            .then(stackFrames => 
                {
                    const Stack = stackFrames
                    .map(sf=> sf.toString())
                    .join('\n');
                    console.log(error);
                })
    }
}