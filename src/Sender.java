// Класс Sender представляет отправителя и является наблюдателем
public class Sender implements Observer {
    // Метод update вызывается, когда статус доставки изменяется
    @Override
    public void update(String status) {
        System.out.println("Отправитель: статус доставки обновлен до " + status);
    }
}
