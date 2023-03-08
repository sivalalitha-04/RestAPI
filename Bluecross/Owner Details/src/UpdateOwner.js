import { useLocation, useNavigate } from "react-router-dom";
import React, { useState, useEffect } from 'react';
import axios from "axios";
import UpdateStyle from './UpdateStyle.css';
function UpdateMethod() {
    const navigate =useNavigate();

    const[id,setId]=useState();
    const[firstname,setFirstName]=useState();
    const[lastname,setLastName]=useState();
    const[email,setEmail]=useState();
    const[mobileNumber,setMobileNumber]=useState();
    const[area,setArea]=useState();
    const[city,setCity]=useState();
    const[pincode,setPincode]=useState();
    const[profession,setProfession]=useState();
    const[adoptedAnimal,setAdoptedAnimal]=useState();

    useEffect(() => {
        axios.get(`http://localhost:8080/owner/${location.state.id}`)
        .then( res =>{
            console.log(res.data)
            setId(res.data.id);
            setFirstName(res.data.firstname);
            setLastName(res.data.lastname)
            setEmail(res.data.email);
            setMobileNumber(res.data.mobileNumber);
            setArea(res.data.area);
            setCity(res.data.city);
            setPincode(res.data.pincode);
            setProfession(res.data.profession);
            setAdoptedAnimal(res.data.adoptedAnimal);
        })
    }, []);

    async function validateUser(e){
        e.preventDefault();
       await axios.post("http://localhost:8080/owner/Create",{
        id:location.state.id,
        firstname:firstname,
        lastname:lastname,
        email:email,
        mobileNumber:mobileNumber,
        area:area,
        city:city,
        pincode:pincode,
        profession:profession,
        adoptedAnimal:adoptedAnimal
        }
        )
        .then(r=>{

          alert("success");
        })
        setId();
            setFirstName();
            setLastName();
            setEmail();
            setMobileNumber();
            setArea();
            setCity();
            setPincode();
            setProfession();
            setAdoptedAnimal();
        navigate("/")
    
    }
    console.log(firstname)
    const location=useLocation();
    return ( 
        <>
            {firstname&&
                <>
                <div className="updatedetails">
                <form>
                  {/* <h1>{location.state.id}</h1> */}
                    <h3>Edit {firstname}</h3>
                        <div className="mb-3">
                        <input type="text" className="form-control" placeholder="FirstName" 
                        value={firstname}
                            onChange={(e)=>setFirstName(e.target.value)}/>
                        </div>

                        <div className="mb-3">
                        <input type="text" className="form-control" placeholder="LastName"
                        value={lastname}
                            onChange={(e)=>setLastName(e.target.value)}/>
                        </div>

                        <div className="mb-3">
                        <input type="email" className="form-control" placeholder="email" 
                        value={email}
                            onChange={(e)=>setEmail(e.target.value)}/>
                        </div>

                        <div className="mb-3">
                        <input
                            type="text"
                            className="form-control"
                            placeholder="MobileNumber"
                            value={mobileNumber}
                            onChange={(e)=>setMobileNumber(e.target.value)}/>
                        </div>

                        <div className="mb-3">
                        <input
                            type="text"
                            className="form-control"
                            placeholder="city"
                            value={city}
                            onChange={(e)=>setCity(e.target.value)}/>
                        </div>
                        <div className="mb-3">
                        <input
                            type="text"
                            className="form-control"
                            placeholder="area"
                            value={area}
                            onChange={(e)=>setArea(e.target.value)}/>
                        </div>
                        <div className="mb-3">
                        <input
                            type="text"
                            className="form-control"
                            placeholder="pincode"
                            value={pincode}
                            onChange={(e)=>setPincode(e.target.value)}/>
                        </div>
                        <div className="mb-3">
                        <input
                            type="text"
                            className="form-control"
                            placeholder="profession"
                            value={profession}
                            onChange={(e)=>setProfession(e.target.value)}/>
                        </div>
                        <div className="mb-4">
                        <input
                            type="text"
                            className="form-control"
                            placeholder="AdoptedAnimal"
                            value={adoptedAnimal}
                            onChange={(e)=>setAdoptedAnimal(e.target.value)}/>
                        </div>
                        <button type="submit" onClick={validateUser}>Submit</button>
                    </form>
                    </div>
                </>
            }
        </>
     );
}

export default UpdateMethod;