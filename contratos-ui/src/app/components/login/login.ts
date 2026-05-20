import {Component} from '@angular/core';
import {FormsModule} from '@angular/forms';
import {Button} from 'primeng/button';
import {InputText} from 'primeng/inputtext';
import {User} from '../../models/user';
import {Router} from '@angular/router';

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


  user: User = new User();

  constructor(private router: Router) {
  }

  comprobar() {
    if (this.user.name === 'noelia' && this.user.pass === '1234') {
      this.router.navigate(['/welcome']);
    } else {
      alert('Mal');
    }

  }

}
