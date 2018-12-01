import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListPavoComponent } from './list-pavo.component';

describe('ListPavoComponent', () => {
  let component: ListPavoComponent;
  let fixture: ComponentFixture<ListPavoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListPavoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListPavoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
