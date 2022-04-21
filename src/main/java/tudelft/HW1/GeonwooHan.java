package tudelft.HW1;

public class GeonwooHan {
    public String getFullName(){
        String name = "Geonwoo Han";
        return name;
    }
    public String getFirstName(){
        String name = "Geonwoo";
        return name;
    }
    public String getLastName(){
        String name = "Han";
        return name;
    }
    public String getUCInetID(){
        String name = "geonwooh";
        return name;
    }
    public int getStudentNumber(){
        int num = 38661789;
        return num;
    }

    public String getRotatedFullName(int shift){
        String name = "Geonwoo Han";
        if(shift > 0)
        {
            for(int i = 0; i < shift; i++)
            {
                name = name.charAt(1) + name.substring(2, name.length())+ name.charAt(0);
            }
        }
        else{
            shift = (-1)*shift;
            for(int i = 0; i < shift; i++)
            {
                name = name.charAt(name.length() - 1) + name.substring(0, name.length()-1);
            }
        }
        return name;
    }


}
