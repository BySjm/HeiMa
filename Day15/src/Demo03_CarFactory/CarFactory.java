package Demo03_CarFactory;

public class CarFactory {
    public Car createCat(String name){
        if (name.equals("001")){
            return new Falali();

        }else if (name.equals("002")){
            return new Benchi();
        }
        return null;
    }
}
