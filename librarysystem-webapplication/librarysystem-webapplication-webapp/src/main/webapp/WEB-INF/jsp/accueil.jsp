
	
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<title>Accueil</title>
	<s:head />
</head>
<body>

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
											
											
                       							 
                       							 <th> OUVRAGE </th>
                        						 <th>EDITEUR</th>
                       						     <th>LANGUE</th>
												 <th>DOMAINE</th>
												
												
												 
                  							</tr> 
                 				    </thead>
                  					<tbody>
                  						<s:iterator value="ouvrages" status="status">
                         					 <tr>
                            					 
                           						 <td > <s:property value="ouvrageDTO.titre"/>
                            				     <td ><s:property value="ouvrageDTO.editeur"/>
                          					     <td ><s:property value="ouvrageDTO.langue"/>
												 <td ><s:property value="ouvrageDTO.domaine"/>
                          					    
                          					</tr>
                          				</s:iterator>
                     			    </tbody>
									
									
									
							
			
               			 </table>
             	   </div>
            	</div>
			</div>
		</div>
		
		
		<div class="container" style="padding-top: 20px">
    		<div class="row">
    			<div class="col-md-12">
					<div class="panel panel-default panel-table">
              			<div class="panel-heading" style="background-color= white;padding:10px 15px;border-bottom:1px solid transparent;border-top-left-radius:3px;border-top-right-radius:3px">
                			<div class="row">
                  				<div class="col-md-12 text-center">
                    				<h2 class="panel-title" style=" margin-top:0;margin-bottom:0;font-size:20px;color:inherit">LA LISTE DES AUTEURS</h2>
                  				</div>
                  				
                  			</div>
                		</div>
              		</div>
			 		    <br> 
						
	
					
					
              			<div class="panel-body" style="padding:0;">
               				 <table class="table table-striped table-bordered table-list">
                  					<thead>
                    						<tr >
											
											
                       							 <th> AUTEUR:NOM</th>
                        						 <th>PRENOM</th>
                       						     <th>BIOGRAPHIE</th>
												 <th>NATIONALITE</th>
												
												
												 
                  							</tr> 
                 				    </thead>
                  					<tbody>
                  						<s:iterator value="auteurs" status="status">
                         					 <tr>
                            					 
                           						 <td > <s:property value="auteurDTO.nom"/>
                            				     <td ><s:property value="auteurTO.prenom"/>
                          					     <td ><s:property value="auteurDTO.biographie"/>
												 <td ><s:property value="auteurDTO.nationalite"/>
                          					    
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
	
