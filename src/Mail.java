import java.util.*;

public class Mail {
    private String status; // Статус доставки
    private List<Observer> observers = new ArrayList<>(); // Список наблюдателей
    // Метод для добавления наблюдателя
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    // Метод для изменения статуса доставки
    public void setStatus(String status) {
        this.status = status;
        // При изменении статуса, уведомляем всех наблюдателей
        for (Observer observer : observers) {
            observer.update(status);
        }
    }
}
