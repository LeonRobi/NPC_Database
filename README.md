# QA-DFESW13 Final Project
## Contents

[Project Overview](https://github.com/LeonRobi/NPC_Database/tree/main#1-project-overview)

[Postman](https://github.com/LeonRobi/NPC_Database/tree/main#2-postman-crud)

[Test Results](https://github.com/LeonRobi/NPC_Database/tree/main#3-test-results)

[H2 Database](https://github.com/LeonRobi/NPC_Database/tree/main#4-h2-database)

[MySQL](https://github.com/LeonRobi/NPC_Database/tree/main#5-mysql-database)

## 1. Project Overview

### Why are we doing this?

The project is the final piece in the QA Software development bootcamp which is used to demonstrate an ability to create a Java database using h2 and MySQL, implemented with CRUD functionality.
The project uses the idea of a Dungeons and Dragons (DnD) Non player character (NPC) database for users to find and select pre-made NPC's for their games.

### How I expected the challenge to go.

I had expected this challenge to build upon the knowledge gained in the previous weeks of learning and thus expected small hurdles that I'd need to overcome but would overall be a task that would operate smoothly.

I had originally set the goal of building a simple front end for the application along side the project itself but realised that this would unfortunately be out of scope after I started having trouble getting some of the testing to work. Once the testing was completed I didn't want to create a front end that I wouldn't be happy with and focused on ensuring all other aspects of the project were up to spec.

### What went well? / What didn't go as planned?

#### What went well?

- All CRUD functionality implemented without issue
- Custom CRUD functionality implemented
- Testing for Service class and Controller class at 100%
- Use of both H2 and MySQL
- Exploration into different ways of producing the project
- Time management
- Planning process

#### What didn't go as planned?

- Git management (although later improved upon)
- Some stretch goals I'd hope to achieve

### Possible improvements for future revisions of the project.

There are many improvements that I could make for future projects. As seen below I produced a mock Entity relationship diagram that I wish I could have implemented along side the project which would provide significant use cases for a user that would require the database application. 

In addition, I spent some time researching Lombok and exploring how that could help remove boiler plate code from the application to simplify one aspect but didn't feel confident in removing the foundational code with the time restraints. 

Finally as I mention below in the Git section, I will in the future ensure my branches are better organised and represent one part of each addition to the code. This is something that became clear to me early on in the project and hence why you will see some branches existing for each feature but does not represent the full extent of how I would organise in the future.

### Entity Relationship Diagram 

Although out of scope for the project, a suggestion of a second database has been added which would synergise with the original.
This would include stats for each NPC in the database. Ideally I would have set this up to provide randomised stats for strength, wisdow and dexterity between 1-10.

![ERD](https://github.com/LeonRobi/NPC_Database/blob/Images/DndNPC_Images/ERD.PNG)

### User Stories

User stories allow me to ensure that each product feature is focused and relevant to what the end user would require.
  
- As a customer I want to create new NPC’s to be added to the database so that I can continuously keep track of each addition.
- As a customer I want to delete old NPC’s from the database so that I can remove any redundant information.
- As a customer I want to update specific attributes of a NPC so that I can ensure everything is up to date.
- As a customer I want to be able to read all NPCs in the database so that I can use them for reference. 

### Risk Assessment 

The risk assessment document allows me to priortise issues and problems that may occur during the project.

![Risk](https://github.com/LeonRobi/NPC_Database/blob/Images/DndNPC_Images/Risk%20Assessment.PNG)
    
### Trello
  
![Trello](https://github.com/LeonRobi/NPC_Database/blob/Images/DndNPC_Images/Trello%20Board.PNG)
  
### Git
  
 At the start of the project, Git was one of my weakest areas that I felt needed improving. Initially I started by creating the main and dev branch with the intention of sending all work directly into the dev branch but as the project progressed I realised that it would be better to have branches for each indivudal part. As a result I started producing extra branches a little later than I had hoped as seen in the below image.
  
  ![gitpush](https://github.com/LeonRobi/NPC_Database/blob/Images/DndNPC_Images/Git.PNG)
  ![gitbranch](https://github.com/LeonRobi/NPC_Database/blob/Images/DndNPC_Images/branching.PNG)
  
 Although not perfect, it has allowed me to learn and improve for future projects, in which I will have individual branches for testing and for each feature that gets added. 
    
 ## 2. Postman CRUD
  
  The following screenshots demonstrate CRUD functionality within the app using Postman. 
  
 ### Create
  
  The first step needed was having the ability to create a "NPC" for the database which uses JSON data.
  
  ![create](https://github.com/LeonRobi/NPC_Database/blob/Images/DndNPC_Images/Postman/Create%20NPC.PNG)
  
 ### Read
  
  Afterwards we need the ability to read the data, which is demonstrated below.
  
  ![read](https://github.com/LeonRobi/NPC_Database/blob/Images/DndNPC_Images/Postman/Read%20getNPC.PNG)
  
 ### Update
  
  The update feature would allow the user to update parts of the data to adapt to anything that might change. The first image shows a database entry.
  
  ![update1](https://github.com/LeonRobi/NPC_Database/blob/Images/DndNPC_Images/Postman/UpdateV2%20first.PNG)
  
  The second image demonstrates the update function changing the NPC's alignment to "Neutral Good", the age to 30 and in_use to "true".
  
  ![update2](https://github.com/LeonRobi/NPC_Database/blob/Images/DndNPC_Images/Postman/UpdateV2.PNG)
  
  The third image shows the changes being reflected in the database.
  
  ![update3](https://github.com/LeonRobi/NPC_Database/blob/Images/DndNPC_Images/Postman/Update%20V2%20final.PNG)
  
 ### Delete
  
  The delete function works to remove data that is no longer needed. In the first image we can delete the input with an id of 1.
  
  ![delete](https://github.com/LeonRobi/NPC_Database/blob/Images/DndNPC_Images/Postman/delete%20npc.PNG)
  
  The next image displays the new data which has lost the NPC with id of 1.
  
  ![deleteResult](https://github.com/LeonRobi/NPC_Database/blob/Images/DndNPC_Images/Postman/delete%20result.PNG)
  
 ## 2.1 Custom Queries
  
 ### Get Age Greater Than
  
  For some custom queries I decided to choose two which would be most helpful. The first is to search for a NPC with an age greater than the input.
  The first image displays a result when searching for ages above 50 and the second for ages above 300.
  
  ![50](https://github.com/LeonRobi/NPC_Database/blob/Images/DndNPC_Images/Postman/getAgeGreaterThan50.PNG)
  ![300](https://github.com/LeonRobi/NPC_Database/blob/Images/DndNPC_Images/Postman/ageGreaterThan300.PNG)
  
 ### Get Race
  
  Similarly I created a query which would search specifically by race with the first image displaying results for human and the second for results displaying gnome.
  
  ![human](https://github.com/LeonRobi/NPC_Database/blob/Images/DndNPC_Images/Postman/getrace%20human.PNG)
  ![gnome](https://github.com/LeonRobi/NPC_Database/blob/Images/DndNPC_Images/Postman/get%20race%20gnome.PNG)
  
 ## 2.2 Swagger
  
  In addition to postman I experimented with using 'Swagger' which would allow the user to do the same as postman without needing to download anything.
  
  ![Swagger](https://github.com/LeonRobi/NPC_Database/blob/Images/DndNPC_Images/swagger.PNG)
  
 ## 3. Test Results
 
  The test results show a wide coverage of the code covering 100% in both the Service and Controller packages. 
  In addition to this, I included tests for the model covering the hashCode and equals methods.   
 
 ![test](https://github.com/LeonRobi/NPC_Database/blob/Images/DndNPC_Images/test%20results.PNG)
  
 ## 4. H2 DataBase
  
  During the project I used H2 as a development and testing function within my java application. This was to avoid messing around with the MySQL database which would hold the up to date and correct data. 
  
  To connect to the h2 database, the localhost port was used.
  
  ![h2first](https://github.com/LeonRobi/NPC_Database/blob/Images/DndNPC_Images/Connecing%20to%20H2%20database.PNG)
  ![h2second](https://github.com/LeonRobi/NPC_Database/blob/Images/DndNPC_Images/h2%20database.PNG)
  
  After using postman to send data to h2 I could view the information to ensure everything was working as it should be.
  
  ![h2third](https://github.com/LeonRobi/NPC_Database/blob/Images/DndNPC_Images/H2%20database%20after%20posting%20information.PNG)
  
 ## 5. MySQL Database
  
  MySQL was used as the "production" database which would persist in holding and storing data when the java application had closed.
  
  ![mysql](https://github.com/LeonRobi/NPC_Database/blob/Images/DndNPC_Images/MySQL%20image%201.PNG)


