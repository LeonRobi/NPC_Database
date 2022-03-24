# QA-DFESW13 Final Project
## Contents

*Project Overview
*Database Setup
*Postman
*Test Results
*point
*point

## Project Overview

A Java database using h2 and MySQL, implemented with CRUD functionality.
The project using the idea of a Dungeons and Dragons (DnD) Non player character (NPC) database for users to find and select pre-made NPC's for their games.

### Entity Relationship Diagram 

Although out of scope for the project, a second database has been added which would synergise with the original.
This would include stats for each NPC in the database. Ideally I would have set this up to provide randomised stats for strength, wisdow and dexterity between 1-10.

![ERD](https://github.com/LeonRobi/NPC_Database/blob/Images/DndNPC_Images/ERD.PNG)

### User Stories

User stories allow me to ensure that each product feature is focused and relevant to what the end user would require.
  
 <add user stories>
  

### Risk Assessment 

The risk assessment document allows me to priortise issues and problems that may occur during the project.

![Risk](https://github.com/LeonRobi/NPC_Database/blob/Images/DndNPC_Images/Risk%20Assessment.PNG)
    
### Trello
  
![Trello](https://github.com/LeonRobi/NPC_Database/blob/Images/DndNPC_Images/Trello%20Board.PNG)
  
### Git

<image>
  
 ## Database Setup
  
 ## Postman CRUD
  
  The following screenshots demonstrate CRUD functionality within the app using Postman. 
  
 ### Create
  
  The first step needed was having the ability to create a "NPC" for the database which uses JSON data.
  
  ![create](https://github.com/LeonRobi/NPC_Database/blob/Images/DndNPC_Images/Postman/Create%20NPC.PNG)
  
 ### Read
  
  Afterwards we need the ability to read the data, which is demonstrated below.
  
  ![read](https://github.com/LeonRobi/NPC_Database/blob/Images/DndNPC_Images/Postman/Read%20getNPC.PNG)
  
 ### Update
  
  The update feature would allow the user to update parts of the data to adapt to anything that might change.
  The first image shows a database entry.
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
  
 ## Custom Queries
  
 ### Get Age Greater Than
  
  For some custom queries I decided to choose two which would be most helpful. The first is to search for a NPC with an age greater than the input.
  The first image displays a result when searching for ages above 50 and the second for ages above 300.
  
  ![50](https://github.com/LeonRobi/NPC_Database/blob/Images/DndNPC_Images/Postman/getAgeGreaterThan50.PNG)
  ![300](https://github.com/LeonRobi/NPC_Database/blob/Images/DndNPC_Images/Postman/ageGreaterThan300.PNG)
  
 ### Get Race
  
  Similarly I created a query which would search specifically by race with the first image displaying results for human and the second for results displaying gnome.
  
  ![human](https://github.com/LeonRobi/NPC_Database/blob/Images/DndNPC_Images/Postman/getrace%20human.PNG)
  ![gnome](https://github.com/LeonRobi/NPC_Database/blob/Images/DndNPC_Images/Postman/get%20race%20gnome.PNG)
  
 ## Swagger
  
  In addition to postman I experimented with using 'Swagger' to do the same as postman.
  
  
