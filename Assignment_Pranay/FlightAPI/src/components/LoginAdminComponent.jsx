import React, { useState } from "react";
import { Link } from "react-router-dom";


function LoginUserComponent(props) {
    const [userName, setuserName] = useState("");
    const [ password, setPassword] = useState("");
    async function login(){
        console.log(userName, password)

        // let item = { userName , password }
        
        let result= await fetch(`http://localhost:8080/admin/login_admin/?userValue=${userName}`, {
            method: 'POST',
            headers: {
                "Content-type": "application/json",
                "Accept" : 'application/json'
            },
            body: password
        }).then((res)=>{
            props.history.push('/')
        })
        
        result = await result.json()
        console.log(JSON.stringify(result))
        // localStorage.setItem("user-info", JSON.stringify(result))
        // history.push('/')

    }

    return (
       <div className="font">
           <h1 style={{textAlign: 'center'}}>Login</h1>

           <div className="col-sm-6 offset-sm-3">

           <input type="text" placeholder="User Name" onChange={(event)=>setuserName(event.target.value) } className="form-control"/>
           <br />
           <input type="password" placeholder="Password" onChange={(event)=> setPassword(event.target.value)} className="form-control"/>
            <br />
            <button onClick={login} className="btn btn-primary">Login</button>
            <Link to="/users">
            <button className="btn btn-danger"  style={{marginLeft: "10px"}}>Cancel</button>
            </Link>
           </div>
       
       </div>
    )
}

export default LoginUserComponent