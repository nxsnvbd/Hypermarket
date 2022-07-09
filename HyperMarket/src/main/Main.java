package main;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main 
{
    //TEMP ARRAY customerList
    private static ArrayList<CustomerInformation> customerList = new ArrayList();
    private static ArrayList<String> listCustID = new ArrayList<String>();
    
    //STORING ALL COUNTER CUSTOMER QUEUE
    private static Queue counter1 = new LinkedList();
    private static Queue counter2 = new LinkedList();
    private static Queue counter3 = new LinkedList(); //ITEM MORE THAN 5
    
    
    public static Queue getCounter1()
    {
        return counter1;
    }
    
    public static Queue getCounter2()
    {
        return counter2;
    }
    
    public static Queue getCounter3()
    {
        return counter3;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //1. READ TEXTFILE AND ADD TO TEMPORARY ARRAY
        try {
            BufferedReader br = new BufferedReader(new FileReader("customerdata.txt"));
            String line = br.readLine();

            String customerID = "";
            String customerIC = "";
            String customerName = "";
            String currentCustID = "";

            while (line != null) {
                //READ DATA EACH LINE
                StringTokenizer st = new StringTokenizer(line, ",");
                customerID = st.nextToken();
                customerIC = st.nextToken();
                customerName = st.nextToken();
                String itemID = st.nextToken();
                String itemName = st.nextToken();
                double itemPrice = Double.parseDouble(st.nextToken());
                String datePurchase = st.nextToken();
                if (!customerID.equalsIgnoreCase(currentCustID)) 
                {
                    listCustID.add(customerID);
                    currentCustID = customerID;
                }

                customerList.add(new CustomerInformation(customerID, customerIC, customerName, null, 
                        itemID, itemName, itemPrice, datePurchase));

                line = br.readLine();
            }
            br.close();

            //ADD TO QUEUE
            int counterswitching = 1;
            for (int i = 0; i < listCustID.size(); i++) 
            {
                List filtereditemcustomer = filteritemdatacust(listCustID.get(i));

                if (filtereditemcustomer.size() <= 5) 
                {
                    if (counterswitching == 1) 
                    {
                        for (int j = 0; j < filtereditemcustomer.size(); j++) 
                        {
                            CustomerInformation itemdata = (CustomerInformation) filtereditemcustomer.get(j);
                            String custID = itemdata.getCustID();
                            String custIC = itemdata.getCustIC();
                            String custName = itemdata.getCustName();
                            String itemID = itemdata.getItemID();
                            String itemName = itemdata.getItemName();
                            Double itemPrice = itemdata.getitemPrice();
                            String datePurchased = itemdata.getDatePurchase();

                            main.Main.getCounter1().add(new CustomerInformation(custID, custIC, custName, "counter1", 
                                    itemID, itemName, itemPrice, datePurchased));
                        }
                        counterswitching = 2;
                        
                    }
                    
                    else if (counterswitching == 2)
                    {
                        for (int j = 0; j < filtereditemcustomer.size(); j++)
                        {
                            CustomerInformation itemdata = (CustomerInformation) filtereditemcustomer.get(j);
                            String custID = itemdata.getCustID();
                            String custIC = itemdata.getCustIC();
                            String custName = itemdata.getCustName();
                            String itemID = itemdata.getItemID();
                            String itemName = itemdata.getItemName();
                            Double itemPrice = itemdata.getitemPrice();
                            String datePurchased = itemdata.getDatePurchase();

                            main.Main.getCounter2().add(new CustomerInformation(custID, custIC, custName, "counter2", 
                                    itemID, itemName, itemPrice, datePurchased));

                        }
                        counterswitching = 1;
                    }
                } 
                
                else 
                {
                    for (int j = 0; j < filtereditemcustomer.size(); j++) 
                    {
                        CustomerInformation itemdata = (CustomerInformation) filtereditemcustomer.get(j);
                        String custID = itemdata.getCustID();
                        String custIC = itemdata.getCustIC();
                        String custName = itemdata.getCustName();
                        String itemID = itemdata.getItemID();
                        String itemName = itemdata.getItemName();
                        Double itemPrice = itemdata.getitemPrice();
                        String datePurchased = itemdata.getDatePurchase();

                        main.Main.getCounter3().add(new CustomerInformation(custID, custIC, custName, "counter3", 
                                itemID, itemName, itemPrice, datePurchased));

                    }
                }
            }

            new CounterChoose().setVisible(true);
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
    }
    
    public static List filteritemdatacust(String custID) 
    {
        Predicate<CustomerInformation> itemSelectCondition = itemsCond -> itemsCond.getCustID().equalsIgnoreCase(custID);
        List itemsCustomer = customerList.stream().filter(itemSelectCondition).collect(Collectors.toList());
        return itemsCustomer;
    }
   
}



