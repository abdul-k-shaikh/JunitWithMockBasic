package in.nit.abd;

public class CatalogService {
	
  private OperService ops;
  
  public CatalogService(OperService ops) {
	  this.ops=ops;
  }
  
  public String findCost(double cost) {
	  return "Final cost:"+ (cost + ops.findGst(cost, 10));
  }
}
