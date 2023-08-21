public class Phone {
    String number;
    String model;
    int weight;

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone(int weight, String number, String model) {
        this(number,model);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
    public void receiveCall(String name) {
        System.out.println("Звонит " + name);

    }
    public String getNumber() {
        return   "Номер абонента: " + number;
    }
    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name);
        System.out.println("Номер абонета: " + number);
    }
    public void sendMessage(String number){
        System.out.println("Сообщение отправлено: " + number);
    }

}
