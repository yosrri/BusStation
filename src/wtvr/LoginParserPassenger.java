package wtvr;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;

public class LoginParserPassenger implements iLogin {


   private  ArrayList<Passengers> plist;



    public ArrayList<Passengers> PassengersData(){
        try {
            File passengerInfo = new File("Passengers.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            //doc is an object that we use to access the xml file i guess
            Document doc = dBuilder.parse(passengerInfo);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("passenger");
            plist = new ArrayList<Passengers>();

            for (int temp = 0; temp <nList.getLength();temp++){
                //Made a node an assigned it to the indexed element int the arraylist called plist
                Node nNode = nList.item(temp);



                Element eElement = (Element)nNode;
                Passengers passenger = new Passengers();
                //filling the passenger object with data
                passenger.setUsername(eElement.getElementsByTagName("username").item(0).getTextContent());
                passenger.setPassword(eElement.getElementsByTagName("password").item(0).getTextContent());
                //passing the data in the object into the array list plist
                plist.add(temp,passenger);


                //Making sure that it reads from the file in the right way and it saves and prints from the array list of plist of type passenegrs
             //   System.out.println(passenger.getUsername()+ passenger.getPassword());
             //   System.out.println(plist.get(temp).getUsername());





            }

        }
            catch (Exception e){
            e.printStackTrace();
            }
                return plist;}













    }









