# Web-Applications-Using-Servlets-and-JSP-for-User-Input-Handling-and-Database-Integration
# Web Application Using Servlets and JSP
A simple Java web app demonstrating user input handling with Servlets, JSP, and MySQL integration.

## Features
- JSP form for user input
- Servlet for processing form data
- DAO for database operations using JDBC

## Setup
1. Import project into Eclipse or IntelliJ as Dynamic Web Project.
2. Create MySQL database using `db/schema.sql`.
3. Update credentials in `UserDAO.java`.
4. Deploy on Apache Tomcat (v10+).
5. Access via `http://localhost:8080/WebApp-Servlets-JSP-Database/index.jsp`

## FOLDER STRUCTURE 
WebApp-Servlets-JSP-Database/
├── src/
│   └── com/example/webapp/
│        ├── UserServlet.java
│        ├── UserDAO.java
│        └── User.java
├── WebContent/
│   ├── index.jsp
│   ├── success.jsp
│   └── error.jsp
├── WEB-INF/
│   ├── web.xml
│   └── lib/
│        └── mysql-connector-j.jar
├── db/
│   └── schema.sql
└── README.md





