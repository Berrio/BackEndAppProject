# Todo Tasks BackEndAppProject

This is the backend for a ToDo tasks, this project is built whit java 11 and spring boot and its dependencies lombok,spring data, spring web and use a Mysql BD .
you can create with this project several categorys of tasks, and inside the category many tasks to control what you have to do during the day,week,month or year 

## how to install

clone the repository
https://github.com/Berrio/BackEndAppProject.git
you have to create a mysql schema whit the name **category** in order to the proyect works.

## How to use it

you can just use the api whitout the frontend, or you can go to this repository **https://github.com/Berrio/FrontAppProject**, if you want to use a grapical interface
if you want to test the backend or you want to create a new grapical interface you can test the backend whit these endpoints.

1. get http://localhost:8081/api/
2. get http://localhost:8081/api/findcategory/id
3. post http://localhost:8081/api/create/category
4. post http://localhost:8081/api/create/task
5. put http://localhost:8081/api/update/task
6. delete http://localhost:8081/api/delete/category/id
7. delete http://localhost:8081/api/delete/task/id


## Licencia
MIT
