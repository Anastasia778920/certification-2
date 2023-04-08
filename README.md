# Информация о проекте 
проект состоит из 2-х частей: 
1. Linux - выполнить в командной строке 
2. Программа на Java - необходимо написать программу, для розыгрыша игрушек в магазине детских товаров 

# Как сдавать проект 
1. Первую часть по Linux можно сдавать скринами терминала, текстовым или PDF файлом и приложить к проекту и/или добавить на github 
2. Вторую часть программы на Java - выкладываем в отдельный общедоступный репозиторий Github. Программа должна запускаться и работать]6 ошибок при выполнении программы быть не должно 

# Задание 1
1. Используйте команды операционной системы Linux и создайте две новых директории - "Игрушки для школьников". Текстовые файлы - "Роботы", "Конструктор", "Настольные игры" 
2. Создайте в директории "Игрушки для школьников" текстовые файлы - "Роботы", "Конструктор", "Настольные игры" 
3. Создайте в директории "Игрушки для дошколят" текстовые файлы "Мягкие игрушки", "Куклы", "Машинки" 
4. Объединить 2 директории в одну "Имя Игрушки" 
5. Переименовать директория "Имя Игрушки" в "Игрушки" 
6. Просмотреть содержимое каталога "Игрушки" 
7. Установить и удалить snap-пакет
8. Добавить произвольнуб задачу для выполнения каждые 3 минуты 

# Задание 2
Необходимо написать программу - розыгрыша игрушек в магазине детских товаров
Стараемся применять ООП и работы с файлами 
Если какой то пункт не изучали и не знаете, как сделать, то можете сделать своим способом 

Желательный функционал программы: 
В программе должен быть минимум один класс со следующими свойствами: 
1. id игрушки 
2. текстовое название 
3. количество 
4. частота выпадения игрушки 

Метод добавление новых игрушек и возможность изменения веса (частоты выпадения игрушки)
Возможность организовать розыгрыш игрушек 
Например, следующим образом: 
С помощью метода выбора произвольной игрушки - мы получаем эту произвольную игрушку и записываем ее в список/масив 
Этот список призовых игрушек, которые ожидают выдачи 
Еще у нас должен быть метод - получения произвольной игрушки 
После его вызова - мы удаляем из списка/массива первую игрушку и сдвигаем массив. А эту игрушку записываем в текстовый файл 
Не забываем уменьшить количество игрушек 
