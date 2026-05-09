package baitapstaff;
import java.util.ArrayList;

public class Staff {

    private ArrayList<StaffMember> staffList;

    public Staff() {

        staffList = new ArrayList<>();


        // Executive
        Executive boss = new Executive(
                "Nguyen Van A",
                "Ha Noi",
                "0901234567",
                "111-22-3333",
                8000
        );

        boss.awardBonus(2500);

        staffList.add(boss);


        // Hourly Employee 1
        Hourly worker1 = new Hourly(
                "Tran Thi B",
                "Da Nang",
                "0911222333",
                "222-33-4444",
                120
        );

        worker1.addHours(35);

        staffList.add(worker1);


        // Hourly Employee 2
        Hourly worker2 = new Hourly(
                "Le Van C",
                "Can Tho",
                "0933444555",
                "333-44-5555",
                150
        );

        worker2.addHours(42);

        staffList.add(worker2);


        // Volunteer 1
        Volunteer volunteer1 = new Volunteer(
                "Pham Thi D",
                "Nha Trang",
                "0944555666"
        );

        staffList.add(volunteer1);


        // Volunteer 2
        Volunteer volunteer2 = new Volunteer(
                "Hoang Van E",
                "Hue",
                "0955666777"
        );

        staffList.add(volunteer2);
    }

    public void payday() {

        for (StaffMember staff : staffList) {

            System.out.println(staff);

            double amount = staff.pay();

            System.out.println("Luong nhan duoc: " + amount);

            System.out.println("--------------------------");
        }
    }
}