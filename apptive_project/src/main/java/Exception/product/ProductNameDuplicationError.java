package Exception.product;
import Exception.ApptiveProjectException;
import Exception.Errorcode;


public class ProductNameDuplicationError extends ApptiveProjectException {
  public ProductNameDuplicationError(){
    super(String.valueOf(Errorcode.PRODUCT_NAME_DUPLICATION_ERROR));
  }
}
