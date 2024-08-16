public class getset {
    public static void main (String[] args) throws Exception{
        Data d= new Data();
        d.setName("Krima");
        System.out.println(d.getName());
    }
    
}
class Data{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}