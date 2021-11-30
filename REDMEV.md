Par la ejecucion de este Proyeto 


--------PREPARACION DEL ENTORNO DE DESARROLLO----------------------
---Se descargo la aaplicacion de SQLSERVER

*Instalación de Base de datos SQLSERVER 

*Creación de usuario
https://www.youtube.com/watch?v=GrH58D9Guuw

*Habilitar permisos FTP en el manager SQL SERVER

*DESCARGAR NETBEANS CON EL JDK 8.1

*Descargar power designer 


-----Aplicando SCRUM-----------------
---------------los requerimientos convertidos en Historias de Usuario-----------------

RETO FARMAENLACE
Inventario de vacunación de empleados
Farmaenlace cia ltda. requiere una aplicación para llevar un registro del inventario del estado de vacunación de los empleados.
La aplicación contará con 2 roles: Administrador y Empleado.
Para el desarrollo de la aplicación tenemos las siguientes historias de usuario.

-Modelado de la base de datos



1.	Como Administrador requiere registrar, editar, listar y eliminar a los empleados.


Historia de Usuario
Numero:	1		Nombre historia: CRUD de empleados
Usuario: Administrador
Prioridad:  Alta	Riesgo: Alta	Estimación: 16 horas
Sprint:  1	
Descripción: 1.	Como Administrador requiere registrar, editar, listar y eliminar a los empleados.
PRUEBAS DE ACEPTACIÓN
Registrar la siguiente Información del empleado: Cédula, Nombres, Apellidos, correo Electrónico
Los campos deben contener validaciones de acuerdo con el tipo de dato: 
○	Todos los campos son requeridos.
○	Cédula válida. (Incluir un valor numérico y único de 10 dígitos)
 ○	Correo electrónico válido.
○	Nombres y apellidos no deben contener números o caracteres especiales.
o	Al dar de alta un empleado se debe generar un usuario y contraseña para el empleado.





2.	Como Empleado requiero ingresar al sistema para visualizar y actualizar mi información.
Historia de Usuario
Numero:	2		Nombre historia: Vista y Actualizar Información
Usuario: Empleado
Prioridad:  Alta	Riesgo: Alta	Estimación: 8 horas
Sprint:  1	
Descripción: Ingresar como empleado y visualizar y actualizar la información
PRUEBAS DE ACEPTACIÓN
Completar la siguiente información: 
●	Fecha de nacimiento.
●	Dirección de domicilio.
●	Teléfono móvil.
●	Estado de vacunación: Vacunado / No Vacunado.
●	Si el empleado está en estado vacunado, se debe pedir la siguiente información requerida:
	Tipo de vacuna: Sputnik, AstraZeneca, Pfizer y Jhonson&Jhonson 
	Fecha de vacunación. 
	Número de dosis.





Historia de Usuario
Numero:	3		Nombre historia: Filtrar Empleados
Usuario: Administrador
Prioridad:  Alta	Riesgo: Alta	Estimación: 8 horas
Sprint:  1	
Descripción: Hacer una búsqueda de empleados
PRUEBAS DE ACEPTACIÓN
Filtrar por estado de vacunación.
Filtrar por tipo de vacuna.
Filtrar por rango de fecha de vacunación.



-----------------MOdelado de La base de datos----------

En el modelado se trabaja con la herramienta PowerDesigner
-crear un modelo fisico con los requerimientos de las entidades para sqlserver, al finalizar
-exportar en un scriptpara ejecura en la BDD SQLSERVER

-------------------Base de Datos -------
conectar con el usuario creado o activar el usuario sa 
crear una new database con el nombre vacunas
-Ubicarse sobre la base de datos creada y seleccionar new Query, y ahi pegar todo el scrip de la bdd generada por power designer





----------------CREACION DEL PROYECTO EN NETBEANS-------------------------
crear como ->Nuevo Proyecto(Java Web, web aplication)
crear los paquetes para las entidades, manager y controlador
Para la creacion de la persistencia de datos, crear cadena de conexion
Elegir en 
-Entity class for Database (elegir la de empleados)

---------<<<<<<<<OJO>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>------------ tener cuidado con generar la persistencia de todas las entidades da error,otra observacion trabajar con integer la clave foranea , 
como la clave es identity no se genera el codigo para autoincrementar desde la persistencia con este error pase todo el fin de semana (lo corregi ayer 29/112021 a las 17:00 pm) 

adjunto  links que me ayudaron en la solucion
-https://stackoverflow.com/questions/37388271/jpa-hibernate-persistence-exception-persistenceunit-default-unable-to-build-h
-https://stackoverflow.com/questions/1334012/cannot-insert-explicit-value-for-identity-column-in-table-table-when-identity


crear un archivo IndexEmpleados.jsp para las  
crear un servelet llamado controlador (sirve para comunicarme con el JSP)


MIL DISCULPAS  NO PODER COMPLEMENTAR EL RETO A TIEMPO Y COMPLETO ,,,,,,





