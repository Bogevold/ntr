package no.tbo.ntr.dao;

public class Person {
  private int persId;
  private String navn;
  private int fodtAar;
  
  public Person() {

  }
  
  public int getPersId() {
    return persId;
  }
  public void setPersId(int persId) {
    this.persId = persId;
  }
  public String getNavn() {
    return navn;
  }
  public void setNavn(String navn) {
    this.navn = navn;
  }
  public int getFodtAar() {
    return fodtAar;
  }
  public void setFodtAar(int fodtAar) {
    this.fodtAar = fodtAar;
  }

  @Override
  public String toString() {
    return "Person [persId=" + persId + ", navn=" + navn + ", fodtAar=" + fodtAar + "]";
  }
  
  
  
}
