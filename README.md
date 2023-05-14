# Mandarin Flashcard Application

<div style="display: flex; align-items: flex-start;">
  <img src="images/Screenshot%202023-05-08%20at%2010.18.29%20AM.png" alt="Screenshot 1" style="width: 410px;" />
  <img src="images/Screenshot%202023-05-08%20at%2010.20.54%20AM.png" alt="Screenshot 2" style="width: 400px;" />
</div>

## Description

The Mandarin Flashcard Application is a web-based tool designed to help users learn Mandarin characters through interactive flashcards. This application is developed by Lionel Lynch.

The backend of the application is built with Spring Boot and Java, providing a robust and efficient foundation for handling data and business logic. The frontend is developed using HTML, CSS, and JavaScript, ensuring an intuitive and user-friendly experience.

To enhance data storage and retrieval, the backend is connected to a Mongo Atlas database. This allows for seamless management of flashcard data, ensuring a smooth learning experience for the users.

## Usage

### Using Docker

To run the Mandarin Flashcard Application using Docker, follow these steps:

1. Make sure you have Docker installed on your system.
2. Pull the Docker image from Docker Hub:

- docker pull lioneltlynch/mandarin-flashcard-app:latest

3. Run the Docker image:

- docker run -d -p 8080:8080 lioneltlynch/mandarin-flashcard-app:latest
  
4. Access the application by opening a web browser and navigating to `http://localhost:8080`.

## Contributing

Contributions are welcome! If you have any ideas, suggestions, or bug reports, please open an issue or submit a pull request. Together, we can make the Mandarin Flashcard Application even better.

## License

This project is licensed under the [MIT License](LICENSE).

## Contact

For any inquiries or questions, you can reach out to Lionel Lynch at lioneltlynch@yahoo.com.
