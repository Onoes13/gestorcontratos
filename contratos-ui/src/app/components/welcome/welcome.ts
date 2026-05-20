import {Component} from '@angular/core';
import {Button} from 'primeng/button';
import {Router} from '@angular/router';
import {Persona} from '../../models/persona';
import {CommonModule} from '@angular/common';

@Component({
  selector: 'app-welcome',
  imports: [
    Button, CommonModule
  ],
  templateUrl: './welcome.html',
  styleUrl: './welcome.css',
})
export class Welcome {
  listaPersonas: Persona[] = [
    new Persona('Daniela', '5 años', 'Madrid'),
    new Persona('Radha', '44 años', 'Guadalajara'),
    new Persona('Noelia', '40 años', 'Montevideo')
  ];

  constructor(private router: Router) {
  }

  volver() {

    this.router.navigate(['/login']);
  }
}
