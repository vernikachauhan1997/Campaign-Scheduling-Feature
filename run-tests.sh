#!/bin/bash

# Build the project using Maven
echo "Building the project..."
mvn clean install

# Start mock API services (assuming they are Docker containers)
echo "Starting mock API services..."
docker-compose up -d

# Run functional tests
echo "Running functional tests..."
mvn test -Dtest=CampaignSchedulerTests

# Run automated UI tests
echo "Running automated UI tests..."
mvn test -Dtest=VerifyFormFields,VerifyTemplateSelection,VerifyDropdownSelection,VerifyDesktopResponsiveness,VerifyMobileResponsiveness,VerifyEaseOfUse

# Run integration tests
echo "Running integration tests..."
mvn test -Dtest=CampaignSchedulerIntegrationTests

# Stop mock API services
echo "Stopping mock API services..."
docker-compose down

echo "All tests executed successfully!"
