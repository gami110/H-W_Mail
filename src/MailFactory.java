// Класс MailFactory представляет фабрику для создания почтовых отправлений
public class MailFactory {
    // Метод createMail создает новое почтовое отправление
    public Mail createMail() {
        return new Mail();
    }
}
