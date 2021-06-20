public class my_proj {
    public String Hellow(){
        return "Hello world";
    }
    public static void main(String[] args) {
        String my_string;
        my_proj obj = new my_proj();
        my_string = obj.Hellow();
        System.out.println(my_string);
    }
}
