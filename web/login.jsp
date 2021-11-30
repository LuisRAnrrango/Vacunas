<%-- 
    Document   : IndexEmpleados
    Created on : 29/11/2021, 11:40:34
    Author     : Usuario
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
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

            <!-- /#sidebar-wrapper -->

            <!-- Page Content -->
            <div id="page-content-wrapper">

                <nav class="navbar navbar-expand-lg navbar-light bg-light border-bottom">
                    <label>Sistema de control de Vacunación</label>
                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="navbar-nav ml-auto mt-2 mt-lg-0">
                            <li class="nav-item active">
                                <a class="nav-link" href="index.html">Home<span class="sr-only">(current)</span></a>
                            </li>
                            <li class="nav-item active">
                                <a class="nav-link" href="login.jsp">Iniciar Sesion <span class="sr-only">(current)</span></a>
                            </li>

                        </ul>
                    </div>
                </nav>

                <div class="container-fluid">

                    <div class="col-md-6">
                        <form action="<%= request.getContextPath()%>/controlador" method="POST">
                            <div class="row">

                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>Usuario</label>
                                        <input type="text"  class="form-control" name="usuario" placeholder="Nombre de usuario"/>
                                    </div>
                                </div>
                            </div>

                            <div class="row">

                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>Contraseña</label>
                                        <input type="password"  class="form-control" name="clave" placeholder="Contraseña"/> 
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-3">
                                </div>
                                <div class="col-md-6">
                                    
                                    <select  name="item" >
                                        <option value="administrador">Administrador</option>
                                        <option value="empleado">Empleado</option>

                                    </select>
                                    
                                </div>
                                <%--
                                <div class="col-md-6">
                                    <div class="dropdown">
                                        <button name="rol" class="btn btn-info dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                            Tipo de Usuario
                                        </button>
                                        <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                                            <a class="dropdown-item" href="#">Administrador</a>
                                            <a class="dropdown-item" href="#">Empleado</a>

                                        </div>
                                    </div>
                                </div>
                                --%>



                            </div>

                            <input type="submit" class="btn btn-success"   value="Iniciar" name="btnRegistrar">
                        </form>

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
