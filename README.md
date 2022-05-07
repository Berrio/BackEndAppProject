# BackEndAppProject

This is the backend for a ToDo tasks, this project is built whit java 11 and spring boot and its dependencies lombok,spring data, spring web and use a Mysql BD .

## Instalación

clone the repository
https://github.com/Berrio/BackEndAppProject.git
you have to create a mysql schema whit the name **category** in order to the proyect works.

## How to use it

you can just use the api whitout the frontend, or you can go to this repository **https://github.com/Berrio/FrontAppProject** if you want to use a grapical interface
if you want to test the backend or you want to create a new grapical interface you can test the backend whit these endpoints.

get http://localhost:8081/api/
get http://localhost:8081/api/findcategory/id
post http://localhost:8081/api/create/category
post http://localhost:8081/api/create/task
put http://localhost:8081/api/update/task
delete http://localhost:8081/api/delete/category/id
delete ttp://localhost:8081/api/delete/task/id


## Licencia
MIT
