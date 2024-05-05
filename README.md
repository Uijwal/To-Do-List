Sure, here's a sample README.md file for your project:

```markdown
# To-Do List Web Application

This is a simple web application for managing your to-do list. You can add, update, and delete tasks using this application.

## Features

- Add new tasks with titles.
- Mark tasks as done or not done.
- Update task titles and status.
- Delete tasks from the list.

## Technologies Used

- Spring Boot
- Thymeleaf
- Bootstrap
- Hibernate
- H2 Database (for simplicity; can be changed to other databases like MySQL, PostgreSQL, etc.)

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your machine
- Maven (for building and managing dependencies)

### Installation

1. Clone the repository:

   ```bash
   git clone <repository_url>
   ```

2. Navigate to the project directory:

   ```bash
   cd <project_directory>
   ```

3. Build the project using Maven:

   ```bash
   mvn clean install
   ```

4. Run the application:

   ```bash
   mvn spring-boot:run
   ```

5. Access the application in your web browser at `http://localhost:8080`.

## Usage

- Add a new task: Enter the task title in the input field and click "Add Task".
- Update a task: Click the "Update" button next to the task you want to update, make changes, and click "Update Task".
- Mark a task as done/not done: Click the checkbox next to the task title.
- Delete a task: Click the "Delete" button next to the task you want to delete.

## Contributing

Contributions are welcome! If you have any suggestions or improvements, feel free to open an issue or create a pull request.

