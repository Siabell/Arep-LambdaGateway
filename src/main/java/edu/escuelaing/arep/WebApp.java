package edu.escuelaing.arep;
import static spark.Spark.*;
import com.google.gson.Gson;

import edu.escuelaing.arep.services.MathServices;

public class WebApp 
{
    public static void main( String[] args )
    {
    	port(getPort());
    	staticFiles.location("/web");
		final Gson gson = new Gson();
		System.out.println("entra antes post y get");
		options("/*",
	        (request, response) -> {

	            String accessControlRequestHeaders = request
	                    .headers("Access-Control-Request-Headers");
	            if (accessControlRequestHeaders != null) {
	                response.header("Access-Control-Allow-Headers",
	                        accessControlRequestHeaders);
	            }

	            String accessControlRequestMethod = request
	                    .headers("Access-Control-Request-Method");
	            if (accessControlRequestMethod != null) {
	                response.header("Access-Control-Allow-Methods",
	                        accessControlRequestMethod);
	            }

	            return "OK";
	        });

		before((request, response) -> response.header("Access-Control-Allow-Origin", "*"));
    	
		get("/calculator/:data", (request, response) -> {
			response.type("application/json");
			int numero = Integer.parseInt(request.params(":data"));
            final Integer cuadrado = MathServices.square(numero);
            System.out.println(cuadrado);
            response.status(200);
            return new Gson().toJson(
      		      new StandardResponse(StatusResponse.SUCCESS,new Gson()
      		        .toJsonTree(MathServices.square(numero))));
		});
    }
    
    static int getPort() {
		if (System.getenv("PORT") != null) {
			return Integer.parseInt(System.getenv("PORT"));
			}
			return 4567; 
			 //returns default port if heroku-port isn't set (i.e. on localhost)
	}
}
