package wtvr;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.lang.reflect.Array;
import java.sql.Driver;
import java.util.ArrayList;

public class LoginParserDriver {


    ArrayList<Drivers> dlist;

    public ArrayList<Drivers> DriversData(){
        try {
            File passengerInfo = new File("Drivers.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            //doc is an object that we use to access the xml file i guess
            Document doc = dBuilder.parse(passengerInfo);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("driver");
            dlist = new ArrayList<Drivers>();

            for (int temp = 0; temp <nList.getLength();temp++){
                //Made a node an assigned it to the indexed element int the arraylist called plist
                Node nNode = nList.item(temp);



                Element eElement = (Element)nNode;
                Drivers driver = new Drivers();
                driver.setUsername(eElement.getElementsByTagName("username").item(0).getTextContent());
                driver.setPassword(eElement.getElementsByTagName("password").item(0).getTextContent());
                dlist.add(temp,driver);
               // System.out.println(passenger.getUsername()+ passenger.getPassword());






            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
        return dlist;}













}









