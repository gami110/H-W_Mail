
public class Main {
    public static void main(String[] args) {
        // Создаем новое почтовое отправление
        MailFactory factory = new MailFactory();
        Mail mail = factory.createMail();
        // Создаем отправителя и получателя
        Sender sender = new Sender();
        Receiver receiver = new Receiver();
        // Добавляем отправителя и получателя в список наблюдателей почтового отправления
        mail.addObserver(sender);
        mail.addObserver(receiver);

        mail.setStatus("Отправлено");
        mail.setStatus("В пути");
        mail.setStatus("Доставлено");
    }
}