public class ViewCampaignDetails {

    @Test
    public void testViewCampaignDetails() {
        loginToSystem();
        navigateToCampaignList();
        clickOnCampaign("Campaign 1");
        Assert.assertTrue(campaignDetailsDisplayed("Campaign 1", "2023-12-31 10:00:00", "List A", "Template 1"));
    }

    private void navigateToCampaignList() {
        // Code to navigate to campaign list
    }

    private void clickOnCampaign(String campaignName) {
        // Code to click on a specific campaign
    }

    private boolean campaignDetailsDisplayed(String name, String sendTime, String recipientList, String emailTemplate) {
        // Code to verify if campaign details are displayed
        return true;
    }

}
