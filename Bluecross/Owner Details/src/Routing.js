// import ReactDOM from "react-dom/client";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import DeleteMethod from "./DeleteOwner";
import GetMethod from "./GetOwner";
import Home from "./Home";
import Registration from "./PostOwner";
import UpdateMethod from "./UpdateOwner";


export default function Disp() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<Home/>} />
        {/* <Route path="/" element={<Home/>}> */}
          
          <Route path="/add" element={<Registration/>} />
          <Route path="/view" element={<GetMethod/>} />
          <Route path="/edit" element={<UpdateMethod/>} />
          <Route path="/delete" element={<DeleteMethod/>} />
      </Routes>
    </Router>
  );
}