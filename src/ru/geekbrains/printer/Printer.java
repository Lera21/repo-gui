package ru.geekbrains.printer;
// API - программный интерфейс приложения. Интерфейс - эти тип данных. Хранит только абстрактные публичные методы. О
// Отлично подходит для оеализации контракта
// Интерфейс может быть либо public либо вообще не писать (default). Задача интерфейса- быть недоступен. Не даст нам ошибиться
// Абстрактный класс может быть закрытым. А интерфейс нет. Интерфейс содержит максимально публичные методы
// Интерфейс нужен для обеспечения публичности. Это публичная штука.
// Интерфейс иногда нужен чтобы добавлять туда константы
// На сайте оракл прочитать про интерфейс

import java.net.URL;

public interface Printer {
  public static final int TYPE_ONE = 1;
 public static final int TYPE_TWO = 2;

 public void print(String value);

  public abstract void analyze(String value);

  boolean connect(String url);
  boolean connect(URL url);
}
