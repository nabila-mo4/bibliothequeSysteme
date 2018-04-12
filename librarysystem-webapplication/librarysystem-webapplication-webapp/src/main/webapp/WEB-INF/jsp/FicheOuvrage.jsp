<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	
	<title>La fiche de l'ouvrage</title>
	<s:head />
	
	
	<link rel="stylesheet"
        href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
    <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
	
	
	
</head>

<body >
<c:import url="/menu.jsp"></c:import>
    
    <div class="container" style="padding-top:100px">
    
    
    	<div class="row">
			<div class="col-md-offset-3 col-md-6 col-md-offset-3">
				<div class="panel panel-login" style="border-color: #ccc;-webkit-box-shadow: 0px 2px 3px 0px rgba(0,0,0,0.2);-moz-box-shadow: 0px 2px 3px 0px rgba(0,0,0,0.2);box-shadow: 0px 2px 3px 0px rgba(0,0,0,0.2);" >
					<div class="panel-heading" style="color: #00415d;background-color: #fff;border-color: #fff;text-align:center;" >
						<div class="col-md-12">
							<h3> LES INFORMATIONS DE L'OUVRAGE </h3>
						 
    
							
						</div>
						
						
					</div>
					<div class="panel-body">
						<div class="row">
							<div class=" col-lg-8 col-lg-offset-2 col-lg-offset-2">
							
					            	<div class="form-group">
					            	
									<h5>Titre de l'ouvrage </h5>	<label for="titre"  tabindex="1" class="form-control"  style="height: 45px;border: 1px solid #ddd;font-size: 16px;-webkit-transition: all 0.1s linear;-moz-transition: all 0.1s linear;transition: all 0.1s linear;" > <s:property value="ouvrage.titre"/> </label>
									
					       			</div>
				 
							</div>
							
							<div class=" col-lg-8 col-lg-offset-2 col-lg-offset-2">
							
					            	<div class="form-group">
					            	
									<h5>Langue de l'ouvrage </h5>	<label for="langue"  tabindex="1" class="form-control"  style="height: 45px;border: 1px solid #ddd;font-size: 16px;-webkit-transition: all 0.1s linear;-moz-transition: all 0.1s linear;transition: all 0.1s linear;" > <s:property value="ouvrage.langue"/> </label>
									
					       			</div>
				 
							</div>
							
							<div class=" col-lg-8 col-lg-offset-2 col-lg-offset-2">
							
					            	<div class="form-group">
					            	
									<h5>Editeur de l'ouvrage </h5>	<label for="editeur"  tabindex="1" class="form-control"  style="height: 45px;border: 1px solid #ddd;font-size: 16px;-webkit-transition: all 0.1s linear;-moz-transition: all 0.1s linear;transition: all 0.1s linear;" > <s:property value="ouvrage.editeur"/> </label>
									
					       			</div>
				 
							</div>
							
							<div class=" col-lg-8 col-lg-offset-2 col-lg-offset-2">
							
					            	<div class="form-group">
					            	
									<h5>Date de publication de l'ouvrage </h5>	<label for="datepublication"  tabindex="1" class="form-control"  style="height: 45px;border: 1px solid #ddd;font-size: 16px;-webkit-transition: all 0.1s linear;-moz-transition: all 0.1s linear;transition: all 0.1s linear;" > <s:property value="ouvrage.datepublication"/> </label>
									
					       			</div>
				 
							</div>
							
							<div class=" col-lg-8 col-lg-offset-2 col-lg-offset-2">
							
					            	<div class="form-group">
					            	
									<h5>Domaine de l'ouvrage </h5>	<label for="domaine"  tabindex="1" class="form-control"  style="height: 45px;border: 1px solid #ddd;font-size: 16px;-webkit-transition: all 0.1s linear;-moz-transition: all 0.1s linear;transition: all 0.1s linear;" > <s:property value="ouvrage.domaine"/> </label>
									
					       			</div>
				 
							</div>
				
			</div>
		</div>
	</div>
	</div>
	</div>
	</div>
	
<script src="https://code.jquery.com/jquery-2.2.4.min.js" integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44=" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script> 	  
</body>
</html>