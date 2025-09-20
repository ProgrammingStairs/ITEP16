// example showing the concept of file handling 

import java.io.*;
class Demo13{
    public static void main(String args[]){
        
        File file = new File("D:\\desktop\\ITEP_BATCH_16th\\ITEP16\\CoreJava\\18 File Handling\\myFolder\\newFile.txt");
      
        try(FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw)){    
            bw.write("statement 1");
            bw.newLine();
            bw.write("statement 2");
            bw.newLine();
            bw.write("statement 3");
            System.out.println("data inserted successfully");
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
        
        try(FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr)){    
            while(true){
                int x = fr.read();
                if(x==-1)
                    break;
                System.out.print((char)x);
            }
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
    }
}