# Getting Started

# Getting Started

#Explanation of packaging structure

com.kpmg.Omnichannel -> Base App package

controller -> contains all Rest Endpoints

service    -> Buisness logic layer (Interfaces and its implementations)

repository -> Database access layer

model      -> JPA entities representing the database tables

dto		   -> helps to avoid exposing internal database entities directly to client

exception  -> centralized exception handling (global as well as custom)

config     -> helps to write configuration classes

util       -> to declare constants across the project

#Explanation of Folder Structure

resources -> properties or yaml related files 

src/test/java -> Junit related test files

dockerfile -> docker related configurations

#Dependencies used

spring web   -> provides all classes and annotations need to create APIs

lombok       -> helps to avoid boilerplate code we can generate getters setters constructors and all with help of annotations

