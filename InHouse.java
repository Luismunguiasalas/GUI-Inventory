import Part.java

public class InHouse extends Part{
  private int machineId;
  public InHouse(int id, String name, double price, int stock, int min, int max, int machineId) {
    // super()
    new part = new Part(id, name, price, stock, min, max, machineId);

  }

  public  void setMachineId(int machineId) {
    this.machineId = machineId;
  }

  public getMachineId() {
    return this.machineId;
  }
}