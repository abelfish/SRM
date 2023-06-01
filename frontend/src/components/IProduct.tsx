import { ISupplier } from "./ISupplier";

export default interface Product {
  productId: String;
  productName: String;
  unitPrice: number;
  quantityInStock: number;
  supplier: ISupplier;
  dateSupplied: String;
}
