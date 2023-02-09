/*
 * RUNTIME_ERROR: 
 * 1. main () is not found in the class, but will be using JavaFX to extend in the future and error will be gone
 * 2. forgot to add 'String' to getCompanyName(), added the String before method
 * @author Luis Munguia Salas
 */
public class Outsourced extends Part {
  /*
   * properties
   */
  private String companyName;

  /*
   * constructor
   */
  public Outsourced(int id, String name, double price, int stock, int min, int max, int machineId) {
    // call the superclass "Part" constructor
    super(id, name, price, stock, min, max);
    // set the companyName value to companyName property
    this.companyName = companyName;
  }
  /**
   * @param companyName the id to set
   */
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }
  /**
   * @return the companyName
   */
  public String getCompanyName() {
    return companyName;
  }
}