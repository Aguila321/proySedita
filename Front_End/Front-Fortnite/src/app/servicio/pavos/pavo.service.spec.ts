import { TestBed } from '@angular/core/testing';

import { PavoService } from './pavo.service';

describe('PavoService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: PavoService = TestBed.get(PavoService);
    expect(service).toBeTruthy();
  });
});
