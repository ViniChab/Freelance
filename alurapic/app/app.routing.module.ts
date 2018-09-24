import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { PhotoListComponent } from './photos/photo-list/photo-list.component';
import { PhotoFormComponent } from './photos/photo-form/photo-form.component';
import { NotFoundComponent } from './errors/not-found/not-found.component';
import { PhotoListResolver } from './photos/photo-list/photo-list.resolver';
import { HomeComponent } from './home/home.component';
import { AuthGuard } from './core/auth/auth.guard';
import { SignInComponent } from './home/signin/signin.component';
import { SignUpComponent } from './home/singup/singup.component';
import { PhotoDetailsComponent } from './photos/photo-details/photo-details/photo-details.component';
import { GlobalErrorComponent } from './errors/global-error/global-error.component';

const routes: Routes = [
    
    { 
        path: '', 
        pathMatch: 'full', //isso garante que é a rota inteira, são só um pedaço
        redirectTo: 'home'
    },
    { 
        path: 'home',
        component: HomeComponent,
        canActivate: [AuthGuard],
        children: 
        [
            { 
                path: '',
                component: SignInComponent
            },    
            { 
                path: 'register', 
                component: SignUpComponent
            } 
        ]
    },
    {
        path: 'home',
        loadChildren: './home/home.module#homeModule'
    },
    { 
        path: 'user/:userName', 
        component: PhotoListComponent,
        resolve: {
            photos: PhotoListResolver
        }
    },
    { 
        path: 'p/add', 
        component: PhotoFormComponent 
    },
    { 
        path: 'p/:id', //se a rota te, dois pontos, ela é parametrizada, ou seja, varia
        component: PhotoDetailsComponent
    },
    { 
        path: '**', 
        redirectTo: 'not-found'
    },
    { 
        path: 'not-found', 
        component: NotFoundComponent 
    },
    { 
        path: 'error', 
        component: GlobalErrorComponent,
    } 
];

@NgModule({
    imports: [ 
        RouterModule.forRoot(routes) 
    ],
    exports: [ RouterModule ]
})
export class AppRoutingModule { }

