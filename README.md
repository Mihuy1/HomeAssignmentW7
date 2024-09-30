# Weekly Sports Time Tracker Application

## Overview

The Weekly Sports Time Tracker Application is a Java-based application that allows users to log their sports activities, track the duration of each activity, and view the total time spent on sports throughout the week. The application uses a command-line interface for easy interaction and is built using Maven.

## Features

Add New Activity: Users can log new sports activities by entering the sport's name, duration, and the day of the week.
Show All Activities: Users can view a list of all recorded activities.
Total Time Spent: The application calculates and displays the total time spent on all sports activities logged.
Exit: Users can exit the application gracefully.
Getting Started

## Prerequisites
- Java 17 or later
- Maven (for building and managing dependencies)
- Docker (optional, for running in a container)
## Installation
- Clone the Repository:
- git clone https://github.com/yourusername/your-repo-name.git
- cd your-repo-name
### Build the Project: If you have Maven installed, you can build the project by running:
- mvn package
### Run the Application: You can run the application from the command line:
- java -jar target/App.jar

### Once the application is running, you will see a menu with the following options:
- Add new activity
- Show all activities
- Total time spent on activities
- Exit

To add a new activity, select option 1 and follow the prompts to enter the sport name, duration (in hours), and the day of the week.

To view all activities, select option 2. The application will display all logged activities.

To see the total time spent on all activities, select option 3.

To exit the application, select option 4.

## Running with Docker
You can also run the application using Docker. Ensure you have Docker installed, then run the following commands:

### Build the Docker Image:
- docker build -t yahhas/otp1w7

## Run the Docker Container:
- docker run yahhas/otp1w7

## Testing
The application includes unit tests for the SportApp class, ensuring that methods for getting and setting attributes work correctly. You can run the tests using Maven:

- mvn test
