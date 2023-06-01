import axios from 'axios';
import { useEffect, useState } from 'react';
import { ISupplier } from './ISupplier';

function Suppliers() {
  const [suppliers, setSuppliers] = useState([]);

  useEffect(() => {
    axios
      .get('http://localhost:8080/suppliers')
      .then((response) => {
        console.log(response.data);
        setSuppliers(response.data);
      })
      .catch((error) => {
        console.log(error);
      });
  }, []);

  return (
    <div>
      <h1 className="text-3xl font-bold">Suppliers</h1>

      <div>
        <div className="overflow-x-auto">
          <table className="border-separate table-auto border-slate-800 border-spacing-4">
            {/* head */}
            <thead>
              <tr>
                <th>Number</th>
                <th>Supplier Id</th>
                <th>Supplier Name</th>
                <th>Supplier Phone</th>
              </tr>
            </thead>
            <tbody>
              {suppliers.map((supplier: ISupplier, key) => {
                return (
                  <tr>
                    <th>{key + 1}</th>
                    <td>{supplier.suppplierId}</td>
                    <td>{supplier.supplierName}</td>
                    <td>{supplier.contactPhone}</td>
                  </tr>
                );
              })}
            </tbody>
          </table>
        </div>
      </div>
    </div>
  );
}

export default Suppliers;
