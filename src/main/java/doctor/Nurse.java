package doctor;

public class Nurse implements Staff {

    private String name;
    public void assist(){
        System.out.println("Nurse is currently assisting");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
