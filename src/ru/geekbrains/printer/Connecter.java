package ru.geekbrains.printer;

import java.net.URL;

public interface Connector {
  boolean connect (String url);
  boolean connect (URL url);
}
