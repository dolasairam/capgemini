import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NodiaComponent } from './nodia.component';

describe('NodiaComponent', () => {
  let component: NodiaComponent;
  let fixture: ComponentFixture<NodiaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NodiaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NodiaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
