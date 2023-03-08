import React, {useState} from "react";
import Style from './Style.css';
import axios from "axios";

function Registration() {
    const url="http://localhost:8080/owner/Create"
    const [data, setData] = useState({
        firstname:"",
        lastname:"",
        email:"",
        mobileNumber:"",
        area:"",
        city:"",
        pincode:"",
        profession:"",
        adoptedAnimal:""
    })

    function submit(e){
        const obj = {
            firstname:data.firstname,
            lastname:data.lastname,
            email:data.email,
            mobileNumber:data.mobileNumber,
            area:data.area,
            city:data.city,
            pincode:data.pincode,
            profession:data.profession,
            adoptedAnimal:data.adoptedAnimal
        }
        e.preventDefault();
        axios.post(url,obj)
        .then(res => {
            console.log(obj)
        })
    }

    function handle(e){
        const newdata={...data}
        newdata[e.target.id]=e.target.value
        setData(newdata)
        console.log(newdata)
    }
    return ( 
        
        <div className="main">
            <div className="form">
                <div>

                <h1>Registration Page</h1>
                <form onSubmit={(e)=>submit(e)}>
                <div className="text-border">
                    <input onChange={(e)=> handle(e)}  type="text" id="firstname" value={data.firstName} placeholder="firstname"/>
                </div>
                <div className="text-border">
                    <input onChange={(e)=>{handle(e)}}type="text" id="lastname" 
                    value={data.lastName} placeholder="lastname"/>
                </div>
                <div className="text-border">
                    <input onChange={(e)=>{handle(e)}}type="email" id="email" 
                    value={data.email} placeholder="email"/>
                </div>
                <div className="text-border">
                    <input onChange={(e)=>{handle(e)}}type="text" id="mobileNumber" 
                    value={data.mobileNumber} placeholder="mobilenumber"/>
                </div>
                <div className="text-border">
                    <input onChange={(e)=>{handle(e)}}type="text" id="area" 
                    value={data.area} placeholder="area"/>
                </div>
                <div className="text-border">
                    <input onChange={(e)=>{handle(e)}}type="text" id="city" 
                    value={data.city} placeholder="city"/>
                </div>
                <div className="text-border">
                    <input onChange={(e)=>{handle(e)}}type="text" id="pincode" 
                    value={data.pincode} placeholder="pincode"/>
                </div>
                <div className="text-border">
                    <input onChange={(e)=>{handle(e)}}type="text" id="profession" 
                    value={data.profession} placeholder="Profession"/>
                </div>
                <div className="text-border">
                    <input onChange={(e)=>{handle(e)}}type="text" id="adoptedAnimal" 
                    value={data.adoptedAnimal} placeholder="AdoptedAnimal"/>
                </div>
                <div className="but">
                <button>Register</button>
                </div>
        </form>
                </div>
            </div>
        </div>
     );
}

export default Registration;