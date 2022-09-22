package q2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Mobile {
    HashMap<String, ArrayList<String>> mobiles = new HashMap<>();


    public String addMobile(String company, String model){
        ArrayList<String> a = new ArrayList();
        a.add(model);
        mobiles.put(company,a);
        return "Mobile added successfully";
    }


    public static void main(String[] args) {

        Mobile m =new Mobile();
        m.addMobile("apple","iphone14");
        m.addMobile("MI","iphone12");
        m.addMobile("Ipnoe","iphone10");
        m.addMobile("sumsang","iphone11");

        System.out.println(m.mobiles);

    }


    public List<String> getModels (String company) throws InvalidMobileException{

        mobiles.keySet();

        return null;
    }


}