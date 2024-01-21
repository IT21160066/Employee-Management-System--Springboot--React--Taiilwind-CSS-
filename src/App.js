import { BrowserRouter, Route, Routes } from "react-router-dom";
import "./App.css";
import AddEmployee from "./components/AddEmployee";
import Navbar from "./components/Navbar";
import EmployeeList from "./components/EmployeeList";

function App() {
  return (
    <>
      <BrowserRouter>
        <Navbar />
        <Routes>
          <Route path="/" element={<EmployeeList />}></Route>
          <Route index element={<EmployeeList />}></Route>
          <Route path="/empList" element={<EmployeeList />}></Route>
          <Route path="/add" element={<AddEmployee />}></Route>
        </Routes>
      </BrowserRouter>
    </>
  );
}

export default App;
