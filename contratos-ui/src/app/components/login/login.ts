import { Component } from '@angular/core';
import {FormsModule} from '@angular/forms';
import {LoginService} from './login-service';
import {Button} from 'primeng/button';
import {InputText} from 'primeng/inputtext';
@Component({
  selector: 'app-login',
  imports: [
    FormsModule,
    Button,
    InputText
  ],
  templateUrl: './login.html',
  styleUrl: './login.css',
})
export class Login {



  constructor(public loginService: LoginService) {
  }



}
