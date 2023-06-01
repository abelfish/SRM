import axios from 'axios';
import { useEffect, useState } from 'react';
import IProduct from './IProduct';
export default function Products() {
  const [products, setProducts] = useState([]);

  useEffect(() => {
    axios
      .get('http://localhost:8080/products')
      .then((response) => {
        console.log(response.data);
        setProducts(response.data);
      })
      .catch((error) => {
        console.log(error);
      });
  }, []);

  return (
    <div>
      <h1 className="text-3xl font-bold">Products</h1>
      <div className="overflow-x-auto">
        <table className="border-separate table-auto border-slate-800 border-spacing-4">
          {/* head */}
          <thead>
            <tr>
              <th>Number</th>
              <th>Product Number</th>
              <th>Product Name</th>
              <th>Unit Price</th>
              <th>QuantityInStock</th>
              <th>Supplier Name</th>
              <th>Date Supplied</th>
            </tr>
          </thead>
          <tbody>
            {products.map((product: IProduct, key) => {
              return (
                <tr>
                  <th>{key + 1}</th>
                  <td>{product.productId}</td>
                  <td>{product.productName}</td>
                  <td>{product.unitPrice}</td>
                  <td>{product.quantityInStock}</td>
                  <td>{product.supplier.supplierName}</td>
                  <td>{product.dateSupplied}</td>
                </tr>
              );
            })}
          </tbody>
        </table>
      </div>
    </div>
  );
}
