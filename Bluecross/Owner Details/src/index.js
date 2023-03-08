import React from 'react';
import ReactDOM from 'react-dom/client';
// import DeleteMethod from './DeleteOwner';
// import GetMethod from './GetOwner';
import Home from './Home';
import './index.css';
// import App from './App';
import reportWebVitals from './reportWebVitals';
// import Disp from './Routing';
import Disp from './Routing';
import UpdateMethod from './UpdateOwner';
// import UpdateMethod from './UpdateOwner';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <Disp/>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
