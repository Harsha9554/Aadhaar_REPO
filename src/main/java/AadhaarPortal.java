import IDs.Aadhaar_ID;
import IDs.Virtual_ID;

import java.io.*;

public class AadhaarPortal {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Aadhaar_ID[] Aadhaar_IDs= new Aadhaar_ID[10];
    static int ind = 0;
    public static void createAadhaar() throws IOException {

        System.out.println("-> Enter your details (Name, DOB, Age, Mobile) :");
        String name = br.readLine();
        String dob = br.readLine();
        int age = Integer.parseInt(br.readLine());
        String mobile = br.readLine();
        Aadhaar_ID temp = new Aadhaar_ID(name,dob,mobile,age);
        Aadhaar_IDs[ind] = temp;


        System.out.println("-> Creating Virtual Aadhar ID...");
        Aadhaar_IDs[ind].setVirtualID(Virtual_ID.encryptAadharID(Aadhaar_IDs[ind].getName(),Aadhaar_IDs[ind].getMobile()));
        System.out.println("-> your Virtual Aadhar ID : "+Aadhaar_IDs[ind].getVirtualID());

        ind++;
    }
    public static void main(String[] args) throws IOException {
        while(true)
        {
            System.out.println("\n-> Welcome to Aadhar portal (Select) :\n" +
                    "\t1.Create Aadhaar ID\n" +
                    "\t2.Check your Aadhaar details\n" +
                    "\t3.Display all the Aadhaar details");
            System.out.print("input : \n");
            int ch =Integer.parseInt(br.readLine());
            switch (ch) {
                case 1:createAadhaar();
                    break;

                case 2: checkAadhaar();
                    break;

                case 3:displayAllAadhaar();
                    break;
            }

        }
    }



    public static void checkAadhaar() throws IOException {
        System.out.println("-> Enter your Virtual Aadhar ID : ");
        System.out.print("input : \n");

        String vID = br.readLine();

        int flag = 0;
        for(int i=0; i<ind; i++)
        {
            if(Aadhaar_IDs[i].getVirtualID().equals(vID))
            {
                System.out.println("Aadhaar ID with Virtual Aadhar ID  EXISTS!");
                System.out.println(Aadhaar_IDs[i].printAadhar());
                flag = 1;
                break;
            }
        }
        if(flag == 0) {
            System.out.println("Aadhaar ID doesn't EXIST.");
        }

    }

    private static void displayAllAadhaar() {
        for(int i=0; i<ind; i++)
            System.out.println(Aadhaar_IDs[i].printAadhar());
    }
}
