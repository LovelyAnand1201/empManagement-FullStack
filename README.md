# Employee Management System

This is a full-stack CRUD application for managing employee information. Users can create, read, update, and delete employee details. The frontend is built using React.js, the backend uses Spring Boot, and the database uses MySQL.

## Features

- **Create** a new employee record.
- **Read** a list of employees or view individual employee details.
- **Update** employee information.
- **Delete** employee records.
- Full **CRUD** functionality.

## Technologies Used

- **Frontend**: React.js
- **Backend**: Spring Boot 
- **Database**: MySQL

## Getting Started

### Prerequisites

Before you can run the project, you will need to have the following installed:

- [Node.js](https://nodejs.org/) (for React frontend)
- [Java JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) (for Spring Boot backend). 
- [MySQL](https://www.mysql.com/) (for database)

### Installation

1. **Clone the repository**:

   ```bash
   git clone https://github.com/LovelyAnand1201/empManagement-FullStack.git
   ```

2. **Frontend Setup**:

   Navigate to the frontend folder ( employee-ui ) and install the dependencies:

   ```bash
   cd employee-ui
   npm install
   ```

3. **Backend Setup**:

   Navigate to the backend folder:

   ```bash
   cd employee
   ```

   Configure MySQL connection settings in the `application.properties` file:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/your_database
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```

   Then, build and run the Spring Boot application:

   ```bash
   ./mvnw spring-boot:run
   ```

4. **Database Setup**:

   Open MySQL and create the necessary database:

   ```sql
   CREATE DATABASE employee_management;
   ```

5. **Run the Frontend**:

   Return to the frontend folder and start the React app:

   ```bash
   npm start
   ```

   The app will now be running at `http://localhost:9090`. 

## Usage

- Navigate to the home page to view the list of employees.
- Add a new employee by clicking the "Add Employee" button.
- Click on Update to edit employee details.
- Delete an employee using the "Delete" button.

## Screenshots
<img src="https://github.com/user-attachments/assets/0002cae6-1cdc-4384-94b0-67f31ff33953" width="100%" height="100%"> 
<div style="display: flex; justify-content: space-around;">
<img src="https://github.com/user-attachments/assets/e1736c26-5a52-4f46-82f4-a61508c9c04e" width="49%" > 
<img src="https://github.com/user-attachments/assets/8b23600b-a46b-42a3-a486-10ec9c527200" width="49%" >
</div>

