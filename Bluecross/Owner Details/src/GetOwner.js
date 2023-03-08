import React from 'react'
import {useState,useEffect} from 'react';
// import { AxiosContext } from 'react-axios/lib/components/AxiosProvider';
import { useLocation } from 'react-router-dom';
import axios from 'axios';
import Getstyle from './Getstyle.css';

export default function GetMethod() {
    const location=useLocation();
    const[value,setValue]=useState();
    useEffect(()=>{
        axios.get(`http://localhost:8080/owner/${location.state.id}`)
        .then((res)=>{
        setValue(res.data);
        console.log(value)}

        )
    },[])
  return (
    <>{
        value&&<>
        <div className='getdetails'>
        <h2 id='details'>DETAILS ID-{value.id}</h2>
        {/* <h3>FACULTY ID     : {value.id}</h3> */}
        <h5>ID : {value.id}</h5>
        <h5>FIRSTNAME : {value.firstname}</h5>
        <h5>LASTNAME : {value.lastname}</h5>
        <h5>E-MAIL : {value.email}</h5>
        <h5>MOBILE NUMBER : {value.mobileNumber}</h5>
        <h5>AREA : {value.area}</h5>
        <h5>CITY : {value.city}</h5>
        <h5>PINCODE: {value.pincode}</h5>
        <h5>PROFESSION : {value.profession}</h5>
        <h5>ADOPTEDANIMAL : {value.adoptedAnimal}</h5>
        </div>
        </>
    }
    </>
  )
}