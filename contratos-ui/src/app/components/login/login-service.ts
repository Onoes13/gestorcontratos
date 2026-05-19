import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class LoginService {

  user: any;
  pass: any;
  comprobar(){
    if (this.user==='noelia' && this.pass==='1234'){
      alert('Correcto');
    }      else{
      alert('Mal');
    }

  }





}
