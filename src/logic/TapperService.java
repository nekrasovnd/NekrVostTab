package logic;

import java.util.HashMap;
import java.util.Map;

public class TapperService {
    private final Map<Long, Integer> userBalances = new HashMap<>(); // Храним баланс для каждого chatId

    // Метод для получения баланса пользователя по chatId
    public int getBalance(long chatId) {
        return userBalances.getOrDefault(chatId, 0); // Если баланс не найден, возвращаем 0
    }

    // Метод для увеличения баланса пользователя по chatId
    public void incrementBalance(long chatId) {
        userBalances.put(chatId, userBalances.getOrDefault(chatId, 0) + 1);
    }
}

// создать DAO: получение баланса, сохранение баланса, проверка существования баланса пользователя
// для него ввести интерфейс и реализацию с map