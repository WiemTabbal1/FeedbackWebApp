import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { HomeComponent } from './home/home.component';
import { HomeadminComponent } from './homeadmin/homeadmin.component';
import { MenuComponent } from './menu/menu.component';

import { ListedefautComponent } from './listedefaut/listedefaut.component';
import { ListedefautadminComponent } from './listedefautadmin/listedefautadmin.component';
import { ListeutilisateurComponent } from './listeutilisateur/listeutilisateur.component';
import { AdministrateurComponent } from './administrateur/administrateur.component';
import { RegisteradminComponent } from './registeradmin/registeradmin.component';
import { TableaudebordComponent } from './tableaudebord/tableaudebord.component';


const routes: Routes = [
  {
  
    path: '',
    component: MenuComponent,
    },
  
  
  {
  path: 'home',
  component: HomeComponent,
  
  },
  {
    path: 'homeadmin',
    component: HomeadminComponent,
    
    },
  {
    path: 'listedefaut',
    component: ListedefautComponent,
    
    },
    {
      path: 'listedefautadmin',
      component: ListedefautadminComponent,
      
      },
    {
      path: 'listeutilisateur',
      component: ListeutilisateurComponent,
      
      },

  {
  
    path: 'administrateur',
    component:AdministrateurComponent,
  },
  {
  
  path: 'register',
  component: RegisterComponent,
  },
  {
  
    path: 'registeradmin',
    component: RegisteradminComponent,
    },
    {
  
      path: 'tableaudebord',
      component: TableaudebordComponent,
      },
  {
    path: 'login',
    component: LoginComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
