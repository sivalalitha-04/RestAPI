import React from 'react'
// import { AxiosContext } from 'react-axios/lib/components/AxiosProvider';
import { useLocation,useNavigate } from 'react-router-dom';
import axios from 'axios';
import { useEffect } from 'react';
import Home from './Home';

export default function DeleteMethod() {
    const navigate=useNavigate();
    const location=useLocation();
    const key=location.state.id;
    useEffect(()=>{
        axios.delete(`http://localhost:8080/owner/${key}`)
        navigate('/')
    },[])
    console.log(key)
    return (
    <>
    {<Home/>}
    </>
  )
}