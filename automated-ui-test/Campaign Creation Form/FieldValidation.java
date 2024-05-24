public class FieldValidation {

    @Test
    public void testFieldValidation() {
        navigateToCampaignCreationPage();
        enterInvalidDataInFormFields();
        submitForm();
        Assert.assertTrue(validationMessagesDisplayed());
    }
    
    private void enterInvalidDataInFormFields() {
        // Code to enter invalid data in form fields
    }
    
    private void submitForm() {
        // Code to submit the form
    }
    
    private boolean validationMessagesDisplayed() {
        // Code to verify if validation messages are displayed
        return true;
    }
    
}
