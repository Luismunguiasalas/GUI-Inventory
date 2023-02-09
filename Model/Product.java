/**
 * import necessary libraries in order to use ObservableList and FXCollections
 */
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/*
 * RUNTIME_ERROR: 
 * 1. main () is not found in the class, but will be using JavaFX to extend in the future and error will be gone
 * 2. forgot to add 'int' to getMachineId(), added the int before method
 * @author Luis Munguia Salas
 */
 public class Product {
  /*
   * properties
   */
  private ObservableList<Part> associatedParts = FXCollections.observableArrayList();
  private int id;
  private String name;
  private double price;
  private int stock;
  private int min;
  private int max;

  /**
   * constructor
   */
  public Product(int id, String name, double price, int stock, int min, int max) {
    // add parameter values to properties
    this.id = id;
    this.name = name;
    this.price = price;
    this.stock = stock;
    this.min = min;
    this.max = max;
  }

  /**
   * @param id the id to set
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @param stock the stock to set
   */
  public void setStock(int stock) {
    this.stock = stock;
  }

  /**
   * @param min the minimum to set
   */
  public void setMin(int min) {
    this.min = min;
  }

  /**
   * @param max the maximum to set
   */
  public void setMax(int max) {
    this.max = max;
  }

  /**
   * @return the id 
   */
  public int getId() {
    return id;
  }

  /**
   * return the name
   */
  public String getName() {
    return name;
  }

  /**
   * return the price
   */
  public double getPrice() {
    return price;
  }

  /**
   * return the stock
   */
  public int getStock() {
    return stock;
  }

  /**
   * @return the min
   */
  public int getMin() {
    return min;
  }

  /**
   * @return the max
   */
  public int getMax() {
    return max;
  }

  /**
   * @param part adds the part to the associatedParts list
   */
  public void addAssociatePart(Part part) {
    associatedParts.add(part);
  }
  
  /**
   * @remove the part from the associatedParts list
   */
  public boolean deleteAssociatedPart(Part selectedAssociatedPart) {
    return associatedParts.remove(selectedAssociatedPart);
  }

  /**
   * @return the associatedParts list
   */
  public ObservableList<Part> getAllAssociatedParts() {
    return associatedParts;
  }

 }