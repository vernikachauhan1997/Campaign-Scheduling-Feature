import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CampaignSchedulerIntegrationTests {

    @BeforeClass
    public void setUp() {
        RestAssured.baseURI = ""; // Base URI for the Campaign Scheduling service
    }

    @Test(description = "Fetch Email Templates")
    public void testFetchEmailTemplates() {
        Response response = RestAssured.get("/campaign-scheduler/email-templates");
        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertTrue(response.jsonPath().getList("templates").size() > 0, "Email templates should be available.");
    }

    @Test(description = "Error Handling - Email Templates Service Unavailable")
    public void testEmailTemplatesServiceUnavailable() {
        // Simulate Email Templates Service being down
        Response response = RestAssured.get("/campaign-scheduler/email-templates");
        Assert.assertEquals(response.getStatusCode(), 500);
        Assert.assertTrue(response.getBody().asString().contains("Email Templates Service is unavailable"));
    }

    @Test(description = "Fetch Recipient Lists")
    public void testFetchRecipientLists() {
        Response response = RestAssured.get("/campaign-scheduler/recipients");
        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertTrue(response.jsonPath().getList("recipientLists").size() > 0, "Recipient lists should be available.");
    }

    @Test(description = "Error Handling - Recipients Service Unavailable")
    public void testRecipientsServiceUnavailable() {
        // Simulate Recipients Service being down
        Response response = RestAssured.get("/campaign-scheduler/recipients");
        Assert.assertEquals(response.getStatusCode(), 500);
        Assert.assertTrue(response.getBody().asString().contains("Recipients Service is unavailable"));
    }

    @Test(description = "Create Campaign with Selected Template and Recipient List")
    public void testCreateCampaignWithTemplateAndRecipientList() {
        String requestBody = "{ \"name\": \"Campaign 1\", \"sendTime\": \"2023-12-31T10:00:00Z\", " +
                "\"recipientList\": \"List A\", \"emailTemplate\": \"Template 1\" }";

        Response response = RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .post("/campaign-scheduler/campaigns");

        Assert.assertEquals(response.getStatusCode(), 201);
        Assert.assertTrue(response.jsonPath().getString("name").equals("Campaign 1"));
        Assert.assertTrue(response.jsonPath().getString("recipientList").equals("List A"));
        Assert.assertTrue(response.jsonPath().getString("emailTemplate").equals("Template 1"));
}

    @Test(description = "Update Campaign with Changed Template and Recipient List")
    public void testUpdateCampaignWithTemplateAndRecipientList() {
        // Create a campaign to update
        String createRequestBody = "{ \"name\": \"Campaign 1\", \"sendTime\": \"2023-12-31T10:00:00Z\", " +
                "\"recipientList\": \"List A\", \"emailTemplate\": \"Template 1\" }";

        Response createResponse = RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(createRequestBody)
                .post("/campaign-scheduler/campaigns");

        String campaignId = createResponse.jsonPath().getString("id");

        // Update the created campaign
        String updateRequestBody = "{ \"name\": \"Campaign 1 Updated\", \"sendTime\": \"2024-01-01T10:00:00Z\", " +
                "\"recipientList\": \"List B\", \"emailTemplate\": \"Template 2\" }";

        Response updateResponse = RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(updateRequestBody)
                .put("/campaign-scheduler/campaigns/" + campaignId);

        Assert.assertEquals(updateResponse.getStatusCode(), 200);
        Assert.assertTrue(updateResponse.jsonPath().getString("name").equals("Campaign 1 Updated"));
        Assert.assertTrue(updateResponse.jsonPath().getString("recipientList").equals("List B"));
        Assert.assertTrue(updateResponse.jsonPath().getString("emailTemplate").equals("Template 2"));
    }





}
