package webservices;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService()
public class MyWebS {
  @WebMethod
  public String sayHelloWorldFrom(String from) {
    String result = "Hello, world, from " + from;
    System.out.println(result);
    return result;
  }
  public static void main(String[] argv) {
    Object implementor = new MyWebS ();
    String address = "http://localhost:9000/MyWebS";
    Endpoint.publish(address, implementor);
  }
}
