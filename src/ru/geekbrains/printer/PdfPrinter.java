package ru.geekbrains.printer;

public class PdfPrinter implements Printer{

  @Override
  public void print(String value) {
    System.out.println("A2 Format file printing....");

  }

  @Override
  public void analyze(String value) {
    System.out.println("A2 Format file analysis..." + value);
  }
}
