import { Link, Route, Routes } from 'react-router-dom';
import Products from './components/Products';
import Suppliers from './components/Suppliers';
import Home from './components/Home';

function App() {
  return (
    <>
      <div className="px-32 py-5 text-white bg-blue-500 navbar">
        <Link to="/" className="mr-10 text-xl">
          Welcome to WallyMarty!!
        </Link>
        <Link to="/products" className="mr-10 text-xl">
          Products
        </Link>
        <Link to="/suppliers" className="text-xl ">
          Suppliers
        </Link>
      </div>
      <div className="px-10 pt-10">
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/products" element={<Products />} />
          <Route path="/suppliers" element={<Suppliers />} />;
        </Routes>
      </div>
    </>
  );
}
export default App;
