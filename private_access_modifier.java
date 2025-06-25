class employee1{
  private  int id;
  private  String name;

    public void setname(String n){
      name = n;
  }
    public String getname(){
        return name;
    }
    public void setId(int i){
        id = i;
    }
    public int getId() {
        return id;
    }
}

public class private_access_modifier {
    public static void main(String[] args) {
        employee1 e = new employee1();
        e.setname("mayank bhanwara");
        System.out.println(e.getname());
        e.setId(123);
        System.out.println(e.getId());
    }
}