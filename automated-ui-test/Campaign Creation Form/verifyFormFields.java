public class verifyFormFields {

    @Test
    public void testVerifyFormFields() {
        navigateToCampaignCreationPage();
        Assert.assertTrue(formFieldsPresent(new String[]{"name", "send_time", "recipient_list", "email_template"}));
    }
    
    private void navigateToCampaignCreationPage() {
        // Code to navigate to campaign creation page
    }
    
    private boolean formFieldsPresent(String[] fields) {
        // Code to verify if form fields are present
        return true;
    }
     
}
