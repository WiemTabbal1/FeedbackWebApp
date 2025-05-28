import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListeutilisateurComponent } from './listeutilisateur.component';

describe('ListeutilisateurComponent', () => {
  let component: ListeutilisateurComponent;
  let fixture: ComponentFixture<ListeutilisateurComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListeutilisateurComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListeutilisateurComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
