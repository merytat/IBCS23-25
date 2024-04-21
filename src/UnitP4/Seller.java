package UnitP4;

public class Seller {
    private String name;
    //how do I create a list of 100 Product?
    private Product[] products;
    int prodCount;

    //sortbyId
    public void sortById(){
        //bubble sort
        for(int i = 0; i < prodCount; i++){
            for(int j = 0; j < prodCount-i; j++){
                if(products[j].getId() > products[j+1].getId()){
                    //swap
                    Product temp = products[j];
                    products[j] = products[j+1];
                    products[j+1] = temp;
                }
            }
        }
    }

    //removeProduct
    public void removeProduct(Product p){
        //linear search
        for(int i = 0; i < prodCount; i++){
            if(products[i].equals(p)){
                products[i]=null;
                prodCount--;
                //shifting all the rest of products one position
                for(int j = i+1; j < prodCount; j++){
                    products[j-1]= products[j];
                }
                //stopping the loop once p is found
                i = prodCount;
            }
        }

    }

    //replaceProduct: change th eproduct at position index
    // with newP
    public void replaceProduct(Product newP, int index){
        if(products[index]!= null){
            this.products[index] = newP;
        }
        else{
            System.out.println("There isn't a prodcut in that position");
        }

    }


    //addProduct
    public void addProduct(Product p){
        if (prodCount < 99){
            products[prodCount]= p;
            prodCount++;
        }
        else{
            System.out.println("You've reached the limit of products");
        }
    }

    public Seller() {
        this.name = " ";
        this.products = new Product[100];
        prodCount = 0;
    }

    public Seller(String name, int numProducts){
        this.name = name;
        this.products = new Product[numProducts];
        prodCount = 0;
    }


}
