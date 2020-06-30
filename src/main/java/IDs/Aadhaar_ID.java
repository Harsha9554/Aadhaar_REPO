package IDs;

public class Aadhaar_ID {
    private String name;
    private String dob;
    private String mobile;
    private int age;
    private String virtualID;

    public Aadhaar_ID(String name, String dob, String mobile, int age) {
        setName(name);
        setDob(dob);
        setMobile(mobile);
        setAge(age);
    }


    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getVirtualID() {
        return virtualID;
    }

    public void setVirtualID(String virtualID) {
        this.virtualID = virtualID;
    }

    public String printAadhar() {

        return String.format("\nAadhaar ID Details :\n" +
                "\tName \t: %s\n" +
                "\tDOB \t: %s\n" +
                "\tAge \t: %d\n" +
                "\tMobile \t: %s", this.getName(), this.getDob(), this.getAge(), this.getMobile());
    }
}
