package IDs;

public class Virtual_ID {
    public static String encryptAadharID(String name, String mobile){
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
        String temp_name = name.trim();
        int key = temp_name.length();
//        System.out.println(key);

        StringBuilder vID_1 = new StringBuilder();
        StringBuilder vID_2 = new StringBuilder();

        if(temp_name.length()>=5)
        {
            for(int i=0; i<5; i++)
            {
                char temp = temp_name.charAt(i);
                for(int j=0; j<alphabet.length; j++)
                {
                    if(alphabet[j]==temp)
                        vID_1.append(alphabet[(j + key) % alphabet.length]);
                }
            }

            for(int i=5; i<10; i++)
            {
                int temp = Integer.parseInt(String.valueOf(mobile.charAt(i)));
                vID_2.append((temp + key) % 10);
            }
        }
        else {
            for(int i=0; i<temp_name.length(); i++)
            {
                char temp = temp_name.charAt(i);
                for(int j=0; j<alphabet.length; j++)
                {
                    if(alphabet[j]==temp)
                        vID_1.append(alphabet[(j + key) % alphabet.length]);
                }
            }
            for(int i = temp_name.length(); i<10; i++)
            {
                int temp = Integer.parseInt(String.valueOf(mobile.charAt(i)));
                vID_2.append((temp + key) % 10);
            }
        }
        return vID_1.toString() +vID_2;
    }
}

