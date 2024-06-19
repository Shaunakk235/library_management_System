
# Library Management System

This is a simple library management system implemented in Java. It allows users to add books, search for books by ID, borrow and return books, and display all available books in the library.


## Structure

The project consists of the following classes, each in its own file:
- `Book.java`: Defines the `Book` class with attributes like title, ID, author, and borrowed status.
- `Library.java`: Defines the `Library` class that manages a collection of `Book` objects and provides methods to add, search, borrow, return, and display books.
- `LibraryManagement.java`: Contains the `main` method which provides a user interface to interact with the library.

## Setup

1. Clone the repository from GitHub:
    ```sh
    git clone https://github.com/Shaunakk235/library_management_System.git
    ```
2. Navigate to the project directory:
    ```sh
    cd library_management_System
    ```
3. Ensure you have Java installed on your machine. You can download it from [here](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

## Running the Application

1. Compile the Java files:
    ```sh
    javac Book.java Library.java LibraryManagement.java
    ```
2. Run the application:
    ```sh
    java LibraryManagement
    ```

## Usage

Upon running the application, you will be presented with a menu:
## Output

WELCOME TO THE LIBRARY MANAGER

1. Add a book
2. Search a book by book Id
3. Borrow a book
4. Return a book
5. Display all Available Books
6. Exit The Menu

- You have to follow the on-screen instructions to perform the desired actions.

## Contributing

If you want to contribute to this project, feel free to open issues and submit pull requests. Ensure that your code follows the project's coding standards and includes appropriate comments.

## License 

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.