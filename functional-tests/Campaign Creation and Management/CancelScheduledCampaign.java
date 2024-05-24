public class CancelScheduledCampaign {

    @Test
    public void testCancelScheduledCampaign() {
        loginToSystem();
        navigateToCampaignList();
        clickOnCampaign("Updated Campaign 1");
        clickCancel();
        confirmCancellation();
        Assert.assertTrue(campaignIsRemovedFromSchedule("Updated Campaign 1"));
    }
    
    private void clickCancel() {
        // Code to click on 'Cancel'
    }
    
    private void confirmCancellation() {
        // Code to confirm cancellation
    }
    
    private boolean campaignIsRemovedFromSchedule(String campaignName) {
        // Code to verify if the campaign is removed from the schedule
        return true;
    }
    
}
