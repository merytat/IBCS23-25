package UnitP5;

public class Kennel {
    Pet[] allPets = new Pet[100];
    //polymorphism because several types of objects can be put on allPets
    int nextIndex = 0;

    public void add(Pet newPet){
        //Polymorphism because the parameter can be general enough
        //to hold different Pets
        allPets[nextIndex] = newPet;
        nextIndex++;
    }

    public String allSpeak(){
        String message = "";
        for(Pet p: allPets){
            //polymorphism because method speak will behave according
            // to different forms of pets
            if(p!= null){
                message += p.getName() + ": " + p.speak() + "\n";
            }

        }
        return message;
    }
}

class KennelRunner {
    public static void main(String[] args) {
        Kennel k = new Kennel();
        Pet p1 = new Pet("Emtpy","type1",2);
        Dog d1 = new Dog("Tina",true,"Best dog ever", 1);
        LoudDog ld1 = new LoudDog("Tony", true,"type2", 5);
        k.add(p1);
        k.add(d1);
        k.add(ld1);

        System.out.println(k.allSpeak());
    }
}
