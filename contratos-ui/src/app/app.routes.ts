import {Routes} from '@angular/router';
import {Login} from './components/login/login';
import {Welcome} from './components/welcome/welcome';
import {Ajustes} from './components/ajustes/ajustes';

export const routes: Routes = [
  {path: '', component: Login},
  {path: 'login', component: Login},
  {path: 'welcome', component: Welcome},
  {path: 'ajustes', component: Ajustes}

];
