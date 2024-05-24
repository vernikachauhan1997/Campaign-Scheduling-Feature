public class SelectRecipientList {

    @Test
    public void testSelectRecipientList() {
        loginToSystem();
        navigateToCampaignSchedulingPage();
        clickCreateCampaign();
        selectRecipientList("List A");
        clickSave();
        Assert.assertTrue(recipientListIsAssociatedWithCampaign("List A"));
    }
    
    private void selectRecipientList(String recipientListName) {
        // Code to select a recipient list
    }
    
    private boolean recipientListIsAssociatedWithCampaign(String recipientListName) {
        // Code to verify if the recipient list is associated with the campaign
        return true;
    }
    
}
