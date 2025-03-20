package Mock;

public class Runner {
    public static void main(String[] args) {
        //instantiation of a class
        House G2345 = new House("G2345", "G2345", "Thuwal", 2000, true);
        House G3456 = new House("G3456","G3456", "Bogota", 300, false);
        System.out.println(G2345.getCity());
        System.out.println(House.getNoBuilt()); //static method referenced using name of class NOT object

        //wishlist
        House wishlist[] = new House[10];
        wishlist[0] = G3456;
        wishlist[1] = new House("s","asf","asd",300,true);

        //allHouses
        House allHouses[] = new House[300];
        allHouses[4] = G2345;
        allHouses[6] = G3456;

        //print all houses in Thuwal
        unknown(allHouses, "Thuwal");

        //sorting the array all houses by ascending order of price
        //selection sort

        for(int i = 1; i <allHouses.length; i++){
            House min = allHouses[i-1];
            int priceMin = allHouses[i-1].getPrice();
            for(int j = i; j<allHouses.length; j++){
                if(allHouses[j]!= null && allHouses[j].getPrice() < priceMin){
                    min = allHouses[j];
                    priceMin = allHouses[j].getPrice();
                }
            }
            //swap
        }

    }
    public static void unknown(House[] allHouses, String x) {
        for (int i = 0; i < allHouses.length; i++) {
            if (allHouses[i]!=null && allHouses[i].getCity().equals(x)) {
                System.out.println(allHouses[i].getAddress());
            }
        }
    }
    }
