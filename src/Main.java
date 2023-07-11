
public class Main {
    public static void main(String[] args) {
         Hotel hotel= new Hotel();
         hotel.setRent( 200);
        System.out.println(hotel);
         hotel.user();

         Flat flat= new Flat();
         flat.setPayMent("20 dollar");
        System.out.println(flat);
        flat.user();

        Dormitory dormitory= new Dormitory();
        dormitory.setRent(50);
        System.out.println(dormitory);
        dormitory.user();
    }
}