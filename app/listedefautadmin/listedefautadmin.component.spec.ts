import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListedefautadminComponent } from './listedefautadmin.component';

describe('ListedefautadminComponent', () => {
  let component: ListedefautadminComponent;
  let fixture: ComponentFixture<ListedefautadminComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListedefautadminComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListedefautadminComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
