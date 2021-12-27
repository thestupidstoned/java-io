import java.io.*;
import java.util.Scanner;

public class mainClass {

    public static void main(String[] args) {

        FileInputStream fis, fis2,fis3,fis4,fis5;
        FileOutputStream ois;
        BufferedInputStream bis,bis2;
        //BufferedOutputStream bos;
        FileReader fr;
        FileWriter fw;
        File inputFile,outputFile;
        int i=0;
        int c;
        try{ inputFile =new File("C:\\Users\\anujkumar\\IdeaProjects\\byte_is\\src\\inputFile.txt");
            outputFile= new File("C:\\Users\\anujkumar\\IdeaProjects\\byte_is\\src\\outputFile.txt");
            fis=  new FileInputStream(inputFile);
              fis2=  new FileInputStream(inputFile);
            fis3=  new FileInputStream(inputFile);
            fis4=  new FileInputStream(inputFile);
            fis5=  new FileInputStream(inputFile);
            bis= new BufferedInputStream(fis4);
            bis2= new BufferedInputStream(fis5);
            fr= new FileReader(inputFile);
            ois=new FileOutputStream(outputFile, true);
            fw=new FileWriter(outputFile,   true);


            System.out.println("Using InputStream byte class");
        while((c= fis.read())!=-1){
            System.out.print("("+i+")"+c+" - ");
            ois.write(c);
            i=i+1;
        }

            System.out.println();
            System.out.println("Using InputStream char class");
            i=0;

            while((c= fis2.read())!=-1){
                System.out.print("("+i+")"+(char)c+" - ");
                ois.write((char)c);
                i=i+1;
            }
            System.out.println();
            System.out.println("Using Scanner class");

            Scanner sc= new Scanner(fis3);
        i=0;
            while(sc.hasNext()){
                //System.out.println("Inside Scanner class");
                System.out.print("("+i+")"+sc.next()+" - ");

                i=i+1;
            }


            System.out.println();
            System.out.println("Using Buffered byte class");
            i=0;
            while((c=bis.read())!=-1){
                System.out.print("("+i+")"+c+" - ");
                i=i+1;
            }


            System.out.println();
            System.out.println("Using Buffered char class");
            i=0;
            while((c=bis2.read())!=-1){
                System.out.print("("+i+")"+(char)c+" - ");
                i=i+1;
            }

            System.out.println();
            System.out.println("Using FileReader char class");
            i=0;
            while((c=fr.read())!=-1){
                System.out.print("("+i+")"+c+" - ");
                fw.write(c);
                i=i+1;
            }




        }
        catch (Exception ex){
            System.out.println("CATCHED");
        }

    }
}
