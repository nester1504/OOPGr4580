package Controller;

// Список команд
public enum Command {
    NONE,   // Пустая команда, используется по умолчанию или при ошибке
    READ,   // Команда для чтения информации о студентах
    CREATE, // Команда для создания нового студента
    UPDATE, // Команда для обновления информации о студенте
    LIST,   // Команда для вывода списка всех студентов
    DELETE, // Команда для удаления студента
    EXIT    // Команда для выхода из программы
}