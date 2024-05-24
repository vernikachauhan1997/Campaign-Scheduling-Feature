**Test Plan for Integration of Campaign Scheduling Service**

1. Integration with Email Templates Service

    1.1 Fetch Email Templates:

        Test Case 1: Verify that the Campaign Scheduling service can fetch email templates from the Email Templates Service.
        Preconditions: Email Templates Service is running and contains templates.
            Steps:
            Trigger a request to fetch email templates from the Campaign Scheduling service.
        Expected Result: Email templates are successfully fetched and available for selection when creating or editing campaigns.

    1.2 Error Handling - Email Templates Service Unavailable:

        Test Case 2: Verify error handling when Email Templates Service is unavailable.
        Preconditions: Email Templates Service is down.
            Steps:
            Trigger a request to fetch email templates from the Campaign Scheduling service.
        Expected Result: Proper error message is displayed indicating the unavailability of the Email Templates Service.

2. Integration with Recipients Service

    2.1 Fetch Recipient Lists:

        Test Case 3: Verify that the Campaign Scheduling service can fetch recipient lists from the Recipients Service.
        Preconditions: Recipients Service is running and contains lists.
            Steps:
            Trigger a request to fetch recipient lists from the Campaign Scheduling service.
        Expected Result: Recipient lists are successfully fetched and available for selection when creating or editing campaigns.

    2.2 Error Handling - Recipients Service Unavailable:

        Test Case 4: Verify error handling when Recipients Service is unavailable.
        Preconditions: Recipients Service is down.
            Steps:
            Trigger a request to fetch recipient lists from the Campaign Scheduling service.
        Expected Result: Proper error message is displayed indicating the unavailability of the Recipients Service.

3. Data Flow and Interactions

    3.1 Create Campaign with Selected Template and Recipient List:

        Test Case 5: Verify that the Campaign Scheduling service correctly associates the selected email template and recipient list with a new campaign.
        Preconditions: Email Templates Service and Recipients Service are both available.
            Steps:
            Create a new campaign and select an email template and recipient list.
        Expected Result: The campaign is created with the selected email template and recipient list properly associated.

    3.2 Update Campaign with Changed Template and Recipient List:

        Test Case 6: Verify that the Campaign Scheduling service correctly updates the email template and recipient list of an existing campaign.
        Preconditions: Email Templates Service and Recipients Service are both available.
            Steps:
            Edit an existing campaign and change the email template and recipient list.
        Expected Result: The campaign is updated with the new email template and recipient list properly associated.