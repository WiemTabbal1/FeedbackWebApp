import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { FormsModule } from '@angular/forms';
import { HomeComponent } from './home/home.component';
import { MenuComponent } from './menu/menu.component';

import { AdministrateurComponent } from './administrateur/administrateur.component';
import { ListedefautComponent } from './listedefaut/listedefaut.component';
import { RegisteradminComponent } from './registeradmin/registeradmin.component';
import { HomeadminComponent } from './homeadmin/homeadmin.component';
import { ListeutilisateurComponent } from './listeutilisateur/listeutilisateur.component';
import { ListedefautadminComponent } from './listedefautadmin/listedefautadmin.component';
import { TableaudebordComponent } from './tableaudebord/tableaudebord.component';



@NgModule({
  declarations: [
    AppComponent,
    RegisterComponent,
    LoginComponent,
    HomeComponent,
  
    MenuComponent,
    ListedefautComponent,
    AdministrateurComponent,
    RegisteradminComponent,
    HomeadminComponent,
    ListeutilisateurComponent,
    ListedefautadminComponent,
    TableaudebordComponent
    
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
   
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
