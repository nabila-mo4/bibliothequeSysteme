
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html >
	<head>
		<title>Connexion</title>
		<s:head />
	</head>
	<body>
		
							
					
	

<div class="container" style="padding-top:100px">
    	<div class="row">
			<div class="col-md-12 ">
				<div class="panel panel-login" style="border-color: #ccc;-webkit-box-shadow: 0px 2px 3px 0px rgba(0,0,0,0.2);-moz-box-shadow: 0px 2px 3px 0px rgba(0,0,0,0.2);box-shadow: 0px 2px 3px 0px rgba(0,0,0,0.2);" >
					<div class="panel-heading" style="color: #00415d;background-color: #fff;border-color: #fff;text-align:center;" >
						<div class="col-md-12">
							<h3> Connectez-vous! </h3>
						</div>
						<hr>
					</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">

								
								<s:form action="login">
								<div class="form-group">
										<s:textfield label="email" name="email" class="form-control"  style="height: 45px;border: 1px solid #ddd;font-size: 16px;-webkit-transition: all 0.1s linear;-moz-transition: all 0.1s linear;transition: all 0.1s linear;" />
					       		</div>
								
								<div class="form-group">
										<s:textfield label="mdp" name="mdp" class="form-control"  style="height: 45px;border: 1px solid #ddd;font-size: 16px;-webkit-transition: all 0.1s linear;-moz-transition: all 0.1s linear;transition: all 0.1s linear;" />
					       		</div>
								
								<div class="form-group">
										<div class="row">
											<div class="col-md-12">
												<s:submit value="Se connecter" tabindex="4" class="form-control btn btn-login"  style="background-color: #007bff; outline: none;color: #fff;font-size: 14px;height: auto;font-weight: normal;padding: 14px 0;text-transform: uppercase;border-color: #007bff ;" />
											</div>
										</div>
								    </div>
								
								
							</s:form>
							</div>
							</div>
							</div>
							</div>
							</div>
							</div>
							</div>
	</body>
	</html>