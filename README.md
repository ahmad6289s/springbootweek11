# Math Tutor Table Manager

### Overview

This is a Spring Boot web application used to manage tutoring 
sessions at a math tutor table.

---

## How to Run the Application

### Using Docker 

1. Run the command in the project directory:

```
docker compose up --build
```

2. Open browser and go to:

```
http://localhost:8080
```
---
### URLs to Test the Application

View all sessions:

http://localhost:8080/sessions

Add a new session:

http://localhost:8080/sessions/add

Edit a session :

http://localhost:8080/sessions/edit/{id}

Delete a session and :

http://localhost:8080/sessions/delete/{id}

---

## Database Configuration

The application uses MySQL :

* Database Name: `tutordb`
* Username: `mathusername`
* Password: `mathuserpassword`
* Port: `3306` 

---

## Example Data Fields

* Student Name
* Course
* Topic
* Visit Date
* Status (Waiting, In Progress, Completed)
