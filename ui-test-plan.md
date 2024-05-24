**Test Plan for Automated UI Tests**

1. Campaign Creation Form

    1.1 Verify Form Fields:

        Test Case 1: Verify that all required form fields are present on the campaign creation form.
            Steps:
            Navigate to the campaign creation page.
        Expected Result: All necessary form fields (name, send time, recipient list selection, email template selection) are displayed.

    1.2 Field Validation:

        Test Case 2: Verify that proper validation messages are displayed for invalid inputs in the campaign creation form.
            Steps:
            Enter invalid data in one or more form fields.
            Attempt to submit the form.
        Expected Result: Validation messages are displayed next to the respective fields indicating the errors.

2. Recipient List Selection

    2.1 Verify Dropdown Selection:

        Test Case 3: Verify that the recipient list selection dropdown works as expected.
        Preconditions: At least one recipient list is available in the system.
            Steps:
            Click on the recipient list selection dropdown.
            Select a recipient list.
        Expected Result: The selected recipient list is displayed in the dropdown.

3. Email Template Selection

    3.1 Verify Template Selection:

        Test Case 4: Verify that the email template selection dropdown works as expected.
        Preconditions: At least one email template is available in the system.
            Steps:
            Click on the email template selection dropdown.
            Select an email template.
        Expected Result: The selected email template is displayed in the dropdown.
        
4. Responsive Design
    4.1 Verify Responsiveness - Desktop:

        Test Case 5: Verify that the campaign scheduling feature is responsive on desktop devices.
            Steps:
            Open the campaign scheduling page on a desktop browser.
            Resize the browser window.
        Expected Result: The UI elements adjust smoothly to different screen sizes without overlapping or distortion.

    4.2 Verify Responsiveness - Mobile:

        Test Case 6: Verify that the campaign scheduling feature is responsive on mobile devices.
            Steps:
            Open the campaign scheduling page on a mobile device.
            Rotate the device between portrait and landscape orientations.
        Expected Result: The UI elements adapt to the smaller screen size and touch interface, maintaining usability and readability.

5. Usability

    5.1 Verify Ease of Use:

        Test Case 7: Verify that the campaign scheduling workflow is intuitive and easy to use.
            Steps:
            Create a new campaign.
            Fill in the required details and save the campaign.
        Expected Result: The process of creating and scheduling a campaign is straightforward and user-friendly.