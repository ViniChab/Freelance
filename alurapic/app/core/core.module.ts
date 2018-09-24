import { NgModule } from '@angular/core';
import { HeaderComponent } from './header/header.component';
import { CommonModule } from '@angular/common';
import { HTTP_INTERCEPTORS } from '@angular/common/http';
import { RequestInterceptor } from './auth/request.interceptor';
import { AlertsModule } from '../shared/components/alerts/alerts/alerts.module';
import { AlertsComponent } from '../shared/components/alerts/alerts/alerts.component';
import { LoadingModule } from '../shared/components/loading/loading.module';
import { MenuModule } from '../shared/components/menu/menu.module';
import { MenuComponent } from '../shared/components/menu/menu.component';

@NgModule({
    declarations: [ HeaderComponent ,
        AlertsComponent ],
    imports: 
    [ 
        CommonModule, 
        AlertsModule,
        LoadingModule,
        MenuModule
    ],
    exports: 
    [ 
        HeaderComponent,
        AlertsComponent,
        MenuComponent
    ],
    providers: [
        {
        provide: HTTP_INTERCEPTORS,
        useClass: RequestInterceptor,
        multi: true
        } //essa zoeira toda é pra enviar o token no command prompt
    ]
})

export class CoreModule{

}