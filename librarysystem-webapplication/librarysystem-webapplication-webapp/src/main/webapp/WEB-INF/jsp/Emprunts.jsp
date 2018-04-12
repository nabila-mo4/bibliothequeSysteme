<%@ page language="java" contentType="text/html; charset=UTF-8"
     isELIgnored="false"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head> 
        <title>Liste des ouvrages</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
        
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css" rel='stylesheet' type='text/css'/>
	<s:head />
</head>


 <c:import url="/menu.jsp"></c:import>
    <body style="padding-top: 100px;">
    
	
	
	<div class="container" style="padding-top: 20px">
    		<div class="row">
    			<div class="col-md-12">
					<div class="panel panel-default panel-table">
              			<div class="panel-heading" style="background-color= white;padding:10px 15px;border-bottom:1px solid transparent;border-top-left-radius:3px;border-top-right-radius:3px">
                			<div class="row">
                  				<div class="col-md-12 text-center">
                    				<h2 class="panel-title" style=" margin-top:0;margin-bottom:0;font-size:20px;color:inherit">LA LISTE DES OUVRAGES</h2>
                  				</div>
                  				
                  			</div>
                		</div>
              		</div>
			 		    <br> 
						
	
					
					
              			<div class="panel-body" style="padding:0;">
               				 <table class="table table-striped table-bordered table-list">
                  					<thead>
                    						<tr >
                       							 <th class="text-center">Action</th>
                       							 <th> OUVRAGE </th>
                        						 <th>DATE DE DEBUT</th>
                       						     <th>DATE DE FIN </th>
												 <th>ETAT </th>
												 <th>PROLONGER</th>
												
												 
                  							</tr> 
                 				    </thead>
                  					<tbody>
                  						<s:iterator value="emprunts" status="status">
                         					 <tr>
                            					 <td align="center">
                            					  <a href = "<c:url value = "/view/${listeSites.idsite }?date=true"/>" class="btn btn-primary" style="color: #fff;background-color: #007bff;border-color: #007bff;"><em class="fa fa-eye"></em></a>
                            					 <a href = "<c:url value = "/update/${listeSites.idsite }"/>" class="btn btn-primary" style="color: #fff;background-color: #007bff;border-color: #007bff;"><em class="fa fa-pencil"></em></a>
                            				     <a href = "<c:url value = "/delete/${listeSites.idsite }"/>" class="btn btn-primary" style="color: #fff;background-color: #007bff;border-color: #007bff;"><em class="fa fa-trash"></em></a>
                             						
                           						 </td>
                           						 <td > <s:property value="ouvrageDTO.titre"/>
                            				     <td ><s:property value="datedebut.toGregorianCalendar().getTime()"/>
                          					     <td ><s:property value="datefin.toGregorianCalendar().getTime()"/>
                          					     <td ><s:if test="prolonge">PROLONGE</s:if><s:else>NON PROLONGE</s:else></td>
												 <s:url action="prolongerAction" namespace="/library" var="emprunturl">
												  <s:param name="idemprunt"><s:property value="idemprunt"/></s:param>
						                         </s:url>
												<td><s:if test="prolonge">Vous ne pouvez pas emprunter une deuxième fois</s:if><s:else><a href="${emprunturl}">Prolonger</a></s:else></td>
                          					 
                          					</tr>
                          				</s:iterator>
                     			    </tbody>
									
									
									
							
			
               			 </table>
             	   </div>
            	</div>
			</div>
		</div>
	

</body>
</html>