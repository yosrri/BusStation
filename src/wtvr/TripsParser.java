package wtvr;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;

public class TripsParser {

    ArrayList<Trips> tlist;
    BusStation access;
    ArrayList<Trips> dplist;


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    public ArrayList<Trips> TripsData() {
        try {
            File adminsInfo = new File("Trips.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            //doc is an object that we use to access the xml file i guess
            Document doc = dBuilder.parse(adminsInfo);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("trip");
            tlist = new ArrayList<Trips>();

            for (int temp = 0; temp < nList.getLength(); temp++) {
                //Made a node an assigned it to the indexed element int the arraylist called plist
                Node nNode = nList.item(temp);


                Element eElement = (Element) nNode;
                Trips trip = new Trips();
                trip.setType(eElement.getElementsByTagName("type").item(0).getTextContent());
                trip.setSource(eElement.getElementsByTagName("source").item(0).getTextContent());
                trip.setDestination(eElement.getElementsByTagName("destination").item(0).getTextContent());
                trip.setCircle(eElement.getElementsByTagName("circle").item(0).getTextContent());
                trip.setStops(eElement.getElementsByTagName("stops").item(0).getTextContent());
                trip.setVehicle(eElement.getElementsByTagName("vehicle").item(0).getTextContent());
                trip.setSeats(eElement.getElementsByTagName("seats").item(0).getTextContent());
                trip.setTicket(eElement.getElementsByTagName("ticket").item(0).getTextContent());
                tlist.add(temp, trip);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return tlist;
    }

    //writing to the file of trips
    public void writingToFileWithUpdatedData(ArrayList<Trips> FillTheFileWithThis) {
        try {
            access = BusStation.getInstance();

            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();

            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();

            Document document = documentBuilder.newDocument();


            // root element
            Element root = document.createElement("trips");
            document.appendChild(root);




            for (int temp = 0; temp < FillTheFileWithThis.size(); temp++) {
                // employee element
                Element trip = document.createElement("trip");
                root.appendChild(trip);


                Element type = document.createElement("type");
                type.appendChild(document.createTextNode(FillTheFileWithThis.get(temp).getType()));
                trip.appendChild(type);


                Element source = document.createElement("source");
                source.appendChild(document.createTextNode(FillTheFileWithThis.get(temp).getSource()));
                trip.appendChild(source);


                Element destination = document.createElement("destination");
                destination.appendChild(document.createTextNode(FillTheFileWithThis.get(temp).getDestination()));
                trip.appendChild(destination);


                Element circle = document.createElement("circle");
                circle.appendChild(document.createTextNode(FillTheFileWithThis.get(temp).getCircle()));
                trip.appendChild(circle);


                Element stops = document.createElement("stops");
                stops.appendChild(document.createTextNode(FillTheFileWithThis.get(temp).getStops()));
                trip.appendChild(stops);

                Element vehicle = document.createElement("vehicle");
                vehicle.appendChild(document.createTextNode(FillTheFileWithThis.get(temp).getVehicle()));
                trip.appendChild(vehicle);

                Element seats = document.createElement("seats");
                seats.appendChild(document.createTextNode(FillTheFileWithThis.get(temp).getSeats()));
                trip.appendChild(seats);

                Element ticket = document.createElement("ticket");
                ticket.appendChild(document.createTextNode(FillTheFileWithThis.get(temp).getTicket()));
                trip.appendChild(ticket);

            }

            // create the xml file
            //transform the DOM Object to an XML File
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new File("C:\\Java Programs\\BusStation\\Trips.xml"));

            // If you use
            // StreamResult result = new StreamResult(System.out);
            // the output will be pushed to the standard output ...
            // You can use that for debugging

            transformer.transform(domSource, streamResult);

            System.out.println("Done creating XML File");

        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();

        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        }
    }


    public ArrayList<Trips> driverTripsAssigned() {
        try {
            File adminsInfo = new File("Driver Trips Assigned.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            //doc is an object that we use to access the xml file i guess
            Document doc = dBuilder.parse(adminsInfo);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("trip");
            dplist = new ArrayList<Trips>();

            for (int temp = 0; temp < nList.getLength(); temp++) {
                //Made a node an assigned it to the indexed element int the arraylist called plist
                Node nNode = nList.item(temp);


                Element eElement = (Element) nNode;
                Trips trip = new Trips();
                trip.setType(eElement.getElementsByTagName("type").item(0).getTextContent());
                trip.setSource(eElement.getElementsByTagName("source").item(0).getTextContent());
                trip.setDestination(eElement.getElementsByTagName("destination").item(0).getTextContent());
                trip.setCircle(eElement.getElementsByTagName("circle").item(0).getTextContent());
                trip.setStops(eElement.getElementsByTagName("stops").item(0).getTextContent());
                trip.setVehicle(eElement.getElementsByTagName("vehicle").item(0).getTextContent());
                trip.setSeats(eElement.getElementsByTagName("seats").item(0).getTextContent());
                trip.setTicket(eElement.getElementsByTagName("ticket").item(0).getTextContent());
                dplist.add(temp, trip);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return dplist;
    }}




















