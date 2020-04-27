import java.util.Scanner;

public class Service extends Contact {

    Common common = new Common();

    public void add() {
        common.addToList();
    }

    public void edit(int phoneNumber) {
        for (Contact contact : common.getContact()) {
            if (contact.getPhoneNumber() == phoneNumber) {
                common.getContact().remove(contact);
                common.addToList();
                System.out.println("Sua thanh cong");
                break;
            } else {
                System.out.println("Sua khong thanh cong");
            }
        }
    }

    public String search(int phoneNumber) {
        String result = "";
        for (Contact contact : common.getContact()){
            if (contact.getPhoneNumber() == phoneNumber){
                result = contact.toString();
            } else {
                System.out.println("Khong tim thay");
            }
        }
        return result;
    }

    public boolean delete(int phoneNumber) {
        boolean status = false;
        for (Contact contact : common.getContact()){
            if (contact.getPhoneNumber() == phoneNumber){
                common.getContact().remove(contact);
                status = true;
                System.out.println("Xoa thanh cong");
                break;
            } else {
                status = false;
                System.out.println("Khong tim thay");
            }
        }
        return status;
    }

    public void readFromFile() {
        common.readFromFile();
    }

    public void displayFromList() {
        common.displayFromList();
    }

    public void chooseOption() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----CHUONG TRINH QUAN LY DANH BA----");
        System.out.println("Chon chuc nang theo so (de tiep tuc):");
        System.out.println("1. Xem danh sach");
        System.out.println("2. Them moi");
        System.out.println("3. Cap nhat");
        System.out.println("4. Xoa");
        System.out.println("5. Tim kiem");
        System.out.println("6. Doc tu file");
        System.out.println("7. Ghi vao file");
        System.out.println("8. Thoat");
        System.out.print("Chon chuc nang: ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                displayFromList();
                chooseOption();
                break;
            case 2:
                add();
                chooseOption();
                break;
            case 3:
                System.out.print("Nhap so dien thoai");
                int phoneNumberForEdit = scanner.nextInt();
                edit(phoneNumberForEdit);
                chooseOption();
                break;
            case 4:
                System.out.print("Nhap so dien thoai");
                int phoneNumberForDelete = scanner.nextInt();
                delete(phoneNumberForDelete);
                chooseOption();
                break;
            case 5:
                System.out.print("Nhap so dien thoai");
                int phoneNumberForSearch = scanner.nextInt();
                System.out.println(search(phoneNumberForSearch));
                chooseOption();
                break;
            case 6:
                readFromFile();
                chooseOption();
                break;
            case 7:
                chooseOption();
                break;
            case 8:
                System.exit(0);
                break;
        }
    }
}