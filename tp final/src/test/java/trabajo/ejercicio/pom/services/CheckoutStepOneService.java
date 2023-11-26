package trabajo.ejercicio.pom.services;

import trabajo.ejercicio.DriverActions;
import trabajo.ejercicio.pom.pages.CheckoutStepOnePage;

public class CheckoutStepOneService {
    private CheckoutStepOnePage checkoutStepOnePage;

    public CheckoutStepOneService(){
        this.checkoutStepOnePage = new CheckoutStepOnePage();
    }

    public void completedForm(String firstName, String lastName, String zipPostalCode){
        DriverActions.insertText(this.checkoutStepOnePage.getTxt_first_name(), firstName);
        DriverActions.insertText(this.checkoutStepOnePage.getTxt_last_name(), lastName);
        DriverActions.insertText(this.checkoutStepOnePage.getTxt_zip_code(), zipPostalCode);
    }

    public void stepOnecontinue(){
        DriverActions.click(this.checkoutStepOnePage.getBtn_continue());
    }
}
