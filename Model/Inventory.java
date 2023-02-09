/*
 * RUNTIME_ERROR: 
 * @author Luis Munguia Salas
 */
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Inventory {
  /**
   * properties
   */
  private static ObservableList<Part> allParts = FXCollections.observableArrayList();
  private static ObservableList<Product> allProducts = FXCollections.observableArrayList();

  /**
   * @param newPart add part to allParts list
   */
  public static void addPart(Part newPart) {
    allParts.add(newPart);
  }
  
  /**
   * @param Product add product to allProducts list
   */
  public static void addProduct(Product newProduct) {
    allProducts.add(newProduct);
  }

  /**
   * @return Part from allParts list
   */
  public static Part lookupPartId(int partId) {
    Part partToFind = null;
    for (Part part : allParts) {
      if (part.getId() == partId) {
        partToFind = part;
      }
    }
    return partToFind;
  }

  /**
   * @return Product from allProducts list
   */
  public static Product lookupProductId(int productId) {
    Product productToFind = null;
    if (Product product: allProducts) {
      if (product.getId() == productId) {
        productToFind = product;
      }
    }
    return productToFind;
  }

  /**
   * @return ObservableList of all parts 
   */
  public static ObservableList<Part> lookupPartName(String partName) {
    // to hold matching parts
    ObservableList<Parts> matchedParts = FXCollections.observableArrayList();
    // if entry is empty, then return all parts in list
    if(partName.length() == 0) {
        matchedParts = allParts;
    }
    // else find all matching parts that contain matching characters
    else {
      for (Part part : allParts) {
        if (part.getName().toLowerCase().contains(partName.toLowerCase())) {
          matchedParts.add(part);
        }
      }
    }

    return matchedParts;
  }

  /**
   * @return Observable list of all products
   */
  public static ObservableList<Product> lookupProductName(String productName) {
    // to hold matching products
    ObservableList<Product> matchedProducts = FXCollections.observableArrayList();
    // if entry is empty, then return all products in list
    if (productName.length() == 0) {
      matchedProducts = allProducts;
    }
    // else find all matching products that contain matching characters
    else {
      for (Product product : allProducts) {
        if (product.getName().toLowerCase().contains(productName.toLowerCase())) {
          matchedProducts.add(product);
        }
      }
    }
    return matchedProducts;
  }

  /**
   * @param index, @param newPart add part at index in allParts list
   */
  public static void updatePart(int index, Part newPart) {
    allParts.set(index, newPart);
  }

  /**
   * @param index, @param newProduct add proudct at index in allProducts list
   */
  public static void updateProduct(int index, Product newProduct) {
    allProducts.set(index, newProduct);
  }

  /**
   * @return boolean, delete part from allParts list
   */
  public static boolean deletePart(Part part) {
    allParts.remove(part);
  }

  /**
   * @return boolean, delete part from allProducts list
   */
  public static boolean deleteProduct(Product product) {
    allProducts.remove(product);
  }

  /**
   * @return Observable list of allParts
   */
  public static ObservableList<Part> getAllParts() {
    return allParts;
  }

  /**
   * @return Observable list of allProducts
   */
  public static ObservableList<Product> getAllProducts() {
    return allProducts;
  }
}
