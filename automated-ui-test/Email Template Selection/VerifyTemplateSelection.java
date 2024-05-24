public class VerifyTemplateSelection {

    @Test
    public void testVerifyEmailTemplateSelection() {
        Assert.assertTrue(dropdownSelectionWorks("email_template", new String[]{"Template 1", "Template 2"}));
    }
    
}
