import { TestBed } from '@angular/core/testing';

import { ListedefautService } from './listedefaut.service';

describe(' ListedefautService ', () => {
  let service:  ListedefautService ;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject( ListedefautService );
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
