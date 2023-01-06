package baitapthem.service;

import baitapthem.model.Manufacturer;
import ss8_arraylist_linkedlist.ArrayList.MyList;

import java.util.ArrayList;
import java.util.List;

public class ManufactureService {
    private static List<Manufacturer> manufacturerList = new ArrayList<>();

    public ManufactureService(){
        manufacturerList.add(new Manufacturer("HT","Toyota","JaPan"));
        manufacturerList.add(new Manufacturer("HN","KIA","Korea"));
        manufacturerList.add(new Manufacturer("SG","AUDI","USA"));
    }
    public List<Manufacturer> findALL(){
        return manufacturerList;
    }
    public static Manufacturer findByName(String name){
        for (int i = 0; i < manufacturerList.size() ; i++){
            if(manufacturerList.get(i).getName().equals(name)){
                return manufacturerList.get(i);
            }
        }
        return null;
    }
}
