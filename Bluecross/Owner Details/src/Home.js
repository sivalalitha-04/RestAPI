import React,{useState,useEffect} from 'react';
import axios from 'axios';
import {useNavigate} from 'react-router-dom';
import footprint from './images/dogfp.jpg';
// import "./UserComponent.css";
import Homestyle from './Homestyle.css';

export default function Home() {
    const navigate=useNavigate();
    const[data,setData]=useState([])
    useEffect(() => {
        axios.get("http://localhost:8080/owner")
        .then((response)=>{
            setData(response.data);
            console.log(response.data)
        })
    }, []);
  return (
    // <h1>Hello</h1>
    <>
    <h1>Owner Details   
    <button className='add' onClick={()=>{
        navigate('/add')
    }}>Add</button></h1>
    <div className='table'>
    <table>
        <thead>
            <tr>
              <th>ID</th>
                <th>Name</th>
                <th>AdoptedAnimal</th>
                <th>Action</th>
            </tr>
        </thead><br></br>
        <tbody>
            {
                data.map(
                    e=>
                    <tr key={e.id}>
                      <td>{e.id}</td>
                        <td>{e.firstname}{e.lastname}  </td>
                        <td>{e.adoptedAnimal} </td>
                        <img src={footprint} alt="email" className="footprint"/>
                        <button id='one' onClick={()=>navigate('/view',{state:{id:e.id}})}>View</button>
                        <img src={footprint} alt="email" className="footprint"/>
                        <button id='two' onClick={()=>navigate('/edit',{state:{id:e.id}})}>Edit</button>
                        <img src={footprint} alt="email" className="footprint"/>
                        <button id='three' onClick={()=>navigate('/delete',{state:{id:e.id}})}>Delete</button>
                        <br></br>
                    </tr>
                )
            }
        </tbody>
    </table>
    </div>
    </>
  )
}

