import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book[] books = {
            new Book("B01", "Lap trinh Java", "Nguyen Van A"),
            new Book("B02", "Co so du lieu", "Tran Van B"),
            new Book("B03", "Lap trinh C++", "Le Van C")
        };

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ma sach can tim: ");
        String maSach = scanner.nextLine();

        timKiemSach(books, maSach);

        scanner.close();
    }

    public static void timKiemSach(Book[] books, String maSach) {
        boolean found = false;

        for (Book book : books) {
            if (book.getMaSach().equalsIgnoreCase(maSach)) {
                System.out.println("Tim thay sach:");
                book.hienThiThongTin();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Khong tim thay sach!");
        }
    }
}