
package democsv;
import java.io.IOException;
import com.opencsv.CSVWriter;
import com.opencsv.CSVReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.List;


/**
 *
 * @author zach malonjao
 */
public class DemoCSV {

    
    public static void main(String[] args) {
      
        try
        {
            
        //Make Array lines    
         String[] header = {"First Name", "Last Name", "Age"};
         String[] record1 = {"Jojo", "Siwa", "20"};   
         String[] record2 = {"Michael", "hee-hee", "40"};
         
// 1. Make Writer object + file           
           String csvFile = "example.csv";
            CSVWriter writer = new CSVWriter(new FileWriter(csvFile));
 

     //Put 'em into a csv  
         writer.writeNext(header);
         writer.writeNext(record1);
         writer.writeNext(record2);  

        
      //CLOSE WRITER       
         writer.close();
         
      //Edit array contents
         record1[0] = "Monggo";
         writer.writeNext(record1);
         
 //2. Make Reader object
           CSVReader reader = new CSVReader(new FileReader(csvFile));
      
     //Make a list for looping
           List <String[]> records = reader.readAll();
             for(String[] record: records)
             {
                for (String anotherRecord: record)
                    System.out.print(anotherRecord + " ");
                    System.out.println();
                       
             }
     //close reader
            reader.close();
        }
        catch(IOException e){
          e.getMessage();}
        
    }
    
}
