public class Phone_test {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+375295842145","Samsung S20", 254);
        Phone phone2 = new Phone("+37525971265","POCO 5Gt",270 );
        Phone phone3 = new Phone("+375336597852", "Huawei P30",230);


        System.out.println(phone1.toString());
        System.out.println(phone2.toString());
        System.out.println(phone3.toString() + "\n");

        phone1.receiveCall("Виктория");
        System.out.println(phone1.getNumber());
        phone1.receiveCall("Сергей");
        System.out.println(phone2.getNumber());
        phone1.receiveCall("Вера");
        System.out.println(phone3.getNumber() + "\n");

        phone1.sendMessage(phone1.number+ "\n"+phone2.number+"\n"+phone3.number);

    }

}
