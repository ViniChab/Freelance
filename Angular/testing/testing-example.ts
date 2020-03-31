describe("ForgotPasswordComponent", () => {
  let component: ForgotPasswordComponent;
  let fixture: ComponentFixture<ForgotPasswordComponent>;
  let baseService: BaseService;
  let formService: FormService;
  let debugElement: DebugElement;
  let baseServiceSpy;
  let formServiceSpy;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [
        SharedModule,
        FormsModule,
        ReactiveFormsModule,
        RouterModule,
        AppModule
      ],
      providers: [BaseService, FormService]
    }).compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ForgotPasswordComponent);
    component = fixture.componentInstance;
    debugElement = fixture.debugElement;
    baseService = debugElement.injector.get(BaseService);
    formService = debugElement.injector.get(FormService);

    baseServiceSpy = spyOn(baseService, "get").and.returnValue(
      new Promise((resolve, reject) => {
        resolve({
          allowUsersLoginWithPersonalPassword: true
        });
      })
    );
    fixture.detectChanges();
  });

  it("should create", () => {
    expect(component).toBeTruthy();
  });

  it("should start send button animation", () => {
    component.sendAnimation = false;
    component.toggleSendAnimation();
    expect(component.sendAnimation).toEqual(true);
  });

  it("should stop send button animation", () => {
    component.sendAnimation = true;
    component.toggleSendAnimation();
    expect(component.sendAnimation).toEqual(false);
  });

  it("should be a valid e-mail", () => {
    formServiceSpy = spyOn(formService, "validateEmail").and.returnValue(true);
    component.invalidEmail = true;
    let email = document.createElement("input");
    email.value = "teste@fluig.coom";
    component.validateEmail(email);
    expect(component.invalidEmail).toEqual(false);
  });

  it("should be an invalid e-mail", () => {
    formServiceSpy = spyOn(formService, "validateEmail").and.returnValue(false);
    component.invalidEmail = false;
    let email = document.createElement("input");
    email.value = "aaaaaaaaaaaaaaaa";
    component.validateEmail(email);
    expect(component.invalidEmail).toEqual(true);
  });

  it("submit should be valid", () => {
    component.isPasswordChangeEnabled = true;
    component.captchaResolved = true;
    formServiceSpy = spyOn(formService, "validateEmail").and.returnValue(true);
    component.email.nativeElement = document.createElement("input");
    component.email.nativeElement.value = "teste@fluig.coom";
    component.fgtPswForm.controls["email"].setErrors(null);
    expect(component.isSubmmitValid()).toEqual(true);
  });

  it("submit should be invalid 01", () => {
    component.isPasswordChangeEnabled = false;
    component.captchaResolved = true;
    formServiceSpy = spyOn(formService, "validateEmail").and.returnValue(true);
    component.email.nativeElement = document.createElement("input");
    component.email.nativeElement.value = "teste@fluig.coom";
    component.fgtPswForm.controls["email"].setErrors(null);
    expect(component.isSubmmitValid()).toEqual(false);
  });

  it("submit should be invalid 02", () => {
    component.isPasswordChangeEnabled = true;
    component.captchaResolved = false;
    formServiceSpy = spyOn(formService, "validateEmail").and.returnValue(true);
    component.email.nativeElement = document.createElement("input");
    component.email.nativeElement.value = "teste@fluig.coom";
    component.fgtPswForm.controls["email"].setErrors(null);
    expect(component.isSubmmitValid()).toEqual(false);
  });

  it("submit should be invalid 03", () => {
    component.isPasswordChangeEnabled = true;
    component.captchaResolved = true;
    formServiceSpy = spyOn(formService, "validateEmail").and.returnValue(false);
    component.email.nativeElement = document.createElement("input");
    component.email.nativeElement.value = "aaaaaaaaaaaa";
    component.fgtPswForm.controls["email"].setErrors(null);
    expect(component.isSubmmitValid()).toEqual(false);
  });

  it("submit should be invalid 04", () => {
    component.isPasswordChangeEnabled = true;
    component.captchaResolved = true;
    formServiceSpy = spyOn(formService, "validateEmail").and.returnValue(true);
    component.email.nativeElement = document.createElement("input");
    component.email.nativeElement.value = "teste@fluig.coom";
    component.fgtPswForm.controls["email"].setErrors({ incorrect: true });
    expect(component.isSubmmitValid()).toEqual(false);
  });
});
