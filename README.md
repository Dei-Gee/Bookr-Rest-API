# BOOKR (Rest-API)
This is a Rest API built in Java and bootstrapped with Springboot from start.spring.io. It is a revamped version of the project located [here](https://github.com/csis-3275/Bookr/tree/develop_beta). This version will be deployed so the project was split into two separate repositories for the [web app](https://github.com/Dei-Gee/Bookr-Web-App) and rest api.

### Design Pattern
    ECB (Entity-Controller-Boundary)

## Development Environment Setup
Follow the instructions below in order to run the app Rest API. You can test the API endpoints using PostMan. 

### Installation
1. Clone the repository
2. Go to **File -> Import** in Eclipse IDE and select **Existing Maven Project**
3. The API runs on port 8888 by default. This can be seen in the application.properties     file under *src/main/resources*.
4. Run your local SQL Server (p.s. I use WAMP)
5. Create an SQL Database with the user root. Please note that you can either use MySQL     Workbench to make life easier or run mysql from the command line. Either way, make       sure that you have a server running with the database already created before you run     the Rest API otherwise you will get an error.
6. Run the main class in the "MainAPIClass" package as a spring application.
7. You'll know if it is running correctly if you get a *white label error* in the           browser and the last line in the terminal says it is running with no errors.  

**Note: This API will eventually be deployed on Heroku**