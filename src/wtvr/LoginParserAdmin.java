package wtvr;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;

public class LoginParserAdmin {

    ArrayList<Admins> alist;


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



    public ArrayList<Admins> AdminsData(){
        try {
            File adminsInfo = new File("Admins.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            //doc is an object that we use to access the xml file i guess
            Document doc = dBuilder.parse(adminsInfo);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("admin");
            alist = new ArrayList<Admins>();

            for (int temp = 0; temp <nList.getLength();temp++){
                //Made a node an assigned it to the indexed element int the arraylist called plist
                Node nNode = nList.item(temp);



                Element eElement = (Element)nNode;
                Admins admin = new Admins();
                admin.setUsername(eElement.getElementsByTagName("username").item(0).getTextContent());
                admin.setPassword(eElement.getElementsByTagName("password").item(0).getTextContent());
                alist.add(temp,admin);
               // System.out.println(passenger.getUsername()+passenger.getPassword());
                //System.out.println(alist.get(0).getUsername());

            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
        return alist;}













}









