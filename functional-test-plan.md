**Test Plan for Functional aspect of Campaign Scheduling Feature**
1. Campaign Creation and Management

1.1 Create Campaign:

Test Case 1: Verify that a user can create a new campaign with valid details.
    Steps:
        Log in to the system.
        Navigate to the campaign scheduling page.
        Click on "Create Campaign".
        Fill in valid campaign details (name, send time, recipient list, email template)
        Click on "Save".
    Expected Result: The campaign is successfully created and saved in the database.

1.2 View Campaign Details:

Test Case 2: Verify that a user can view the details of a scheduled campaign.
    Preconditions: At least one campaign is scheduled.
    Steps:
        Log in to the system.
        Navigate to the campaign list.
        Click on a scheduled campaign.
    Expected Result: Details of the selected campaign (name, send time, recipient list, email template) are displayed.

1.3 Edit Campaign Details:

Test Case 3: Verify that a user can edit the details of a scheduled campaign.
    Preconditions: At least one campaign is scheduled.
    Steps:
        Log in to the system.
        Navigate to the campaign list.
        Click on a scheduled campaign.
        Edit the campaign details.
        Click on "Save".
    Expected Result: The campaign details are updated in the database.

1.4 Cancel Scheduled Campaign:

Test Case 4: Verify that a user can cancel a scheduled campaign.
    Preconditions: At least one campaign is scheduled.
    Steps:
        Log in to the system.
        Navigate to the campaign list.
        Click on a scheduled campaign.
        Click on "Cancel".
        Confirm the cancellation.
    Expected Result: The campaign is removed from the schedule and no longer appears in the list of scheduled campaigns.


2. Recipient List Selection

2.1 Select Recipient List:

Test Case 5: Verify that a user can select a recipient list for a campaign.
    Preconditions: Recipient lists are available in the system.
    Steps:
        Log in to the system.
        Create a new campaign.
        Select a recipient list from the available options.
        Click on "Save".
    Expected Result: The selected recipient list is associated with the campaign.

3. Email Template Selection

3.1 Select Email Template:

Test Case 6: Verify that a user can select an email template for a campaign.
    Preconditions: Email templates are available in the system.
    Steps:
        Log in to the system.
        Create a new campaign.
        Select an email template from the available options.
        Click on "Save".
    Expected Result: The selected email template is associated with the campaign.
