# Cricket Score Tracker

## Description
A full-stack cricket scoring application built using Spring Boot and PostgreSQL that allows users to enter match scores, calculate match results, and determine winners. The application provides a RESTful backend to handle score logic and persist match data in a database.

## Technologies Used
- Java
- Spring Boot
- PostgreSQL
- HTML
- CSS
- JavaScript
- Maven

## Features
- Add a new cricket match with team names and scores
- Calculate match result and determine winner automatically
- View all past matches
- Delete a match record
- RESTful API tested using Postman

## Project Structure
cricketService/
├── src/
│   ├── main/
│   │   ├── java/com/example/cricketService/
│   │   │   ├── Cricket.java          (Model)
│   │   │   ├── CricketController.java (Controller)
│   │   │   ├── CricketRepository.java (Repository)
│   │   │   ├── CricketService.java   (Service)
│   │   │   └── CricketServiceApplication.java
│   │   └── resources/
│   │       └── application.properties

## How to Run
1. Clone the repository
git clone https://github.com/akarshanaragu/cricketService.git
2. Open project in IntelliJ or VS Code
3. Configure PostgreSQL in application.properties
spring.datasource.url=jdbc:postgresql://localhost:5432/cricket_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
4. Run CricketServiceApplication.java
5. Test APIs using Postman

## API Endpoints
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /cricket/add | Add new match with player names and over scores |
| GET | /cricket/all | Get all matches |
| GET | /cricket/{id} | Get match by ID |
| DELETE | /cricket/delete/{id} | Delete a match by ID |

## Request Parameters for POST /cricket/add
| Parameter | Type | Description |
|-----------|------|-------------|
| player1 | String | Name of Player 1 |
| player2 | String | Name of Player 2 |
| play1over1 to play1over6 | int | Player 1 scores for each over |
| play2over1 to play2over6 | int | Player 2 scores for each over |

## Author
Akarshana R
