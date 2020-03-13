package user;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Test {
    public static void main(String[] args) {
          String str = "Hello";
//        str = "h" + str.substring(1);
          str = "h"+str.substring(1);
          System.out.println(str);
          Filed filed = String.getDeclaredFiled("vaule");
         filed.setAccessible(true);
         char[] vaule =(char[]) filed.get(str);
         vaule[0] ='h';
         System.out.println(str);
    }
}
