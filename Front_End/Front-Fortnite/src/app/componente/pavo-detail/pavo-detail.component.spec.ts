import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PavoDetailComponent } from './pavo-detail.component';

describe('PavoDetailComponent', () => {
  let component: PavoDetailComponent;
  let fixture: ComponentFixture<PavoDetailComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PavoDetailComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PavoDetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
