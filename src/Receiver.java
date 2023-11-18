// Класс Receiver представляет получателя и является наблюдателем
public class Receiver implements Observer {

    // Метод update вызывается, когда статус доставки изменяется
    @Override
    public void update(String status) {
        System.out.println("Получатель: статус доставки обновлен до " + status);
    }
}