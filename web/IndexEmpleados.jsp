<%-- 
    Document   : IndexEmpleados
    Created on : 29/11/2021, 11:40:34
    Author     : Usuario
--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="es">
    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>GRANREST DESARROLLO WEB</title>

        <!-- Bootstrap core CSS -->
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="css/simple-sidebar.css" rel="stylesheet">
        <link href="css/alertify.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/default.min.css" rel="stylesheet" type="text/css"/>

    </head>

    <body>
        
        
   

        <div class="d-flex" id="wrapper">

            <!-- Sidebar -->
            <div class="bg-light border-right" id="sidebar-wrapper">
                <div class="sidebar-heading">Sistema Web Farmaenlace</div>
                <div class="list-group list-group-flush">
                    <a href="login.jsp" class="list-group-item list-group-item-action bg-light">Inicio</a>
                 
                    <a href="Productos.jsp" class="list-group-item list-group-item-action bg-light">Empleados</a>
                    <a href="#" class="list-group-item list-group-item-action bg-light">Contacto</a>
                    <a href="#" class="list-group-item list-group-item-action bg-light">Soporte</a>
                </div>
            </div>
            <!-- /#sidebar-wrapper -->

            <!-- Page Content -->
            <div id="page-content-wrapper">

                <nav class="navbar navbar-expand-lg navbar-light bg-light border-bottom">
                    <button class="btn btn-primary" id="menu-toggle">Menú</button>

                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>

                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="navbar-nav ml-auto mt-2 mt-lg-0">
                            <li class="nav-item active">
                                <a class="nav-link" href="index.html">Home <span class="sr-only">(current)</span></a>
                            </li>
                            <li class="nav-item active">
                                <a class="nav-link" href="login.jsp">Iniciar Sesion <span class="sr-only">(current)</span></a>
                            </li>

                        </ul>
                    </div>
                </nav>

                <div class="container-fluid">
                    <div class="col-md-8">
                        <h1>Registrar Empleados</h1>
                        <form action="<%= request.getContextPath()%>/controlador" method="POST" >

                            <div class="row">

                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>Nro Cédula</label>
                                        <input type="text" class="form-control" name="cedula" 
                                               placeholder="Ingrese Cédula">
                                    </div>
                                </div>
                            </div>
                            <div class="row">

                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>Nombres </label>
                                        <input type="text" class="form-control" name="nombres"  
                                               placeholder="Ingrese Nombres">
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>Apellidos</label>
                                        <input type="text" class="form-control" name="apellidos" placeholder="Ingrese Apellidos" >
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>Correo</label>
                                        <input type="text" class="form-control" name="correo" 
                                               placeholder="@example.com">
                                    </div>
                                </div>

                            </div>
                            <input type="submit" class="btn btn-success" name="btnRegistrar" value="Guardar"  >

                            <a href="index.html" class="btn btn-danger">Cancelar</a>
                        </form><br>
                    </div>

   




                    <div class="col-md-12">
                        <h1>Listado de Empleados</h1>
                        <form name="frmBuscar" action="Productos.jsp" method="post">
                            <div class="form-group">
                                <div class="form-inline">                                    
                                    <input type="text" class="form-control col-md-10 col-sm-8" placeholder="Escriba el nombre del producto" name="txtProducto" value="" >
                                    <input type="submit" name="btnBuscar" class="btn btn-dark col-md-2 col-sm-8" value="Buscar Producto">                               
                                </div>

                            </div>
                        </form>
                        <div class="table-responsive" >                                 
                            <table class="table table-hover table-striped table-bordered">
                                <thead class="btn-info">
                                    <tr>
                                        <th class="text-center">Id</th>
                                        <th class="text-center">N° Cédula</th>
                                        <th class="text-center">Nombres</th>
                                        <th class="text-center">Apellidos</th>
                                        <th class="text-center">Email</th>
                                        <th class="text-center">Fecha Nacimiento</th>
                                        <th class="text-center">Dirección</th>              
                                        <th class="text-center">Teléfono</th>              
                                        <th class="text-center">Estado Vacuna</th>              
                                        <th class="text-center">Tipo Vacuna</th>              
                                        <th class="text-center">Fecha Vacuna</th>              
                                        <th class="text-center">Numero Dosis</th>   
                                        <th class="text-center">Opciones</th>   
                                        
                                    </tr>
                                </thead>
                           
                                
                                <style>
                                    .roci{
                                        color: white;                                      
                                    }
                                </style>
                                <c:forEach var="emp" items="${listaEmpleados}">
                                    <tr> 
                                    <td>${emp.idEmpleado}</td>
                                    <td>${emp.cedulaEmp}</td>
                                    <td>${emp.nombreEmp}</td>
                                    <td>${emp.apellidoEmp}</td>
                                    <td>${emp.emailEmp}</td>
                                    <td>${emp.fechaNacimientoEmp}</td>
                                    <td>${emp.direccionEmp}</td>
                                    <td>${emp.telefonoEmp}</td>
                                    <td>${emp.estadoVacuna}</td>
                                    <td>${emp.tipoVacuna}</td>
                                    <td>${emp.fechaVacuna}</td>
                                    <td>${emp.numeroDosis}</td>
                                    <td>
                                        <input type="submit" class="btn btn-success" name="btnEditar" name="editar" value="Editar"  > <input type="submit" class="btn btn-danger" name="btnEliminar" name="eliminar" value="Eliminar"  > 
                                         
                                    </td>
                             </tr>

                                </c:forEach>
                                                                       
                                <!-- <a class="icon-pencil2" data-toggle="tooltip" data-placement="right" title="Editar" href="Controlador"></a>
                                </td>-->
                            </table>
                        </div>
                    </div>



                </div>
            </div>
            <!-- /#page-content-wrapper -->
        </div>
        <!-- /#wrapper -->

        <!-- Bootstrap core JavaScript -->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
        <script src="css/alertify.min.js" type="text/javascript"></script>
        <script src="JavaScript/ValidarProducto.js" type="text/javascript"></script>
        <!-- Menu Toggle Script -->
        <script>
            $("#menu-toggle").click(function (e) {
                e.preventDefault();
                $("#wrapper").toggleClass("toggled");
            });
        </script>

    </body>
</html>
