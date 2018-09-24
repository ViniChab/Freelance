import { ValidatorFn, FormGroup } from '../../../../node_modules/@angular/forms';

export const USValidator: ValidatorFn = (formGroup: FormGroup) => {

    const username = formGroup.get('userName').value;
    const password = formGroup.get('password').value;

    return username!= password ? null : { USValidator: true };
}