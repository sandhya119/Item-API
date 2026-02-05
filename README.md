Item API : A simple Java Spring Boot REST API to manage items.

I. How to Run:

1. Clone or download the project.

2. Open terminal in project folder.

3. Run the application:
   mvn spring-boot:run

4. The API will start at:
   http://localhost:8080

II. Endpoints:

1. POST /items –> Add item
{
  "name": "Mobile",
  "description": "Smartphone device"
}

2. GET /items/{id} –> Get item by ID

3. 3. GET /items –> Get all items

III. Testing the API:

I used Postman to test all API endpoints and validate the input data.

1. POST /items –> Send JSON in the body to add items.

2. GET /items –> Retrieve all items.

3. GET /items/{id} –> Retrieve a single item by its ID.
