package Ch9.AbstractClasses.Interfaces.Interface;

public class Main {
    public static void main(String[] args) {
        // DeskPhone timsPhone; also valid!!!
        ITelephone timsPhone;
        timsPhone = new DeskPhone(482532);
        timsPhone.powerOn();
        timsPhone.callPhone(482532);
        timsPhone.answer();

        timsPhone = new MobilePhone(5554441);
        timsPhone.powerOn();
        timsPhone.callPhone(5554441);
        timsPhone.answer();
    }
}
