import java.io.*;
import java.util.*;
class quine {

     public static void main(String[] args){
      String f = "import java.io.*;"
      	+ "import java.util.*;"
        + "class quine { "
        + "public static void main(String[] args) {"
        + "String f =%c%s%1$c;"
        + "try {"
        + "int id = (1212927233%%3)+2;"
        + "for(int x=0;x<id;x++) {"
        + "String fileName = UUID.randomUUID().toString();"
        + "PrintWriter pw = new PrintWriter(fileName);"
        + "pw.format(f, 11, f);"
        + "pw.close();"
        + "}"
        + "}"
        + "catch ( IOException e ) {"
        + "e.printStackTrace();"
        + "}}}";
      try {
      		int id = (1212927233%3)+2;
      		for(int x=0;x<id;x++){
      			String fileName = UUID.randomUUID().toString();
            	PrintWriter pw = new PrintWriter(fileName);
      			pw.format(f, 11, f);
      			pw.close();
      		}
        }
        catch ( IOException e ) {
            e.printStackTrace();
        }
     }

}