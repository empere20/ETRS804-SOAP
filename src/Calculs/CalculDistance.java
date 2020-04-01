package Calculs;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService()
public class CalculDistance {
    @WebMethod
    public double calculDistance(double latitudeA, double latitudeB, double longitudeA, double longitudeB){
        longitudeA = Math.toRadians(longitudeA);
        longitudeB = Math.toRadians(longitudeB);
        latitudeA = Math.toRadians(latitudeA);
        latitudeB = Math.toRadians(latitudeB);
        double d = longitudeB - longitudeA;
        double result = Math.acos((Math.sin(latitudeA)*Math.sin(latitudeB))+(Math.cos(latitudeA)*Math.cos(latitudeB)*Math.cos(d)));
        result = (result * 6378137)/1000;
        return result;
    }
}
