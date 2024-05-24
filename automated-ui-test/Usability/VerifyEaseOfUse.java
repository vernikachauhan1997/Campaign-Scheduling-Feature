public class VerifyEaseOfUse {

    @Test
    public void testUsability() {
        createNewCampaign();
        Assert.assertTrue(campaignCreationIsUserFriendly());
    }
    
    private void createNewCampaign() {
        // Code to create a new campaign
    }
    
    private boolean campaignCreationIsUserFriendly() {
        // Code to verify if campaign creation is user-friendly
        return true;
    }
    
}
