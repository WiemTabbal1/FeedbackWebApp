import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListedefautComponent } from './listedefaut.component';

describe('ListedefautComponent', () => {
  let component: ListedefautComponent;
  let fixture: ComponentFixture<ListedefautComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListedefautComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListedefautComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
