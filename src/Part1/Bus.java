package Part1;

public class Bus extends MotoVehicle {
    private int seatCournt;

    public Bus(String brand, int seatCournt) {
        super(brand);
        this.seatCournt = seatCournt;
    }

    public int getSeatCournt() {
        return seatCournt;
    }

    public void printRent(int days) {
        int pay = 0;
        if (seatCournt < 16) {
            pay = days * 400;

        } else {
            pay = days * 800;
        }
        System.out.println("����" + super.getBrand() + seatCournt + "���ͳ�" + days + "��");
        System.out.println("�踶���" + pay + "Ԫ");

    }
}