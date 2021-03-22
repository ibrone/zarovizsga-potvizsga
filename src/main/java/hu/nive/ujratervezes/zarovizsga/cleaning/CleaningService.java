package hu.nive.ujratervezes.zarovizsga.cleaning;

import java.util.ArrayList;
import java.util.List;

public class CleaningService {

    private List<Cleanable> cleanables;

    public CleaningService() {
        cleanables = new ArrayList<>();
    }

    public void add (Cleanable cleanable){
        cleanables.add(cleanable);
    }

    public int cleanAll (){
        int sum = 0;
        for (Cleanable cl: cleanables) {
            sum += cl.clean();
        }
        cleanables.clear();
        return sum;
    }

    public List<Cleanable> getCleanables() {
        return cleanables;
    }

    public int cleanOnlyOffices (){
        int sum =0;
        for (Cleanable cl: cleanables) {
            if (cl instanceof Office){
                sum += cl.clean();
                cleanables.remove(cl);
            }
        }
        return sum;
    }

    public List<Cleanable> findByAddressPart (String address){
    List<Cleanable> realEstates = new ArrayList<>();
    for (Cleanable cl: cleanables){
        if (cl.getAddress().contains(address)){
            realEstates.add(cl);
        }
    }
    return realEstates;
    }

    public String getAddresses (){
        StringBuilder sb = new StringBuilder();
        for (Cleanable cl:cleanables){
            sb.append(cl.getAddress()+", ");
        }
        sb.deleteCharAt(sb.length()-2);
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

}
