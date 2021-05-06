import java.io.*;
import java.net.*;
import java.util.*;

class Details{
  public static void main(String args[]) throws Exception
  {
    URL obj = new URL("http://www.google.com/index.html");
    URLConnection conn = obj.openConnection();

    System.out.println("Date: " + new Date(conn.getDate()));
    System.out.println("Content Type: " + conn.getContentType());
    System.out.println("Expiry Date: " + conn.getExpiration());
    System.out.println("Date: " + new Date(conn.getLastModified()));

    int l = conn.getContentLength();
    System.out.println("Length of Content:" + l);
    if(l==0){
      System.out.println("Content not available");
      return;
    }
    else{
      int ch;
      InputStream in = conn.getInputStream();

      while((ch = in.read())!= -1)
        System.out.print((char)ch);
    }
  }
}
